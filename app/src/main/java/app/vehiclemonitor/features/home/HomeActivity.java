package app.vehiclemonitor.features.home;

import android.os.Bundle;
import android.support.annotation.NonNull;

import app.vehiclemonitor.R;
import app.vehiclemonitor.app.VMApp;
import app.vehiclemonitor.core.VMBaseActivity;
import app.viperalpha.di.activity.BaseActivityModule;

public class HomeActivity extends VMBaseActivity<HomeActivityComponent> {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTheme(R.style.AppTheme); // é preciso resetar o tema que era usado para Splash Screen.

		setContentView(R.layout.activity_home);
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
