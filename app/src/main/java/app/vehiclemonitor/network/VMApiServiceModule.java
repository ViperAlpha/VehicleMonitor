package app.vehiclemonitor.network;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import app.viperalpha.network.RetrofitModule;

import static app.vehiclemonitor.network.VMApiConfigModule.VM_API_BASE_URL;

/**
 * Created on 03/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Module(includes = {RetrofitModule.class, VMApiConfigModule.class})
public class VMApiServiceModule {

	@Provides
	@Singleton
	@Inject
	Retrofit providesRetrofit(@Named(VM_API_BASE_URL) String baseUrl, Retrofit.Builder retrofitBuilder) {

		retrofitBuilder.baseUrl(baseUrl);

		return retrofitBuilder.build();
	}


	@Singleton
	@Provides
	@Inject
	VMApiService providesApiService(Retrofit retrofit) {
		return retrofit.create(VMApiService.class);
	}

}
