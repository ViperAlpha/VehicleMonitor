package app.vehiclemonitor.features.home.di;

import app.vehiclemonitor.core.VMBaseActivityModule;
import app.vehiclemonitor.util.providers.BaseNavigator;
import app.vehiclemonitor.util.providers.Navigator;
import app.vehiclemonitor.util.schedulers.BaseSchedulerProvider;
import app.vehiclemonitor.util.schedulers.SchedulerProvider;
import app.viperalpha.di.activity.ActivityScope;
import dagger.Binds;
import dagger.Module;

/**
 * Created on 03/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Module(includes = {VMBaseActivityModule.class})
public abstract class HomeActivityModule {

	@ActivityScope
	@Binds
	abstract BaseNavigator bindNavigator(Navigator navigator);

	@ActivityScope
	@Binds
	abstract BaseSchedulerProvider bindScheduler(SchedulerProvider schedulerProvider);

}
