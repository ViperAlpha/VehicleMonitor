package app.vehiclemonitor.app;

import javax.inject.Singleton;

import app.vehiclemonitor.features.addeditvehicle.di.AddEditVehicleActivityComponent;
import app.vehiclemonitor.features.home.di.HomeActivityComponent;
import app.vehiclemonitor.network.VMApiServiceModule;
import app.viperalpha.utils.schedulers.SchedulerModule;
import app.vehiclemonitor.viewmodel.ViewModelModule;
import app.viperalpha.di.activity.BaseActivityModule;
import dagger.Component;

/**
 * Created on 02/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Singleton
@Component(modules = {VMAppModule.class, VMApiServiceModule.class, SchedulerModule.class, ViewModelModule.class})
public interface VMAppComponent {

	void inject(VMApp app);

	HomeActivityComponent injectHomeActivity(BaseActivityModule module);

	AddEditVehicleActivityComponent injectAddEditVehicleActivity(BaseActivityModule module);
}
