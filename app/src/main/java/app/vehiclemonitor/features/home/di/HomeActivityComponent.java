package app.vehiclemonitor.features.home.di;

import app.vehiclemonitor.features.home.HomeActivity;
import app.viperalpha.di.fragment.BaseFragmentModule;
import dagger.Subcomponent;
import app.viperalpha.di.activity.ActivityScope;
import app.viperalpha.di.activity.BaseActivityComponent;

/**
 * Created on 03/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@ActivityScope
@Subcomponent(modules = HomeActivityModule.class)
public interface HomeActivityComponent extends BaseActivityComponent {

	void inject(final HomeActivity activity);

	HomeFragmentComponent injectHomeFragment(BaseFragmentModule baseFragmentModule);

}
