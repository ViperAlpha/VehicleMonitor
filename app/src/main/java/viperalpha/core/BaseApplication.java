package viperalpha.core;

import android.app.Application;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;

import viperalpha.di.Injector;
import viperalpha.di.app.BaseApplicationModule;
import viperalpha.di.app.DaggerBaseApplicationComponent;

/**
 * A base Application which provides a dependency injection mechanism.
 *
 * @param <T> The DI component class
 */
public abstract class BaseApplication<T> extends Application implements Injector<T> {

	private T component;

	@CallSuper
	@Override
	public void onCreate() {
		super.onCreate();
		injectModuleAndStillMakeSubOverride();
		inject();
	}

	@NonNull
	@Override
	public T component() {
		if (component == null) {
			component = createComponent();
		}
		return component;
	}

	public void injectModuleAndStillMakeSubOverride() {
		DaggerBaseApplicationComponent.builder().baseApplicationModule(new BaseApplicationModule(this)).build();
	}

	@NonNull
	protected abstract T createComponent();
}
