package app.viperalpha.utils.schedulers;

import android.support.annotation.NonNull;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/**
 * Implementation of the {@link BaseSchedulerProvider} making all {@link Scheduler}s immediate.
 */
@Singleton
public class ImmediateSchedulerProvider implements BaseSchedulerProvider {

	@Inject
	public ImmediateSchedulerProvider() {
	}

	@NonNull
	@Override
	public Scheduler computation() {
		return Schedulers.trampoline();
	}

	@NonNull
	@Override
	public Scheduler io() {
		return Schedulers.trampoline();
	}

	@NonNull
	@Override
	public Scheduler ui() {
		return Schedulers.trampoline();
	}
}
