package app.viperalpha.logging;

import android.util.Log;

/**
 * Created on 03/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

//TODO: finalizar classe
public class LogUtils {

	private static final LogUtils INSTANCE = new LogUtils();

	private LogUtils() {
	}

	public static LogUtils getinstance() {
		return INSTANCE;
	}

	public static void logMethod(final String msg) {
		Log.v("App", msg);
	}
}
