package viperalpha.di.app;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BaseApplicationModule {

	private final Application application;

	public BaseApplicationModule(Application application) {
		this.application = application;
	}

	@Provides
	@Singleton
	@ForApplication
	public Context provideApplicationContext() {
		return application.getApplicationContext();
	}

	@Provides
	@Singleton
	public Application provideApplication() {
		return application;
	}

	@Provides
	@Singleton
	public SharedPreferences provideSharedPreferences() {
		return application.getSharedPreferences(application.getPackageName(), Context.MODE_PRIVATE);
	}

}
