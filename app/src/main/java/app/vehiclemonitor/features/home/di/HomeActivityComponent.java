package app.vehiclemonitor.features.home.di;

import app.vehiclemonitor.core.VMBaseActivityComponent;
import app.vehiclemonitor.features.home.HomeActivity;
import app.viperalpha.di.activity.ActivityScope;
import app.viperalpha.di.fragment.BaseFragmentModule;
import dagger.Subcomponent;

/**
 * Created on 03/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@ActivityScope
@Subcomponent(modules = {HomeActivityModule.class})
public interface HomeActivityComponent extends VMBaseActivityComponent {

	void inject(final HomeActivity activity);

	HomeFragmentComponent injectHomeFragment(BaseFragmentModule baseFragmentModule);

}
