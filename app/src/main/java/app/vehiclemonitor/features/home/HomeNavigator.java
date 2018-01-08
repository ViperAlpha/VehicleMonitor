package app.vehiclemonitor.features.home;

import javax.inject.Inject;

import app.vehiclemonitor.features.addeditvehicle.AddEditVehicleActivity;
import app.vehiclemonitor.util.providers.BaseNavigator;
import io.reactivex.annotations.NonNull;

/**
 * Created on 05/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

public class HomeNavigator {

	@NonNull
	private final BaseNavigator navigationProvider;

	@Inject
	public HomeNavigator(@NonNull BaseNavigator navigationProvider) {
		this.navigationProvider = navigationProvider;
	}

	void addNewVehicle() {
		navigationProvider.startActivityForResult(AddEditVehicleActivity.class, -1);
	}
}
