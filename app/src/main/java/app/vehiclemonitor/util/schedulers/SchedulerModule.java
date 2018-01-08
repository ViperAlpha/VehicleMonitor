package app.vehiclemonitor.util.schedulers;

import dagger.Binds;
import dagger.Module;

/**
 * Created on 08/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Module
public abstract class SchedulerModule {

	@Binds
	abstract BaseSchedulerProvider bindScheduler(SchedulerProvider schedulerProvider);
}
