package app.vehiclemonitor.features.home.di;

import app.vehiclemonitor.features.home.HomeFragment;
import app.viperalpha.di.fragment.FragmentScope;
import dagger.Subcomponent;

/**
 * Created on 04/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@FragmentScope
@Subcomponent(modules = {HomeFragmentModule.class})
public interface HomeFragmentComponent {

	void inject(final HomeFragment homeFragment);
}
