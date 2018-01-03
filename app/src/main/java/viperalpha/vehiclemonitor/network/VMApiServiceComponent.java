package viperalpha.vehiclemonitor.network;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created on 03/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Component(modules = VMApiServiceModule.class)
@Singleton
public interface VMApiServiceComponent {

	VMApiService getApiService();

}
