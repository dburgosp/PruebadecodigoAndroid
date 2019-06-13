package com.davidburgosprieto.android.pruebadecodigoandroid.common.model;

import android.content.Context;
import android.widget.ImageView;

import com.davidburgosprieto.android.pruebadecodigoandroid.R;
import com.davidburgosprieto.android.pruebadecodigoandroid.common.BaseMVP;
import com.davidburgosprieto.android.pruebadecodigoandroid.data.api.ApiClient;
import com.davidburgosprieto.android.pruebadecodigoandroid.data.api.ApiService;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

public class BaseInteractor implements BaseMVP.Interactor {

    /* **************** */
    /* Member variables */
    /* **************** */

    private Picasso mPicasso;
    private Context mContext;
    public ApiService mApiService;

    /**
     * Public constructor.
     *
     * @param context is the Context of the calling View.
     */
    public BaseInteractor(Context context) {
        mContext = context;

        // Specify the unsafe HTTP client from the API client as the Downloader that will be used
        // for downloading images using {@link Picasso}, in order to avoid errors while getting
        // images from a https url.
        mPicasso = new Picasso.Builder(mContext)
                .downloader(new OkHttp3Downloader(ApiClient.getUnsafeOkHttpClient().build()))
                .build();

        // Create the API client.
        mApiService = ApiClient.getClient().create(ApiService.class);
    }

    /* ********************************* */
    /* BaseMVP.Interactor implementation */
    /* ********************************* */

    /**
     * Load an image from the internet using a CustomPicasso object created from Picasso library.
     *
     * @param imagePath     is the url to retrieve the image from.
     * @param imageView     is the ImageView in which we want to load the image.
     * @param drawableResId is the drawable resource id to show when there has been an error while
     *                      retrieving the image from internet.
     */
    @Override
    public void loadImage(String imagePath, ImageView imageView, int drawableResId) {
        mPicasso.load(imagePath).placeholder(drawableResId).error(drawableResId).into(imageView);
    }

    /**
     * Overloaded method to load an image from the internet using a CustomPicasso object created
     * from Picasso library, with no default image to load if an error happens.
     *
     * @param imagePath is the url to retrieve the image from.
     * @param imageView is the ImageView in which we want to load the image.
     */
    @Override
    public void loadImage(String imagePath, ImageView imageView) {
        mPicasso.load(imagePath).into(imageView);
    }
}
