package app.viperalpha.utils.providers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;

import app.viperalpha.utils.Preconditions;

/**
 * Concrete implementation of the {@link BaseResourceProvider} interface.
 */
public class ResourceProvider implements BaseResourceProvider {

	@NonNull
	private final Context mContext;

	public ResourceProvider(@NonNull Context context) {
		mContext = Preconditions.checkNotNull(context, "context cannot be null");
	}

	@NonNull
	@Override
	public String getString(@StringRes final int id) {
		return mContext.getString(id);
	}

	@NonNull
	@Override
	public String getString(@StringRes final int id, final Object... formatArgs) {
		return mContext.getString(id, formatArgs);
	}
}
