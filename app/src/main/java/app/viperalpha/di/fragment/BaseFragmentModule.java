package app.viperalpha.di.fragment;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import dagger.Module;
import dagger.Provides;

@Module
public class BaseFragmentModule {

	private final Fragment fragment;

	public BaseFragmentModule(@NonNull final Fragment fragment) {
		this.fragment = fragment;
	}

	@Provides
	@FragmentScope
	Fragment provideFragment() {
		return fragment;
	}

}
