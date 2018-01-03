package viperalpha.di.app;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = BaseApplicationModule.class)
@Singleton
public interface BaseApplicationComponent {

	Application getApplication();

	@ForApplication
	Context getApplicationContext();

	SharedPreferences getSharedPreferences();
}
