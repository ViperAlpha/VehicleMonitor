package app.vehiclemonitor.core;

import javax.inject.Singleton;

import app.viperalpha.di.activity.ActivityScope;
import app.viperalpha.di.activity.BaseActivityComponent;
import dagger.Subcomponent;

/**
 * Created on 05/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Singleton
@ActivityScope
@Subcomponent(modules = {VMBaseActivityModule.class})
public interface VMBaseActivityComponent extends BaseActivityComponent {
}
