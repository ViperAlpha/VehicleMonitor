package app.vehiclemonitor.core;

import android.support.annotation.CallSuper;

import app.viperalpha.core.BaseApplication;
import app.viperalpha.di.Injector;
import app.viperalpha.logging.LogUtils;

/**
 * A base Application which provides a dependency injection mechanism.
 *
 * @param <T> The DI component class
 */
public abstract class VMBaseApplication<T> extends BaseApplication<T> implements Injector<T> {

	@CallSuper
	@Override
	public void onCreate() {
		super.onCreate();
		LogUtils.logMethod("(onCreate)");
	}
}
