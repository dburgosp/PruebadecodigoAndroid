package com.davidburgosprieto.android.pruebadecodigoandroid.news;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;

import com.davidburgosprieto.android.pruebadecodigoandroid.common.model.BaseInteractor;
import com.davidburgosprieto.android.pruebadecodigoandroid.common.presenter.Callback;
import com.davidburgosprieto.android.pruebadecodigoandroid.common.utils.NetworkUtils;
import com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.details.NewsDetails;
import com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.list.News;
import com.google.gson.Gson;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class NewsInteractor extends BaseInteractor {

    /**
     * Public constructor.
     *
     * @param context is the Context of the calling View.
     */
    public NewsInteractor(Context context) {
        super(context);
    }

    /* ************** */
    /* Public methods */
    /* ************** */

    /**
     * Create an {@link Single} Observable for retrieving the news list.
     *
     * @param callback is the {@link Callback <News>} object that is going to receive the result
     *                 of this API call.
     */
    @SuppressLint("CheckResult")
    public void getNews(Callback<News> callback) {
        // Create the Observable.
        Single<News> news = mApiService.getNews();

        // Observe for results.
        news.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<News>() {
                    @Override
                    public void onSuccess(News result) {
                        callback.returnResult(result);
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.returnError(e.getMessage());
                    }
                });
    }

    /**
     * Create an {@link Single} Observable for retrieving the news details.
     *
     * @param url      is the path of the JSON data.
     * @param callback is the {@link Callback <NewsDetails>} object that is going to receive the result
     *                 of this API call.
     */
    @SuppressLint("CheckResult")
    public void getNewsDetails(String url, Callback<NewsDetails> callback) {
        // Create the Observable.
        Single<NewsDetails> newsDetails = Single.create(emitter -> {
            Thread thread = new Thread(() -> {
                Uri builtUri = Uri.parse(url).buildUpon().build();
                try {
                    String responseJSONString = NetworkUtils.getJSONresponse(builtUri);
                    emitter.onSuccess(new Gson().fromJson(responseJSONString, NewsDetails.class));
                } catch (Exception e) {
                    emitter.onError(e);
                }
            });
            thread.start();
        });

        // Observe for results.
        newsDetails.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<NewsDetails>() {
                    @Override
                    public void onSuccess(NewsDetails result) {
                        callback.returnResult(result);
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.returnError(e.getMessage());
                    }
                });
    }
}
