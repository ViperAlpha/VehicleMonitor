package app.viperalpha.di.fragment;


import android.support.v4.app.Fragment;

import dagger.Component;

@FragmentScope
@Component(modules = BaseFragmentModule.class)
public interface BaseFragmentComponent {

	@FragmentScope
	Fragment getFragment();

}
