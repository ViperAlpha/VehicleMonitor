package app.viperalpha.logging;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created on 03/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

@Module
public class LoggingModule {

	@Provides
	@Singleton
	LogUtils providesLogging() {
		return LogUtils.getinstance();
	}
}
