package com.davidburgosprieto.android.pruebadecodigoandroid.news;

import android.content.Context;
import android.view.View;

import com.davidburgosprieto.android.pruebadecodigoandroid.common.presenter.BasePresenter;
import com.davidburgosprieto.android.pruebadecodigoandroid.common.presenter.Callback;
import com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.list.Ct;
import com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.list.Firma;
import com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.list.News;

import java.util.ArrayList;

public class NewsPresenter extends BasePresenter<NewsContract.View>
        implements NewsContract.Presenter {

    private NewsInteractor interactor;

    /**
     * Public constructor.
     *
     * @param context is the {@link Context} of the view that instantiates this class.
     * @param view    is the ViewType view that instantiates this class.
     */
    public NewsPresenter(Context context, NewsContract.View view) {
        super(context, view);

        // Create interactor.
        interactor = new NewsInteractor(mContext);
    }

    /* ************************************* */
    /* NewsContract.Presenter implementation */
    /* ************************************* */

    @Override
    public void start() {
        mView.initNewsList();
        mView.showProgress();
        mView.hideMainNews();
        mView.hideNewsList();
        mView.hideErrMsg();

        // Ask interactor for the news list.
        interactor.getNews(new Callback<News>() {
            @Override
            public void returnResult(News news) {
                // Interactor has replied successfully.
                mView.hideProgress();
                // Displays main news into the View.
                showMainNews((NewsContract.News) mView, news.getCts().get(0));
                mView.setMainNewsListener(news.getCts().get(0));
                mView.showMainNews();

                // Displays other news list into the View.
                ArrayList<Ct> otherNews = new ArrayList<>(news.getCts());
                otherNews.remove(0);
                mView.showNewsList(otherNews);
            }

            @Override
            public void returnError(String error) {
                // Interactor has replied unsuccessfully.
                mView.hideProgress();
                mView.showError(error);
            }
        });
    }

    /* ************** */
    /* Helper methods */
    /* ************** */

    /**
     * Displays news information into a View.
     *
     * @param view is the {@link NewsContract.News} View to hold the news info.
     * @param ct   is the {@link Ct} news info.
     */
    public void showMainNews(NewsContract.News view, Ct ct) {
        // Draw first news image.
        if (ct.getMultimedia() != null && ct.getMultimedia().size() > 0) {
            boolean found = false;
            int index = 0;
            while (!found && index < ct.getMultimedia().size()) {
                if (ct.getMultimedia().get(index).getType().equals("image") &&
                        !ct.getMultimedia().get(index).getUrl().equals(""))
                    found = true;
                else
                    index++;
            }
            if (found)
                loadImage(ct.getMultimedia().get(index).getUrl(), view.getNewsImage());
        }

        // Write cintillo.
        if (ct.getCintillo() != null && !ct.getCintillo().equals(""))
            view.getNewsCintillo().setText(ct.getCintillo());
        else if (ct.getSeccion() != null && !ct.getSeccion().equals(""))
            view.getNewsCintillo().setText(ct.getSeccion());
        else
            view.getNewsCintillo().setVisibility(View.GONE);

        // Write title.
        if (ct.getTitulo() != null && !ct.getTitulo().equals(""))
            view.getNewsTitle().setText(ct.getTitulo());

        // Write news author.
        if (ct.getFirmas() != null && ct.getFirmas().size() > 0) {
            StringBuilder authors = new StringBuilder();
            for (Firma author : ct.getFirmas()) {
                if (authors.toString().equals(""))
                    authors = new StringBuilder(author.getName());
                else
                    authors.append(", ").append(author.getName());
            }
            view.getNewsAuthor().setText(authors.toString());
        }

        // Write news date.
        if (ct.getPublishedAt() != null && !ct.getPublishedAt().equals(""))
            view.getNewsDate().setText(ct.getPublishedAt());
    }
}
