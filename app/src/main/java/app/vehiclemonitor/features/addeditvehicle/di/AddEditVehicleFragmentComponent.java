package app.vehiclemonitor.features.addeditvehicle.di;

import app.vehiclemonitor.features.addeditvehicle.AddEditVehicleFragment;
import app.viperalpha.di.fragment.FragmentScope;
import dagger.Subcomponent;

/**
 * Created on 04/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@FragmentScope
@Subcomponent(modules = {AddEditVehicleFragmentModule.class})
public interface AddEditVehicleFragmentComponent {

	void inject(final AddEditVehicleFragment homeFragment);
}
