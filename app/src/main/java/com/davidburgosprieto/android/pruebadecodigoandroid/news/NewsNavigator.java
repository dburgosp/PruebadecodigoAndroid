package com.davidburgosprieto.android.pruebadecodigoandroid.news;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.davidburgosprieto.android.pruebadecodigoandroid.common.presenter.BaseNavigator;
import com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.list.Ct;
import com.davidburgosprieto.android.pruebadecodigoandroid.news.details.NewsDetailsActivity;

public class NewsNavigator
        extends BaseNavigator<NewsContract.View>
        implements NewsContract.Navigator {

    public NewsNavigator(Context context, NewsContract.View view) {
        super(context, view);
    }

    /* ************************************* */
    /* NewsContract.Navigator implementation */
    /* ************************************* */

    @Override
    public void gotoDetails(Ct view) {
        Activity fromActivity = (Activity) mContext;
        Activity destinationActivity = new NewsDetailsActivity();
        Bundle params = new Bundle();
        params.putString(NewsDetailsActivity.PARAM_URL, view.getUrl());
        loadActivity(fromActivity, destinationActivity, params);
    }
}
