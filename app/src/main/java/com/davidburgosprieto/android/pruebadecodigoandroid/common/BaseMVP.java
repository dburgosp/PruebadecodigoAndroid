package com.davidburgosprieto.android.pruebadecodigoandroid.common;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.davidburgosprieto.android.pruebadecodigoandroid.common.adapter.BaseAdapter;

import java.util.ArrayList;

import okhttp3.ResponseBody;

public interface BaseMVP {

    /* *************************** */
    /* Common View layer interface */
    /* *************************** */

    interface View {
        void setupToolbar(Toolbar toolbar, String title, boolean showBackArrow);

        void setupVerticalRecyclerView(RecyclerView mRecyclerView, BaseAdapter mAdapter);
    }

    interface Adapter<ViewType> {
        interface Listener<ViewType> {
            void onClick(ViewType view, int position);
        }

        void clearList();

        void addItems(ArrayList<ViewType> items, int position);

        void addItemsToEnd(ArrayList<ViewType> items);

        void addItem(ViewType item);

        void addItem(ViewType item, int layoutResId);

        void replaceList(ArrayList<ViewType> items);

        void replaceItem(int index, ViewType item);

        void removeItem(int position);

        int getLayoutResId();

        Context getContext();

        ViewType getItem(int i);
    }

    interface ViewHolder<ViewType> {
        android.view.View getView();

        void bind(Context context, final ViewType item, int position,
                  final Adapter.Listener<ViewType> listener);
    }

    /* ******************************** */
    /* Common Presenter layer interface */
    /* ******************************** */

    interface Presenter<ViewType> {
        void loadImage(String path, ImageView imageView);
    }

    interface Navigator {
        void loadActivity(Activity fromActivity, Activity toActivity);

        void loadActivity(Activity fromActivity, Activity toActivity, Bundle params);

        void loadActivityForResult(Activity fromActivity, Activity toActivity, int requestCode);

        void loadActivityForResult(Activity fromActivity, Activity toActivity, Bundle params,
                                   int requestCode);

        void loadFragment(FragmentManager fragmentManager, int containerResId, Fragment fragment);

        void loadTopFragment(FragmentManager fragmentManager, int containerResId, Fragment fragment);
    }

    /* **************************** */
    /* Common Model layer interface */
    /* **************************** */

    public interface Interactor {
        void loadImage(String imagePath, ImageView imageView);

        void loadImage(String imagePath, ImageView imageView, int drawableResId);
    }
}
