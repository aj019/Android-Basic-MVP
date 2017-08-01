package in.androidmate.notes_mvp.activities.nav;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.androidmate.notes_mvp.R;

public class NavigationActivity extends AppCompatActivity implements NavigationMVP.NavView {

    NavigationMVP.NavPresenter mPrsenter;

    @BindView(R.id.navigation_view)
    NavigationView nav_view;

    @BindView(R.id.container)
    FrameLayout frameLayout;

    @BindView(R.id.drawer)
    DrawerLayout drawerLayout;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    View mHeaderView;
    private Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        ButterKnife.bind(this);

        setupNavigationBar();

    }

    private void setupNavigationBar() {





    }
}
