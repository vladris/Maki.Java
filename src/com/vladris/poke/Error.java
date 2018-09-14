package com.vladris.poke;

import java.util.Random;
import java.util.function.Function;

/**
 * Error holds either a value of type {@code T} or an exception.
 *
 * <p>
 * The following example shows how to use Error to store either a value or an exception.
 * </p>
 * 
 * <pre>{@code
 * class Sample {
 *     // Either returns an int or throws
 *     static int ReturnValueOrThrow() throws Exception {
 *         int value = new Random().nextInt(100);
 * 
 *         if (value < 50) throw new RuntimeException();
 * 
 *         return value; 
 *     }
 * 
 *     public static void Example() throws Exception {
 *         Error<Integer> value = Error.make(() -> { return ReturnValueOrThrow(); });
 *
 *         if (value.hasValue()) {
 *             value.setValue(2 * value.getValue());
 *             System.out.println(value.getValue());
 *         } else { // value.isError()
 *             // Get exception from value, can handle or rethrow
 *             throw value.getError();
 *         }
 *     }
 * }
 * }</pre>
 *
 * @param <T> Type of value.
 */
public class Error<T> {
	private Either<Exception, T> either;
	
	/**
	 * Creates a new instance of Error from the given Exception.
	 * 
	 * @param ex Exception to initialize Error with.
	 */
	public Error(Exception ex) {
		either = Either.makeLeft(ex);
	}
	
	/**
	 * Creates a new instance of Error from the given value.
	 * 
	 * @param value Value to initialize Error with.
	 */
	public Error(T value) {
		either = Either.makeRight(value);
	}
	
	/**
	 * Returns {@code true} if the Error contains a value.
	 * 
	 * @return {@code true} if the Error contains a value.
	 */
	public boolean hasValue() {
		return either.isRight();
	}
	
	/**
	 * Returns the value contained in the Error.
	 * 
	 * @return Value of type {@code T}.
	 */
	public T getValue() {
		return either.getRight();
	}

	/**
	 * Sets the value of this Error.
	 * 
	 * @param value will be placed in the Error.
	 */
	public void setValue(T value) {
		either.setRight(value);
	}

	/**
	 * Returns {@code true} if the Error contains a Exception.
	 * 
	 * @return {@code true} if the Error contains an Exception.
	 */
	public boolean isError() {
		return either.isLeft();
	}
	
	/**
	 * Returns the Exception contained in the Error.
	 * 
	 * @return Exception contained in the Error.
	 */
	public Exception getError() {
		return either.getLeft();
	}
	
	/**
	 * Sets the Exception contained in this Error.
	 * 
	 * @param ex Exception to place in Error.
	 */
	public void setError(Exception ex) {
		either.setLeft(ex);
	}
	
	/**
	 * Maps the given function over the Error returning a new {@code Error<U>}.
	 * 
	 * @param <U> Type of return Error.
	 * @param func Function to map over the Error.
	 * @return New Error after calling the given function.
	 */
	public <U> Error<U> map(Function<T, U> func) {
		if (hasValue())
			return Error.makeValue(func.apply(getValue()));
		else
			return Error.makeError(getError());
	}
	
	/**
	 * Binds the given function to the Error returning a new {@code Error<U>}.
	 * 
	 * @param <U> Type of return Error.
	 * @param func Function to bind to the Error.
	 * @return New Error after calling the given function.
	 */
	public <U> Error<U> bind(Function<T, Error<U>> func) {
		if (hasValue())
			return func.apply(getValue());
		else
			return Error.makeError(getError());
	}
	
	/**
	 * Makes an Error from the given Exception.
	 * 
	 * @param <T> Error value type.
	 * @param ex Exception to place in Error.
	 * @return New Error containing the given Exception.
	 */
	public static <T> Error<T> makeError(Exception ex) {
		return new Error<T>(ex);
	}
	
	/**
	 * Makes an Error from the given value.
	 * 
	 * @param <T> Error value type.
	 * @param value Value to place in Error.
	 * @return New Error containing the given value.
	 */
	public static <T> Error<T> makeValue(T value) {
		return new Error<T>(value);
	}
	
	/**
	 * Makes an Error from the given ThrowingSupplier. 
	 * 
	 * <p>Depending on whether the supplier throws or returns, the
	 * resulting Error could either contain a value of type {@code T}
	 * or an Exception.</p>
	 * 
	 * @param <T> Error value type.
	 * @param supplier Throwing supplier from which to attempt to get value.
	 * @return Error containing either a value or an Exception.
	 */
	public static <T> Error<T> make(ThrowingSupplier<T> supplier) {
		try {
			return makeValue(supplier.get());
		}
		catch (Exception ex) {
			return makeError(ex);
		}
	}
}
