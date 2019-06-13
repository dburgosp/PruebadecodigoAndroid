package com.davidburgosprieto.android.pruebadecodigoandroid.news.details;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.davidburgosprieto.android.pruebadecodigoandroid.R;
import com.davidburgosprieto.android.pruebadecodigoandroid.common.view.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsDetailsActivity extends BaseActivity
        implements NewsDetailsContract.View, NewsDetailsContract.NewsDetails {

    public static final String PARAM_URL = "PARAM_URL";

    /* *************** */
    /* Layout elements */
    /* *************** */

    @BindView(R.id.news_progress)
    ProgressBar mProgressBar;

    @BindView(R.id.news_error)
    TextView mErrMsg;

    @BindView(R.id.news_image)
    ImageView mNewsImage;

    @BindView(R.id.news_cintillo)
    TextView mNewsCintillo;

    @BindView(R.id.news_antetitulo)
    TextView mNewsAntetitulo;

    @BindView(R.id.news_imagetitle)
    TextView mNewsImageTitle;

    @BindView(R.id.news_text)
    TextView mNewsText;

    @BindView(R.id.news_title)
    TextView mNewsTitle;

    @BindView(R.id.news_author)
    TextView mNewsAuthor;

    @BindView(R.id.news_date)
    TextView mNewsdate;

    /* ***************** */
    /* Private variables */
    /* ***************** */

    NewsDetailsPresenter mPresenter;

    /* ************************************ */
    /* AppCompatActivity overridden methods */
    /* ************************************ */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        ButterKnife.bind(this);

        if (getIntent().getExtras() != null) {
            // Get params from calling intent.
            String url = getIntent().getExtras().getString(PARAM_URL);

            // Init presenter.
            mPresenter = new NewsDetailsPresenter(this, this);
            mPresenter.start(url);
        } else {
            finish();
        }
    }

    /* *************************************** */
    /* NewsDetailsContract.View implementation */
    /* *************************************** */

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

    /* ********************************************** */
    /* NewsDetailsContract.NewsDetails implementation */
    /* ********************************************** */

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

    @Override
    public TextView getNewsAntetitulo() {
        return mNewsAntetitulo;
    }

    @Override
    public TextView getNewsImageTitle() {
        return mNewsImageTitle;
    }

    @Override
    public TextView getNewsText() {
        return mNewsText;
    }
}
