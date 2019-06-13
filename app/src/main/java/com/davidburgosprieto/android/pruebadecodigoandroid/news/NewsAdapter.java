package com.davidburgosprieto.android.pruebadecodigoandroid.news;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.davidburgosprieto.android.pruebadecodigoandroid.R;
import com.davidburgosprieto.android.pruebadecodigoandroid.common.adapter.BaseAdapter;
import com.davidburgosprieto.android.pruebadecodigoandroid.common.adapter.BaseViewHolder;
import com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.list.Ct;
import com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.list.Firma;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsAdapter extends BaseAdapter<Ct> implements NewsContract.News {

    /* *************** */
    /* Layout elements */
    /* *************** */

    @BindView(R.id.news_image)
    ImageView mNewsImage;

    @BindView(R.id.news_cintillo)
    TextView mNewsCintillo;

    @BindView(R.id.news_title)
    TextView mNewsTitle;

    @BindView(R.id.news_author)
    TextView mNewsAuthor;

    @BindView(R.id.news_date)
    TextView mNewsdate;

    /* ************************ */
    /* Private member variables */
    /* ************************ */

    private View mView;
    private NewsPresenter mPresenter;

    /* ************************ */
    /* Private member variables */
    /* ************************ */

    private Listener<Ct> mListener;

    /**
     * Public constructor.
     *
     * @param context     is the Context of the calling activity or fragment.
     * @param listener    is the {@link Listener<Ct>} to be added to every item in the adapter.
     * @param layoutResId is the resource identifier of the layout for the {@link BaseViewHolder}
     *                    items.
     */
    public NewsAdapter(Context context, Listener<Ct> listener, int layoutResId,
                       NewsPresenter presenter) {
        super(context, 0, null, layoutResId);
        mListener = listener;
        mPresenter = presenter;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder<Ct> viewHolder, int position) {
        super.onBindViewHolder(viewHolder, position);
        mView = viewHolder.getView();
        ButterKnife.bind(this, mView);

        // Initialize all elements in this ViewHolder.
        startHolder(getItem(position), position);
    }

    /* ******************************** */
    /* NewsContract.News implementation */
    /* ******************************** */

    @Override
    public ImageView getNewsImage() {
        return mNewsImage;
    }

    @Override
    public TextView getNewsTitle() {
        return mNewsTitle;
    }

    @Override
    public TextView getNewsCintillo() {
        return mNewsCintillo;
    }

    @Override
    public TextView getNewsAuthor() {
        return mNewsAuthor;
    }

    @Override
    public TextView getNewsDate() {
        return mNewsdate;
    }

    /* ********************** */
    /* Private helper methods */
    /* ********************** */

    /**
     * Set data and listeners to the current item view elements depending on current layout resource
     * identifier.
     *
     * @param ct is the {@link Ct} object extracted from the current item.
     * @param i  is the index of the current item into the adapter.
     */
    private void startHolder(Ct ct, int i) {
        mPresenter.showMainNews(this, ct);

        // Set listener on "Add to cart" button.
        mView.setOnClickListener(view -> mListener.onClick(ct, i));
    }
}