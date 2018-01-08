package app.vehiclemonitor.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import app.vehiclemonitor.features.home.HomeViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created on 05/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Module
public abstract class ViewModelModule {

	@Binds
	@IntoMap
	@ViewModelKey(HomeViewModel.class)
	abstract ViewModel bindHomeViewModel(HomeViewModel homeViewModel);

	@Binds
	abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);

}
