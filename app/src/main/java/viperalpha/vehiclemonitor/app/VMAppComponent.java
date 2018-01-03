package viperalpha.vehiclemonitor.app;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created on 02/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Component(modules = {VMAppModule.class})
@Singleton
public interface VMAppComponent {

	void inject(VMApp app);
}
