package app.vehiclemonitor.app;

import javax.inject.Singleton;

import app.vehiclemonitor.features.home.HomeActivityComponent;
import app.vehiclemonitor.network.VMApiServiceModule;
import app.viperalpha.di.activity.BaseActivityModule;
import dagger.Component;

/**
 * Created on 02/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Singleton
@Component(modules = {VMAppModule.class, VMApiServiceModule.class})
public interface VMAppComponent {

	void inject(VMApp app);

	HomeActivityComponent injectHomeActivity(BaseActivityModule module);
}
