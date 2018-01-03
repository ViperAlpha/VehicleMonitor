/*
 * Copyright 2016 Futurice GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.vehiclemonitor.core;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;

import app.viperalpha.core.BaseActivity;
import app.viperalpha.logging.LogUtils;

/**
 * A base Activity which provides a dependency injection mechanism.
 *
 * @param <T> The DI component class
 */
public abstract class VMBaseActivity<T> extends BaseActivity<T> {

	@CallSuper
	@Override
	protected void onCreate(@Nullable final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LogUtils.logMethod("(onCreate)");
	}

	@CallSuper
	@Override
	protected void onStart() {
		super.onStart();
		LogUtils.logMethod("(onStart)");
	}

	@CallSuper
	@Override
	protected void onRestart() {
		super.onRestart();
		LogUtils.logMethod("(onRestart)");
	}

	@CallSuper
	@Override
	protected void onStop() {
		super.onStop();
		LogUtils.logMethod("(onStop)");
	}

	@CallSuper
	@Override
	protected void onDestroy() {
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
	protected void onSaveInstanceState(final Bundle outState) {
		super.onSaveInstanceState(outState);
		LogUtils.logMethod("(onSaveInstanceState)");
	}

	@CallSuper
	@Override
	protected void onRestoreInstanceState(final Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		LogUtils.logMethod("(onRestoreInstanceState)");
	}
}
