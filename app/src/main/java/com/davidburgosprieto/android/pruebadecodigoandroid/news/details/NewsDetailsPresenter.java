package com.davidburgosprieto.android.pruebadecodigoandroid.news.details;

import android.content.Context;
import android.text.Html;
import android.view.View;

import com.davidburgosprieto.android.pruebadecodigoandroid.common.presenter.BasePresenter;
import com.davidburgosprieto.android.pruebadecodigoandroid.common.presenter.Callback;
import com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.details.NewsDetails;
import com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.details.Firma;
import com.davidburgosprieto.android.pruebadecodigoandroid.news.NewsInteractor;

public class NewsDetailsPresenter extends BasePresenter<NewsDetailsContract.View>
        implements NewsDetailsContract.Presenter {

    private NewsInteractor interactor;

    /**
     * Public constructor.
     *
     * @param context is the {@link Context} of the view that instantiates this class.
     * @param view    is the ViewType view that instantiates this class.
     */
    public NewsDetailsPresenter(Context context, NewsDetailsContract.View view) {
        super(context, view);

        // Create interactor.
        interactor = new NewsInteractor(context);
    }

    /* ********************************************* */
    /*  NewsDetailsContract.Presenter implementation */
    /* ********************************************* */

    @Override
    public void start(String url) {
        mView.showProgress();
        mView.hideErrMsg();

        // Ask interactor for the news details.
        url = url.replace("html", "json");
        interactor.getNewsDetails(url, new Callback<NewsDetails>() {
            @Override
            public void returnResult(NewsDetails details) {
                // Interactor has replied successfully.
                mView.hideProgress();
                showNewsDetails((NewsDetailsContract.NewsDetails) mView, details);
            }

            @Override
            public void returnError(String error) {
                // Interactor has replied unsuccessfully.
                mView.hideProgress();
                mView.showError(error);
            }
        });
    }

    /* ************** */
    /* Helper methods */
    /* ************** */

    /**
     * Displays news information into a View.
     *
     * @param view    is the {@link NewsDetailsContract.NewsDetails} View to hold the news info.
     * @param details is the {@link NewsDetails} news details.
     */
    public void showNewsDetails(NewsDetailsContract.NewsDetails view, NewsDetails details) {
        // Write cintillo.
        if (details.getCintillo() != null && !details.getCintillo().equals(""))
            view.getNewsCintillo().setText(details.getCintillo());
        else if (details.getSeccion() != null && !details.getSeccion().equals(""))
            view.getNewsCintillo().setText(details.getSeccion());
        else
            view.getNewsCintillo().setVisibility(View.GONE);

        // Write antetitulo.
        if (details.getAntetitulo() != null && !details.getAntetitulo().equals(""))
            view.getNewsAntetitulo().setText(details.getAntetitulo());
        else
            view.getNewsAntetitulo().setVisibility(View.GONE);

        // Write title.
        if (details.getTitulo() != null && !details.getTitulo().equals(""))
            view.getNewsTitle().setText(details.getTitulo());

        // Draw first news image and subtitle.
        if (details.getMultimedia() != null && details.getMultimedia().size() > 0) {
            boolean found = false;
            int index = 0;
            while (!found && index < details.getMultimedia().size()) {
                if (details.getMultimedia().get(index).getType().equals("image") &&
                        !details.getMultimedia().get(index).getUrl().equals(""))
                    found = true;
                else
                    index++;
            }
            if (found) {
                loadImage(details.getMultimedia().get(index).getUrl(), view.getNewsImage());
                if (details.getMultimedia().get(index).getTitulo() != null &&
                        !details.getMultimedia().get(index).getTitulo().equals(""))
                    view.getNewsImageTitle().setText(details.getMultimedia().get(index).getTitulo());
                else
                    view.getNewsImageTitle().setVisibility(View.GONE);
            }
        }

        // Write news author.
        if (details.getFirmas() != null && details.getFirmas().size() > 0) {
            StringBuilder authors = new StringBuilder();
            for (Firma author : details.getFirmas()) {
                if (authors.toString().equals(""))
                    authors = new StringBuilder(author.getName());
                else
                    authors.append(", ").append(author.getName());
            }
            view.getNewsAuthor().setText(authors.toString());
        }

        // Write news date.
        if (details.getPublishedAt() != null && !details.getPublishedAt().equals(""))
            view.getNewsDate().setText(details.getPublishedAt());

        // Write news text.
        if (details.getTexto() != null && !details.getTexto().equals(""))
            view.getNewsText().setText(Html.fromHtml(details.getTexto()));
    }
}
