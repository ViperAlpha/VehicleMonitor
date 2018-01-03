package app.vehiclemonitor.core;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import app.viperalpha.core.BaseFragment;
import app.viperalpha.logging.LogUtils;

/**
 * A base Fragment which provides a dependency injection mechanism.
 *
 * @param <T> The DI component class
 */
public abstract class VMBaseFragment<T> extends BaseFragment<T> {

	@CallSuper
	@Override
	public void onCreate(@Nullable final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LogUtils.logMethod("(onCreate)");
	}

	@CallSuper
	@Override
	public void onStart() {
		super.onStart();
		LogUtils.logMethod("(onStart)");
	}

	@CallSuper
	@Override
	public void onStop() {
		super.onStop();
		LogUtils.logMethod("(onStop)");
	}

	@CallSuper
	@Override
	public void onDestroy() {
		super.onDestroy();
		LogUtils.logMethod("(onDestroy)");
	}

	@CallSuper
	@Override
	public void onLowMemory() {
		super.onLowMemory();
		LogUtils.logMethod("(onLowMemory)");
	}

	@CallSuper
	@Override
	public void onSaveInstanceState(@NonNull final Bundle outState) {
		super.onSaveInstanceState(outState);
		LogUtils.logMethod("(onSaveInstanceState)");
	}

}
