package app.vehiclemonitor.data.source.repositories;

import javax.inject.Singleton;

import app.vehiclemonitor.data.source.UserDataSource;
import io.reactivex.annotations.NonNull;

/**
 * Created on 04/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Singleton
public class UserRepository implements UserDataSource {

	private final UserDataSource userRemoteDataSource;
	private final UserDataSource userLocalDataSource;

	public UserRepository(@NonNull UserDataSource userRemoteDataSource, @NonNull UserDataSource userLocalDataSource) {
		this.userRemoteDataSource = userRemoteDataSource;
		this.userLocalDataSource = userLocalDataSource;
	}
}
