package viperalpha.di.activity;

import android.content.Context;

import dagger.Component;

@ActivityScope
@Component(modules = BaseActivityModule.class)
public interface BaseActivityComponent {

	android.app.Activity getActivity();

	@ForActivity
	Context getActivityContext();
}
