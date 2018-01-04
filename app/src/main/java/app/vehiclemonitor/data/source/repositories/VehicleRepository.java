package app.vehiclemonitor.data.source.repositories;

import javax.inject.Singleton;

import app.vehiclemonitor.data.source.VehicleDataSource;
import io.reactivex.annotations.NonNull;

/**
 * Created on 04/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Singleton
public class VehicleRepository implements VehicleDataSource {

	private final VehicleDataSource vehicleRemoteDataSource;
	private final VehicleDataSource vehicleLocalDataSource;

	public VehicleRepository(@NonNull VehicleDataSource vehicleRemoteDataSource, @NonNull VehicleDataSource vehicleLocalDataSource) {
		this.vehicleRemoteDataSource = vehicleRemoteDataSource;
		this.vehicleLocalDataSource = vehicleLocalDataSource;
	}
}
