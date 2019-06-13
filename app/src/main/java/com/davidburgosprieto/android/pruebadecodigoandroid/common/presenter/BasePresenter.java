package com.davidburgosprieto.android.pruebadecodigoandroid.common.presenter;

import android.content.Context;
import android.widget.ImageView;

import com.davidburgosprieto.android.pruebadecodigoandroid.common.BaseMVP;
import com.davidburgosprieto.android.pruebadecodigoandroid.common.model.BaseInteractor;

public class BasePresenter<ViewType> implements BaseMVP.Presenter<ViewType> {

    /* ************************ */
    /* Private member variables */
    /* ************************ */

    public Context mContext;
    public ViewType mView;
    private BaseInteractor mInteractor;

    /**
     * Public constructor.
     *
     * @param context    is the {@link Context} of the view that instantiates this class.
     * @param view       is the ViewType view that instantiates this class.
     */
    public BasePresenter(Context context, ViewType view) {
        mContext = context;
        mInteractor = new BaseInteractor(context);
        mView = view;
    }

    /* ******************************** */
    /* BaseMVP.Presenter implementation */
    /* ******************************** */

    /**
     * Ask the interactor to retrieve and load an image given by its relative path.
     *
     * @param path      is the relative path of the image.
     * @param imageView is the ImageView to hold the image.
     */
    @Override
    public void loadImage(String path, ImageView imageView) {
        mInteractor.loadImage(path, imageView);
    }
}
