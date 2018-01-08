package app.vehiclemonitor.core;

import app.vehiclemonitor.viewmodel.ViewModelModule;
import app.viperalpha.di.activity.BaseActivityModule;
import dagger.Module;

/**
 * Created on 05/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Module(includes = {BaseActivityModule.class, ViewModelModule.class})
public abstract class VMBaseActivityModule {

}
