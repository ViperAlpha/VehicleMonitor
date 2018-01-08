package app.vehiclemonitor.features.home;

import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import app.viperalpha.utils.schedulers.BaseSchedulerProvider;

/**
 * Created on 05/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

public class HomeViewModel extends ViewModel {

	@NonNull
	private BaseSchedulerProvider schedulerProvider;

	@Inject
	public HomeViewModel(@NonNull final BaseSchedulerProvider schedulerProvider) {
		this.schedulerProvider = schedulerProvider;
	}

	// @Inject
	// public HomeViewModel(@NonNull HomeNavigator navigationProvider, @NonNull BaseSchedulerProvider schedulerProvider) {
	// 	this.navigationProvider = navigationProvider;
	// 	this.schedulerProvider = schedulerProvider;
	// }

}
