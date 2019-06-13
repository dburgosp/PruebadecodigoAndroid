package com.davidburgosprieto.android.pruebadecodigoandroid.data.api;

import com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.list.Ct;
import com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.list.News;

import io.reactivex.Single;
import retrofit2.http.GET;

/**
 * Public interface that define the HTTP operations / API calls for performing requests to the
 * remote webserver.
 */
public interface ApiService {

    /**
     * API call for retrieving the list of news from the server.
     *
     * @return a list of {@link Ct} objects.
     */
    @GET("1dh2hm")
    Single<News> getNews();

    // Add more HTTP operations (GET, POST...) here when required.

}
