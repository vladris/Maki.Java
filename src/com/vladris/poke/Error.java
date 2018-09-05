package com.vladris.poke;

public class Error<T> {
	public boolean isError() {
		return false;
	}
	
	public boolean hasValue() {
		return false;
	}
	
	public T getValue() {
		return null;
	}
	
	public Exception getError() {
		return null;
	}
	
	
	public static <T> Error<T> makeError(Exception ex) {
		return null;
	}
	
	public static <T> Error<T> makeValue(T value) {
		return null;
	}
}
