package app.vehiclemonitor.core;

import app.viperalpha.di.activity.BaseActivityModule;
import app.viperalpha.utils.providers.BaseNavigator;
import app.viperalpha.utils.providers.Navigator;
import dagger.Binds;
import dagger.Module;

/**
 * Created on 05/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Module(includes = {BaseActivityModule.class})
public abstract class VMBaseActivityModule {

	@Binds
	abstract BaseNavigator bindsNavigator(Navigator navigator);
}
