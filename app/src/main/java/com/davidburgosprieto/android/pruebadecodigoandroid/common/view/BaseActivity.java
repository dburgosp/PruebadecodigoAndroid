package com.davidburgosprieto.android.pruebadecodigoandroid.common.view;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.davidburgosprieto.android.pruebadecodigoandroid.common.BaseMVP;
import com.davidburgosprieto.android.pruebadecodigoandroid.common.adapter.BaseAdapter;

public class BaseActivity extends AppCompatActivity implements BaseMVP.View {

    /* *************************** */
    /* BaseMVP.View implementation */
    /* *************************** */

    /**
     * Init custom toolbar and sets its title.
     *
     * @param title         is the string for the toolbar title.
     * @param showBackArrow is true if we want to show the back arrow in the toolbar, false
     *                      otherwise.
     */

    @Override
    public void setupToolbar(Toolbar toolbar, String title, boolean showBackArrow) {
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(showBackArrow);
                getSupportActionBar().setDisplayShowHomeEnabled(true);
                getSupportActionBar().setTitle(title);
            }
        }
    }

    /**
     * Create the RecyclerView and set its initial state.
     *
     * @param recyclerView is the {@link RecyclerView} to be configured.
     * @param adapter      is the {@link BaseAdapter} to be set to the RecyclerView.
     */
    @Override
    public void setupVerticalRecyclerView(RecyclerView recyclerView, BaseAdapter adapter) {
        // Set vertical layout.
        int orientation = LinearLayoutManager.VERTICAL;
        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this, orientation, false);
        recyclerView.setLayoutManager(layoutManager);
        //recyclerView.setNestedScrollingEnabled(false);

        // Define the separation between list items.
        DividerItemDecoration decoration =
                new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(decoration);

        // Attach the adapter.
        recyclerView.setAdapter(adapter);
    }

    /* ************************************ */
    /* AppCompatActivity overridden methods */
    /* ************************************ */

    @Override
    public boolean onSupportNavigateUp() {
        // By default, the Up/Back button doesn’t go back to the previous activity, but launches the
        // parent instead. We override onSupportNavigateUp to call onBackPressed.
        onBackPressed();
        return true;
    }
}
