package com.davidburgosprieto.android.pruebadecodigoandroid.news;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.davidburgosprieto.android.pruebadecodigoandroid.R;
import com.davidburgosprieto.android.pruebadecodigoandroid.common.view.BaseActivity;
import com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.list.Ct;
import com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.list.News;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsActivity extends BaseActivity implements NewsContract.View, NewsContract.News {

    /* *************** */
    /* Layout elements */
    /* *************** */

    @BindView(R.id.news_progress)
    ProgressBar mProgressBar;

    @BindView(R.id.news_error)
    TextView mErrMsg;

    @BindView(R.id.news_list)
    RecyclerView mRecyclerView;

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

    @BindView(R.id.news_main)
    LinearLayout mMainNews;

    /* ***************** */
    /* Private variables */
    /* ***************** */

    NewsPresenter mPresenter;
    NewsAdapter mAdapter;
    NewsNavigator mNavigator;

    /* ************************************ */
    /* AppCompatActivity overridden methods */
    /* ************************************ */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        ButterKnife.bind(this);

        // Init presenter and navigator.
        mNavigator = new NewsNavigator(this, this);
        mPresenter = new NewsPresenter(this, this);
        mPresenter.start();
    }

    /* ******************************** */
    /* NewsContract.View implementation */
    /* ******************************** */

    @Override
    public void showProgress() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void showError(String error) {
        mErrMsg.setText(error);
        mErrMsg.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideErrMsg() {
        mErrMsg.setVisibility(View.GONE);
    }

    @Override
    public void initNewsList() {
        // Define listener for managing click events on every item into the list.
        NewsAdapter.Listener<Ct> listener = (view, position) -> mNavigator.gotoDetails(view);

        // Create adapter.
        mAdapter = new NewsAdapter(this, listener, R.layout.item_news, mPresenter);

        // Create the RecyclerView and set its initial state.
        setupVerticalRecyclerView(mRecyclerView, mAdapter);
    }

    @Override
    public void showMainNews() {
        mMainNews.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideMainNews() {
        mMainNews.setVisibility(View.GONE);
    }

    @Override
    public void setMainNewsListener(Ct ct) {
        mMainNews.setOnClickListener(view -> mNavigator.gotoDetails(ct));
    }

    @Override
    public void showNewsList(ArrayList<Ct> cts) {
        mAdapter.replaceList(cts);
        mRecyclerView.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideNewsList() {
        mRecyclerView.setVisibility(View.GONE);
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
}
