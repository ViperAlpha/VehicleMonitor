package app.viperalpha.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Converter;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created on 03/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Module
public class ConverterFactoriesModule {

	public static final String DEFAULT_GSON_BUILDER = "DEFAULT_GSON_BUILDER";

	@Provides
	@Singleton
	List<Converter.Factory> providesConverterFactories(Gson gson) {
		List<Converter.Factory> converterFactories = new ArrayList<>();

		converterFactories.add(GsonConverterFactory.create(gson));

		return converterFactories;
	}

	@Provides
	@Singleton
	Gson providesGson(@Named(DEFAULT_GSON_BUILDER) GsonBuilder gsonBuilder) {
		return gsonBuilder.create();
	}

	@Provides
	@Singleton
	@Named(DEFAULT_GSON_BUILDER)
	GsonBuilder providesGsonBuilder() {
		return new GsonBuilder();
	}

}
