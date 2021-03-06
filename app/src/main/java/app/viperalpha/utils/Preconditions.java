package app.viperalpha.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Static class that provides helper methods to check preconditions.
 * <p>
 * Created on 02/01/2018
 *
 * @author Reinaldo Moreira da Silva
 * @email rms_master@hotmail.com
 */

public class Preconditions {

	/**
	 * Checks if the reference is not null.
	 *
	 * @param reference an object reference
	 * @return the non-null reference
	 * @throws NullPointerException if {@code reference} is null
	 */
	@NonNull
	public static <T> T get(@Nullable final T reference) {
		if (reference == null) {
			throw new NullPointerException("Assertion for a nonnull object failed.");
		}
		return reference;
	}

	/**
	 * Checks if the reference is not null.
	 *
	 * @param reference object reference
	 * @return non-null reference
	 * @throws NullPointerException if {@code reference} is null
	 */
	public static <T> T checkNotNull(final T reference) {
		if (reference == null) {
			throw new NullPointerException();
		}
		return reference;
	}

	public static <T> void throwIfNull(final T reference) {
		if (reference == null) {
			throw new NullPointerException();
		}
	}

	@SafeVarargs
	public static <T> void throwIfNull(final T... references) {
		for (T ref : references) {
			throwIfNull(ref);
		}
	}

	/**
	 * Checks if the reference is not null.
	 *
	 * @param reference    object reference
	 * @param errorMessage message used if the check fails
	 * @return non-null reference
	 * @throws NullPointerException if {@code reference} is null
	 */
	public static <T> T checkNotNull(final T reference, @NonNull final String errorMessage) {
		if (reference == null) {
			throw new NullPointerException(get(errorMessage));
		}
		return reference;
	}

	/**
	 * Checks the truth of an expression for an argument.
	 *
	 * @param expression   a boolean expression
	 * @param errorMessage message used if the check fails
	 * @throws IllegalArgumentException if {@code expression} is false
	 */
	public static void checkArgument(boolean expression, @NonNull final String errorMessage) {
		if (!expression) {
			throw new IllegalArgumentException(get(errorMessage));
		}
	}

	private Preconditions() throws Exception {
		throw new Exception();
	}
}
