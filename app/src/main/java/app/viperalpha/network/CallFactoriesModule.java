package app.viperalpha.network;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/**
 * Created on 03/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Module
public class CallFactoriesModule {

	@Singleton
	@Provides
	List<Call.Factory> providesCallFactories(OkHttpClient okHttpClient) {
		List<Call.Factory> callFactories = new ArrayList<>();

		callFactories.add(okHttpClient);

		return callFactories;
	}

	@Singleton
	@Provides
	OkHttpClient providesOkHttpClient() {
		return new OkHttpClient.Builder().build();
	}
}
