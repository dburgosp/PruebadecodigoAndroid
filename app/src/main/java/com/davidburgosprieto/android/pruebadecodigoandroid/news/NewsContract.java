package com.davidburgosprieto.android.pruebadecodigoandroid.news;

import android.widget.ImageView;
import android.widget.TextView;

import com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.list.Ct;
import com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.list.News;

import java.util.ArrayList;

public interface NewsContract {
    interface View {
        void showProgress();

        void hideErrMsg();

        void showNewsList(ArrayList<Ct> cts);

        void hideNewsList();

        void hideProgress();

        void showError(String error);

        void initNewsList();

        void showMainNews();

        void hideMainNews();

        void setMainNewsListener(Ct ct);
    }

    interface Presenter {
        void start();
    }

    interface Navigator {
        void gotoDetails(Ct view);
    }

    interface News {
        ImageView getNewsImage();

        TextView getNewsTitle();

        TextView getNewsCintillo();

        TextView getNewsAuthor();

        TextView getNewsDate();
    }
}
