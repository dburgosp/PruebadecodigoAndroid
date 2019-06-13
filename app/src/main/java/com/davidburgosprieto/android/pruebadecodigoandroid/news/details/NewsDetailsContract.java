package com.davidburgosprieto.android.pruebadecodigoandroid.news.details;

import android.widget.ImageView;
import android.widget.TextView;

public interface NewsDetailsContract {
    interface View {
        void showProgress();

        void hideErrMsg();

        void hideProgress();

        void showError(String error);
    }

    interface Presenter {
        void start(String url);
    }

    interface NewsDetails {
        ImageView getNewsImage();

        TextView getNewsTitle();

        TextView getNewsCintillo();

        TextView getNewsAuthor();

        TextView getNewsDate();

        TextView getNewsAntetitulo();

        TextView getNewsImageTitle();

        TextView getNewsText();
    }
}
