package app.vehiclemonitor.features.addeditvehicle;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.Toolbar;

import app.vehiclemonitor.R;
import app.vehiclemonitor.app.VMApp;
import app.vehiclemonitor.core.VMBaseActivity;
import app.vehiclemonitor.features.addeditvehicle.di.AddEditVehicleActivityComponent;
import app.viperalpha.di.activity.BaseActivityModule;

public class AddEditVehicleActivity extends VMBaseActivity<AddEditVehicleActivityComponent> {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

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
		getSupportFragmentManager().beginTransaction().add(R.id.container, AddEditVehicleFragment.newInstance()).commit();
	}

	@NonNull
	@Override
	protected AddEditVehicleActivityComponent createComponent() {
		return ((VMApp) getApplication()).component().injectAddEditVehicleActivity(new BaseActivityModule(this));
	}

	@Override
	public void inject() {
		component().inject(this);
	}

}
