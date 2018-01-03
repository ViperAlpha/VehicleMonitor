package viperalpha.di.activity;

import android.content.Context;
import android.support.annotation.NonNull;


import dagger.Module;
import dagger.Provides;

@Module
public class BaseActivityModule {

	private final android.app.Activity activity;

	public BaseActivityModule(@NonNull final android.app.Activity activity) {
		this.activity = activity;
	}

	@Provides
	@ActivityScope
	@ForActivity
	Context provideActivityContext() {
		return activity;
	}

	@Provides
	@ActivityScope
	android.app.Activity provideActivity() {
		return activity;
	}

}
