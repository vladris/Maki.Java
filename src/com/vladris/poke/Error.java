package com.vladris.poke;

public class Error<T> {
	private Either<Exception, T> either;
	
	public Error(Exception ex) {
		either = Either.makeLeft(ex);
	}
	
	public Error(T value) {
		either = Either.makeRight(value);
	}
	
	public boolean isError() {
		return either.isLeft();
	}
	
	public boolean hasValue() {
		return either.isRight();
	}

	public Exception getError() {
		return either.getLeft();
	}
	
	public T getValue() {
		return either.getRight();
	}
	
	public static <T> Error<T> makeError(Exception ex) {
		return new Error<T>(ex);
	}
	
	public static <T> Error<T> makeValue(T value) {
		return new Error<T>(value);
	}
}
