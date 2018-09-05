package com.vladris.poke;

@FunctionalInterface
public interface ThrowingSupplier<T> {
	T get() throws Exception;
}
