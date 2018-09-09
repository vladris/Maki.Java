package com.vladris.poke;

/**
 * Declares an interface similar to {@code Supplier<T>} which can also throw an exception.
 *
 * @param <T> Represents the type returned by {@code get}.
 */
@FunctionalInterface
public interface ThrowingSupplier<T> {
	/**
	 * Gets a result.
	 * 
	 * @return A result.
	 * @throws Exception as determined by the implementing type.
	 */
	T get() throws Exception;
}
