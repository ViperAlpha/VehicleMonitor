/*
 * Copyright 2016 Futurice GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.viperalpha.utils;

import android.support.annotation.Nullable;

import java.util.Collection;
import java.util.Iterator;

/**
 * Utility class to simplify working with Java {@link Collection}.
 */
public final class CollectionUtils {

	/**
	 * Verifies if the content of the collections is the same.
	 *
	 * @param first  Collection
	 * @param second Collection
	 * @return True if the content and the order of the collection are equal, otherwise false
	 */
	public static <T> boolean areEqual(@Nullable final Collection<T> first, @Nullable final Collection<T> second) {
		if (first == null || second == null || first.size() != second.size()) {
			return false;
		}

		Iterator<T> firstIterator = first.iterator();
		Iterator<T> secondIterator = second.iterator();
		while (firstIterator.hasNext()) {
			if (!firstIterator.next().equals(secondIterator.next())) {
				return false;
			}
		}
		return true;
	}

	private CollectionUtils() {
		throw new RuntimeException();
	}

}
