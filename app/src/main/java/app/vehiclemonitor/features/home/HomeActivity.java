package app.vehiclemonitor.features.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.Toolbar;

import app.vehiclemonitor.R;
import app.vehiclemonitor.app.VMApp;
import app.vehiclemonitor.core.VMBaseActivity;
import app.vehiclemonitor.features.home.di.HomeActivityComponent;
import app.viperalpha.di.activity.BaseActivityModule;

public class HomeActivity extends VMBaseActivity<HomeActivityComponent> {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTheme(R.style.AppTheme); // é preciso resetar o tema que era usado para Splash Screen.

		setContentView(R.layout.activity_home);

		setupToolbar();

		if (savedInstanceState == null) {
			addFragment();
		}
	}

	private void setupToolbar() {
		Toolbar toolbar = findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
	}

	private void addFragment() {
		getSupportFragmentManager().beginTransaction().add(R.id.container, HomeFragment.newInstance()).commit();
	}

	@NonNull
	@Override
	protected HomeActivityComponent createComponent() {
		return ((VMApp) getApplication()).component().injectHomeActivity(new BaseActivityModule(this));
	}

	@Override
	public void inject() {
		component().inject(this);
	}

}
