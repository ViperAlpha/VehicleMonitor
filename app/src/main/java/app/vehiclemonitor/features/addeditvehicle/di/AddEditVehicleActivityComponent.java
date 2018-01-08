package app.vehiclemonitor.features.addeditvehicle.di;

import app.vehiclemonitor.features.addeditvehicle.AddEditVehicleActivity;
import app.viperalpha.di.activity.ActivityScope;
import app.viperalpha.di.activity.BaseActivityComponent;
import app.viperalpha.di.fragment.BaseFragmentModule;
import dagger.Subcomponent;

/**
 * Created on 03/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@ActivityScope
@Subcomponent(modules = AddEditVehicleActivityModule.class)
public interface AddEditVehicleActivityComponent extends BaseActivityComponent {

	void inject(final AddEditVehicleActivity activity);

	AddEditVehicleFragmentComponent injectAddEditVehicleFragment(BaseFragmentModule baseFragmentModule);

}
