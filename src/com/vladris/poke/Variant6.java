package com.vladris.poke;

import java.util.function.*;
import com.vladris.poke.details.*;

/**
 * Represents a 6-type discriminate union.
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
 * @param <T2> Represents the variants second type.
 * @param <T3> Represents the variants third type.
 * @param <T4> Represents the variants fourth type.
 * @param <T5> Represents the variants fifth type.
 * @param <T6> Represents the variants sixth type.
 */
public class Variant6<T1, T2, T3, T4, T5, T6> extends VariantBase {
	// Private constructor explicitly sets index
	private <T> Variant6(T item, byte index) {
		super(item, index);
	}
	/**
	 * Creates a new Variant instance from an item of type {@code T1}.
	 *
	 * @param item Item of type {@code T1}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant6(T1 item, TypeGuard1 ...guard) {
		this(item, (byte)0);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T2}.
	 *
	 * @param item Item of type {@code T2}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant6(T2 item, TypeGuard2 ...guard) {
		this(item, (byte)1);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T3}.
	 *
	 * @param item Item of type {@code T3}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant6(T3 item, TypeGuard3 ...guard) {
		this(item, (byte)2);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T4}.
	 *
	 * @param item Item of type {@code T4}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant6(T4 item, TypeGuard4 ...guard) {
		this(item, (byte)3);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T5}.
	 *
	 * @param item Item of type {@code T5}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant6(T5 item, TypeGuard5 ...guard) {
		this(item, (byte)4);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T6}.
	 *
	 * @param item Item of type {@code T6}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant6(T6 item, TypeGuard6 ...guard) {
		this(item, (byte)5);
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
	 * Assigns an item of type {@code T2} to the variant.
	 *
	 * @param item Item of type {@code T2}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public void set(T2 item, TypeGuard2 ...guard) {
		set2(item);
	}

	/**
	 * Assigns an item of type {@code T3} to the variant.
	 *
	 * @param item Item of type {@code T3}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public void set(T3 item, TypeGuard3 ...guard) {
		set3(item);
	}

	/**
	 * Assigns an item of type {@code T4} to the variant.
	 *
	 * @param item Item of type {@code T4}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public void set(T4 item, TypeGuard4 ...guard) {
		set4(item);
	}

	/**
	 * Assigns an item of type {@code T5} to the variant.
	 *
	 * @param item Item of type {@code T5}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public void set(T5 item, TypeGuard5 ...guard) {
		set5(item);
	}

	/**
	 * Assigns an item of type {@code T6} to the variant.
	 *
	 * @param item Item of type {@code T6}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public void set(T6 item, TypeGuard6 ...guard) {
		set6(item);
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
	 * Explicitly assigns an item of type {@code T2} at index 1.
	 *
	 * @param item Item of type {@code T2}.
	 */
	public void set2(T2 item) {
		set(item, (byte)1);
	}

	/**
	 * Explicitly assigns an item of type {@code T3} at index 2.
	 *
	 * @param item Item of type {@code T3}.
	 */
	public void set3(T3 item) {
		set(item, (byte)2);
	}

	/**
	 * Explicitly assigns an item of type {@code T4} at index 3.
	 *
	 * @param item Item of type {@code T4}.
	 */
	public void set4(T4 item) {
		set(item, (byte)3);
	}

	/**
	 * Explicitly assigns an item of type {@code T5} at index 4.
	 *
	 * @param item Item of type {@code T5}.
	 */
	public void set5(T5 item) {
		set(item, (byte)4);
	}

	/**
	 * Explicitly assigns an item of type {@code T6} at index 5.
	 *
	 * @param item Item of type {@code T6}.
	 */
	public void set6(T6 item) {
		set(item, (byte)5);
	}


	/**
	 * Applies one of the given functions to the variant depending on the type
	 * currently inhabiting the variant.
	 *
	 * @param <R> Represents the return type of all functions.
	 * @param func1 Function to apply on type {@code T1}.
	 * @param func2 Function to apply on type {@code T2}.
	 * @param func3 Function to apply on type {@code T3}.
	 * @param func4 Function to apply on type {@code T4}.
	 * @param func5 Function to apply on type {@code T5}.
	 * @param func6 Function to apply on type {@code T6}.
	 * @return Result of applying function.
	 */
	public <R> R apply(
		Function<T1, R> func1,
		Function<T2, R> func2,
		Function<T3, R> func3,
		Function<T4, R> func4,
		Function<T5, R> func5,
		Function<T6, R> func6) {
		switch (getIndex()) {
			case 0: return func1.apply(get());
			case 1: return func2.apply(get());
			case 2: return func3.apply(get());
			case 3: return func4.apply(get());
			case 4: return func5.apply(get());
			default: return func6.apply(get());
		}
	}

	/**
	 * Applies one of the given consumers to the variant depending on the type
	 * currently inhabiting the variant.
	 *
	 * @param consumer1 Consumer to apply on type {@code T1}.
	 * @param consumer2 Consumer to apply on type {@code T2}.
	 * @param consumer3 Consumer to apply on type {@code T3}.
	 * @param consumer4 Consumer to apply on type {@code T4}.
	 * @param consumer5 Consumer to apply on type {@code T5}.
	 * @param consumer6 Consumer to apply on type {@code T6}.
	 */
	public void apply(
		Consumer<T1> consumer1,
		Consumer<T2> consumer2,
		Consumer<T3> consumer3,
		Consumer<T4> consumer4,
		Consumer<T5> consumer5,
		Consumer<T6> consumer6) {
		switch (getIndex()) {
			case 0: consumer1.accept(get()); break;
			case 1: consumer2.accept(get()); break;
			case 2: consumer3.accept(get()); break;
			case 3: consumer4.accept(get()); break;
			case 4: consumer5.accept(get()); break;
			default: consumer6.accept(get());
		}
	}

	/**
	 * Applies one of the given functions to the variant depending on the type
	 * currently inhabiting the variant.
	 *
	 * @param <U1> Represents the return type of {@code func1}.
	 * @param <U2> Represents the return type of {@code func2}.
	 * @param <U3> Represents the return type of {@code func3}.
	 * @param <U4> Represents the return type of {@code func4}.
	 * @param <U5> Represents the return type of {@code func5}.
	 * @param <U6> Represents the return type of {@code func6}.
	 * @param func1 Function to apply on type {@code T1}.
	 * @param func2 Function to apply on type {@code T2}.
	 * @param func3 Function to apply on type {@code T3}.
	 * @param func4 Function to apply on type {@code T4}.
	 * @param func5 Function to apply on type {@code T5}.
	 * @param func6 Function to apply on type {@code T6}.
	 * @return Variant containing the result of applying the selected function.
	 */
	public <U1, U2, U3, U4, U5, U6> Variant6<U1, U2, U3, U4, U5, U6> map(
		Function<T1, U1> func1,
		Function<T2, U2> func2,
		Function<T3, U3> func3,
		Function<T4, U4> func4,
		Function<T5, U5> func5,
		Function<T6, U6> func6) {
		switch (getIndex()) {
			case 0: return Variant6.make1(func1.apply(get()));
			case 1: return Variant6.make2(func2.apply(get()));
			case 2: return Variant6.make3(func3.apply(get()));
			case 3: return Variant6.make4(func4.apply(get()));
			case 4: return Variant6.make5(func5.apply(get()));
			default: return Variant6.make6(func6.apply(get()));
		}
	}


	/**
	 * Creates a new Variant given an item of type {@code T1}.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param <T2> Represents the variants second type.
	 * @param <T3> Represents the variants third type.
	 * @param <T4> Represents the variants fourth type.
	 * @param <T5> Represents the variants fifth type.
	 * @param <T6> Represents the variants sixth type.
	 * @param item Item of type {@code T1}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6> Variant6<T1, T2, T3, T4, T5, T6> make(T1 item, TypeGuard1 ...guard) {
		return new Variant6<T1, T2, T3, T4, T5, T6>(item);
	}

	/**
	 * Creates a new Variant given an item of type {@code T2}.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param <T2> Represents the variants second type.
	 * @param <T3> Represents the variants third type.
	 * @param <T4> Represents the variants fourth type.
	 * @param <T5> Represents the variants fifth type.
	 * @param <T6> Represents the variants sixth type.
	 * @param item Item of type {@code T2}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6> Variant6<T1, T2, T3, T4, T5, T6> make(T2 item, TypeGuard2 ...guard) {
		return new Variant6<T1, T2, T3, T4, T5, T6>(item);
	}

	/**
	 * Creates a new Variant given an item of type {@code T3}.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param <T2> Represents the variants second type.
	 * @param <T3> Represents the variants third type.
	 * @param <T4> Represents the variants fourth type.
	 * @param <T5> Represents the variants fifth type.
	 * @param <T6> Represents the variants sixth type.
	 * @param item Item of type {@code T3}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6> Variant6<T1, T2, T3, T4, T5, T6> make(T3 item, TypeGuard3 ...guard) {
		return new Variant6<T1, T2, T3, T4, T5, T6>(item);
	}

	/**
	 * Creates a new Variant given an item of type {@code T4}.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param <T2> Represents the variants second type.
	 * @param <T3> Represents the variants third type.
	 * @param <T4> Represents the variants fourth type.
	 * @param <T5> Represents the variants fifth type.
	 * @param <T6> Represents the variants sixth type.
	 * @param item Item of type {@code T4}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6> Variant6<T1, T2, T3, T4, T5, T6> make(T4 item, TypeGuard4 ...guard) {
		return new Variant6<T1, T2, T3, T4, T5, T6>(item);
	}

	/**
	 * Creates a new Variant given an item of type {@code T5}.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param <T2> Represents the variants second type.
	 * @param <T3> Represents the variants third type.
	 * @param <T4> Represents the variants fourth type.
	 * @param <T5> Represents the variants fifth type.
	 * @param <T6> Represents the variants sixth type.
	 * @param item Item of type {@code T5}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6> Variant6<T1, T2, T3, T4, T5, T6> make(T5 item, TypeGuard5 ...guard) {
		return new Variant6<T1, T2, T3, T4, T5, T6>(item);
	}

	/**
	 * Creates a new Variant given an item of type {@code T6}.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param <T2> Represents the variants second type.
	 * @param <T3> Represents the variants third type.
	 * @param <T4> Represents the variants fourth type.
	 * @param <T5> Represents the variants fifth type.
	 * @param <T6> Represents the variants sixth type.
	 * @param item Item of type {@code T6}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6> Variant6<T1, T2, T3, T4, T5, T6> make(T6 item, TypeGuard6 ...guard) {
		return new Variant6<T1, T2, T3, T4, T5, T6>(item);
	}

	/**
	 * Creates a new Variant given an item of type {@code T1} explicitly
	 * placed at index 0.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param <T2> Represents the variants second type.
	 * @param <T3> Represents the variants third type.
	 * @param <T4> Represents the variants fourth type.
	 * @param <T5> Represents the variants fifth type.
	 * @param <T6> Represents the variants sixth type.
	 * @param item Item of type {@code T1}.
	 * @return A Variant containing the given item at index 0.
	 */
	public static <T1, T2, T3, T4, T5, T6> Variant6<T1, T2, T3, T4, T5, T6> make1(T1 item) {
		return new Variant6<T1, T2, T3, T4, T5, T6>(item, (byte)0);
	}

	/**
	 * Creates a new Variant given an item of type {@code T2} explicitly
	 * placed at index 1.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param <T2> Represents the variants second type.
	 * @param <T3> Represents the variants third type.
	 * @param <T4> Represents the variants fourth type.
	 * @param <T5> Represents the variants fifth type.
	 * @param <T6> Represents the variants sixth type.
	 * @param item Item of type {@code T2}.
	 * @return A Variant containing the given item at index 1.
	 */
	public static <T1, T2, T3, T4, T5, T6> Variant6<T1, T2, T3, T4, T5, T6> make2(T2 item) {
		return new Variant6<T1, T2, T3, T4, T5, T6>(item, (byte)1);
	}

	/**
	 * Creates a new Variant given an item of type {@code T3} explicitly
	 * placed at index 2.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param <T2> Represents the variants second type.
	 * @param <T3> Represents the variants third type.
	 * @param <T4> Represents the variants fourth type.
	 * @param <T5> Represents the variants fifth type.
	 * @param <T6> Represents the variants sixth type.
	 * @param item Item of type {@code T3}.
	 * @return A Variant containing the given item at index 2.
	 */
	public static <T1, T2, T3, T4, T5, T6> Variant6<T1, T2, T3, T4, T5, T6> make3(T3 item) {
		return new Variant6<T1, T2, T3, T4, T5, T6>(item, (byte)2);
	}

	/**
	 * Creates a new Variant given an item of type {@code T4} explicitly
	 * placed at index 3.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param <T2> Represents the variants second type.
	 * @param <T3> Represents the variants third type.
	 * @param <T4> Represents the variants fourth type.
	 * @param <T5> Represents the variants fifth type.
	 * @param <T6> Represents the variants sixth type.
	 * @param item Item of type {@code T4}.
	 * @return A Variant containing the given item at index 3.
	 */
	public static <T1, T2, T3, T4, T5, T6> Variant6<T1, T2, T3, T4, T5, T6> make4(T4 item) {
		return new Variant6<T1, T2, T3, T4, T5, T6>(item, (byte)3);
	}

	/**
	 * Creates a new Variant given an item of type {@code T5} explicitly
	 * placed at index 4.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param <T2> Represents the variants second type.
	 * @param <T3> Represents the variants third type.
	 * @param <T4> Represents the variants fourth type.
	 * @param <T5> Represents the variants fifth type.
	 * @param <T6> Represents the variants sixth type.
	 * @param item Item of type {@code T5}.
	 * @return A Variant containing the given item at index 4.
	 */
	public static <T1, T2, T3, T4, T5, T6> Variant6<T1, T2, T3, T4, T5, T6> make5(T5 item) {
		return new Variant6<T1, T2, T3, T4, T5, T6>(item, (byte)4);
	}

	/**
	 * Creates a new Variant given an item of type {@code T6} explicitly
	 * placed at index 5.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param <T2> Represents the variants second type.
	 * @param <T3> Represents the variants third type.
	 * @param <T4> Represents the variants fourth type.
	 * @param <T5> Represents the variants fifth type.
	 * @param <T6> Represents the variants sixth type.
	 * @param item Item of type {@code T6}.
	 * @return A Variant containing the given item at index 5.
	 */
	public static <T1, T2, T3, T4, T5, T6> Variant6<T1, T2, T3, T4, T5, T6> make6(T6 item) {
		return new Variant6<T1, T2, T3, T4, T5, T6>(item, (byte)5);
	}

}