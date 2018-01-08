package app.vehiclemonitor.features.home;

import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import app.vehiclemonitor.util.schedulers.BaseSchedulerProvider;

/**
 * Created on 05/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

public class HomeViewModel extends ViewModel {

	@NonNull
	private final HomeNavigator navigationProvider;
	@NonNull
	private final BaseSchedulerProvider schedulerProvider;

	@Inject
	public HomeViewModel(@NonNull HomeNavigator navigationProvider) {

		this.navigationProvider = navigationProvider;
		schedulerProvider = null;
	}

	public HomeViewModel(@NonNull BaseSchedulerProvider schedulerProvider) {
		this.navigationProvider = null;
		this.schedulerProvider = schedulerProvider;
	}

	void handleAddButtonClick() {
		navigationProvider.addNewVehicle();
	}
}
