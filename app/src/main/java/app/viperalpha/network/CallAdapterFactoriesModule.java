package app.viperalpha.network;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import retrofit2.CallAdapter;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * Created on 03/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Module
public class CallAdapterFactoriesModule {

	@Provides
	@Singleton
	@Inject
	List<CallAdapter.Factory> providesCallAdapterFactories(Scheduler scheduler) {
		List<CallAdapter.Factory> callAdapterFactories = new ArrayList<>();

		callAdapterFactories.add(RxJava2CallAdapterFactory.createWithScheduler(scheduler));

		return callAdapterFactories;
	}


	@Provides
	@Singleton
	Scheduler providesScheduler() {
		return Schedulers.io();
	}
}
