package app.viperalpha.core;

import android.app.Application;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;

import app.viperalpha.di.Injector;

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

	@NonNull
	protected abstract T createComponent();
}
