package viperalpha.network;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Call;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

/**
 * Created on 03/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Module(includes = {CallAdapterFactoriesModule.class, CallFactoriesModule.class, ConverterFactoriesModule.class})
public class RetrofitModule {

	@Provides
	@Singleton
	@Inject
	Retrofit.Builder providesRetrofitBuilder(List<Call.Factory> callFactories, List<Converter.Factory> converterFactories,
	                                         List<CallAdapter.Factory> callAdapterFactories) {
		Retrofit.Builder builder = new Retrofit.Builder();

		for (Call.Factory callFactory : callFactories) {
			builder.callFactory(callFactory);
		}

		for (Converter.Factory converter : converterFactories) {
			builder.addConverterFactory(converter);
		}

		for (CallAdapter.Factory callAdapterFactory : callAdapterFactories) {
			builder.addCallAdapterFactory(callAdapterFactory);
		}

		return builder;
	}
}
