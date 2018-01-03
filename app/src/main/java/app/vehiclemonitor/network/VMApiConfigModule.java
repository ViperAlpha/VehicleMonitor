package app.vehiclemonitor.network;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created on 03/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Module
public class VMApiConfigModule {

	static final String VM_API_BASE_URL = "VMApiConfigModule.BASE_URL";

	@Provides
	@Singleton
	@Named(VM_API_BASE_URL)
	static String providesBaseUrl() {
		return "http://www.google.com.br";
	}

}
