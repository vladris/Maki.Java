package com.vladris.maki;

import java.util.function.*;
import com.vladris.maki.details.*;

/**
 * Represents a 1-type discriminate union.
 *
 * <pre>{@code
 * class Sample {
 *     static void Example() {
 *         // A variant can hold a value of any of its generic types
 *         Variant3<Integer, String, Double> variant = new Variant3<Integer, String, Double>(42);
 *
 *         // Can reassign variant with another of its generic types
 *         variant.set("Hello world!");
 *
 *         // Check the type of the value currently inhabiting the variant
 *         if (variant.is(String.class)) {
 *             System.out.println("The string is: " + variant.<String>get());
 *         }
 *
 *         variant.set(0.5);
 *
 *         // The right function will get picked depending on the value
 *         // currently inhabiting the variant
 *         variant.apply(
 *             (i) -> System.out.println(i + 1),
 *             (s) -> System.out.println(s + "!"),
 *             (d) -> System.out.println(d / 2));
 *     }
 * }
 * }</pre>
 *
 * @param <T1> Represents the variants first type.
 */
public class Variant1<T1> extends VariantBase {
	// Private constructor explicitly sets index
	private <T> Variant1(T item, byte index) {
		super(item, index);
	}
	/**
	 * Creates a new Variant instance from an item of type {@code T1}.
	 *
	 * @param item Item of type {@code T1}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant1(T1 item, TypeGuard1 ...guard) {
		this(item, (byte)0);
	}

	/**
	 * Assigns an item of type {@code T1} to the variant.
	 *
	 * @param item Item of type {@code T1}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public void set(T1 item, TypeGuard1 ...guard) {
		set1(item);
	}

	/**
	 * Explicitly assigns an item of type {@code T1} at index 0.
	 *
	 * @param item Item of type {@code T1}.
	 */
	public void set1(T1 item) {
		set(item, (byte)0);
	}


	/**
	 * Applies one of the given functions to the variant depending on the type
	 * currently inhabiting the variant.
	 *
	 * @param <R> Represents the return type of all functions.
	 * @param func1 Function to apply on type {@code T1}.
	 * @return Result of applying function.
	 */
	public <R> R apply(
		Function<T1, R> func1) {
		switch (getIndex()) {
			default: return func1.apply(get());
		}
	}

	/**
	 * Applies one of the given consumers to the variant depending on the type
	 * currently inhabiting the variant.
	 *
	 * @param consumer1 Consumer to apply on type {@code T1}.
	 */
	public void apply(
		Consumer<T1> consumer1) {
		switch (getIndex()) {
			default: consumer1.accept(get());
		}
	}

	/**
	 * Applies one of the given functions to the variant depending on the type
	 * currently inhabiting the variant.
	 *
	 * @param <U1> Represents the return type of {@code func1}.
	 * @param func1 Function to apply on type {@code T1}.
	 * @return Variant containing the result of applying the selected function.
	 */
	public <U1> Variant1<U1> map(
		Function<T1, U1> func1) {
		switch (getIndex()) {
			default: return Variant1.make1(func1.apply(get()));
		}
	}


	/**
	 * Creates a new Variant given an item of type {@code T1}.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param item Item of type {@code T1}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1> Variant1<T1> make(T1 item, TypeGuard1 ...guard) {
		return new Variant1<T1>(item);
	}

	/**
	 * Creates a new Variant given an item of type {@code T1} explicitly
	 * placed at index 0.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param item Item of type {@code T1}.
	 * @return A Variant containing the given item at index 0.
	 */
	public static <T1> Variant1<T1> make1(T1 item) {
		return new Variant1<T1>(item, (byte)0);
	}

}