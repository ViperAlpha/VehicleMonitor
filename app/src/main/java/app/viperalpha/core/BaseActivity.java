package app.viperalpha.core;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import app.viperalpha.di.Injector;
import app.viperalpha.di.activity.BaseActivityModule;
import app.viperalpha.di.activity.DaggerBaseActivityComponent;

/**
 * A base Activity which provides a dependency injection mechanism.
 *
 * @param <T> The DI component class
 */
public abstract class BaseActivity<T> extends AppCompatActivity implements Injector<T> {

	private T component;

	@CallSuper
	@Override
	protected void onCreate(@Nullable final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		injectBaseModule();
		inject();
	}

	private void injectBaseModule() {
		DaggerBaseActivityComponent.builder().baseActivityModule(new BaseActivityModule(this));
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
