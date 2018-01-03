package app.vehiclemonitor.app;

import android.support.annotation.NonNull;

import com.squareup.leakcanary.LeakCanary;

import app.viperalpha.core.BaseApplication;
import app.viperalpha.di.app.BaseApplicationModule;

/**
 * Created on 02/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

public class VMApp extends BaseApplication<VMAppComponent> {

	@Override
	public void onCreate() {
		super.onCreate();
		initialize();
	}

	private void initialize() {
		initLeakCanary();
	}

	private void initLeakCanary() {
		if (!LeakCanary.isInAnalyzerProcess(this)) {
			LeakCanary.install(this);
		}
	}

	@NonNull
	@Override
	protected VMAppComponent createComponent() {
		//noinspection deprecation Dagger anota como deprecated pois ainda não foi utilizado.
		return DaggerVMAppComponent.builder().baseApplicationModule(new BaseApplicationModule(this)).build();
	}


	@Override
	public void inject() {
		component().inject(this);
	}
}
