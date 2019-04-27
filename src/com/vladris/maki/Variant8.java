package com.vladris.maki;

import java.util.function.*;
import com.vladris.maki.details.*;

/**
 * Represents a 8-type discriminate union.
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
 * @param <T7> Represents the variants seventh type.
 * @param <T8> Represents the variants eighth type.
 */
public class Variant8<T1, T2, T3, T4, T5, T6, T7, T8> extends VariantBase {
	// Private constructor explicitly sets index
	private <T> Variant8(T item, byte index) {
		super(item, index);
	}
	/**
	 * Creates a new Variant instance from an item of type {@code T1}.
	 *
	 * @param item Item of type {@code T1}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant8(T1 item, TypeGuard1 ...guard) {
		this(item, (byte)0);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T2}.
	 *
	 * @param item Item of type {@code T2}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant8(T2 item, TypeGuard2 ...guard) {
		this(item, (byte)1);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T3}.
	 *
	 * @param item Item of type {@code T3}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant8(T3 item, TypeGuard3 ...guard) {
		this(item, (byte)2);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T4}.
	 *
	 * @param item Item of type {@code T4}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant8(T4 item, TypeGuard4 ...guard) {
		this(item, (byte)3);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T5}.
	 *
	 * @param item Item of type {@code T5}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant8(T5 item, TypeGuard5 ...guard) {
		this(item, (byte)4);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T6}.
	 *
	 * @param item Item of type {@code T6}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant8(T6 item, TypeGuard6 ...guard) {
		this(item, (byte)5);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T7}.
	 *
	 * @param item Item of type {@code T7}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant8(T7 item, TypeGuard7 ...guard) {
		this(item, (byte)6);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T8}.
	 *
	 * @param item Item of type {@code T8}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant8(T8 item, TypeGuard8 ...guard) {
		this(item, (byte)7);
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
	 * Assigns an item of type {@code T7} to the variant.
	 *
	 * @param item Item of type {@code T7}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public void set(T7 item, TypeGuard7 ...guard) {
		set7(item);
	}

	/**
	 * Assigns an item of type {@code T8} to the variant.
	 *
	 * @param item Item of type {@code T8}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public void set(T8 item, TypeGuard8 ...guard) {
		set8(item);
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
	 * Explicitly assigns an item of type {@code T7} at index 6.
	 *
	 * @param item Item of type {@code T7}.
	 */
	public void set7(T7 item) {
		set(item, (byte)6);
	}

	/**
	 * Explicitly assigns an item of type {@code T8} at index 7.
	 *
	 * @param item Item of type {@code T8}.
	 */
	public void set8(T8 item) {
		set(item, (byte)7);
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
	 * @param func7 Function to apply on type {@code T7}.
	 * @param func8 Function to apply on type {@code T8}.
	 * @return Result of applying function.
	 */
	public <R> R apply(
		Function<T1, R> func1,
		Function<T2, R> func2,
		Function<T3, R> func3,
		Function<T4, R> func4,
		Function<T5, R> func5,
		Function<T6, R> func6,
		Function<T7, R> func7,
		Function<T8, R> func8) {
		switch (getIndex()) {
			case 0: return func1.apply(get());
			case 1: return func2.apply(get());
			case 2: return func3.apply(get());
			case 3: return func4.apply(get());
			case 4: return func5.apply(get());
			case 5: return func6.apply(get());
			case 6: return func7.apply(get());
			default: return func8.apply(get());
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
	 * @param consumer7 Consumer to apply on type {@code T7}.
	 * @param consumer8 Consumer to apply on type {@code T8}.
	 */
	public void apply(
		Consumer<T1> consumer1,
		Consumer<T2> consumer2,
		Consumer<T3> consumer3,
		Consumer<T4> consumer4,
		Consumer<T5> consumer5,
		Consumer<T6> consumer6,
		Consumer<T7> consumer7,
		Consumer<T8> consumer8) {
		switch (getIndex()) {
			case 0: consumer1.accept(get()); break;
			case 1: consumer2.accept(get()); break;
			case 2: consumer3.accept(get()); break;
			case 3: consumer4.accept(get()); break;
			case 4: consumer5.accept(get()); break;
			case 5: consumer6.accept(get()); break;
			case 6: consumer7.accept(get()); break;
			default: consumer8.accept(get());
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
	 * @param <U7> Represents the return type of {@code func7}.
	 * @param <U8> Represents the return type of {@code func8}.
	 * @param func1 Function to apply on type {@code T1}.
	 * @param func2 Function to apply on type {@code T2}.
	 * @param func3 Function to apply on type {@code T3}.
	 * @param func4 Function to apply on type {@code T4}.
	 * @param func5 Function to apply on type {@code T5}.
	 * @param func6 Function to apply on type {@code T6}.
	 * @param func7 Function to apply on type {@code T7}.
	 * @param func8 Function to apply on type {@code T8}.
	 * @return Variant containing the result of applying the selected function.
	 */
	public <U1, U2, U3, U4, U5, U6, U7, U8> Variant8<U1, U2, U3, U4, U5, U6, U7, U8> map(
		Function<T1, U1> func1,
		Function<T2, U2> func2,
		Function<T3, U3> func3,
		Function<T4, U4> func4,
		Function<T5, U5> func5,
		Function<T6, U6> func6,
		Function<T7, U7> func7,
		Function<T8, U8> func8) {
		switch (getIndex()) {
			case 0: return Variant8.make1(func1.apply(get()));
			case 1: return Variant8.make2(func2.apply(get()));
			case 2: return Variant8.make3(func3.apply(get()));
			case 3: return Variant8.make4(func4.apply(get()));
			case 4: return Variant8.make5(func5.apply(get()));
			case 5: return Variant8.make6(func6.apply(get()));
			case 6: return Variant8.make7(func7.apply(get()));
			default: return Variant8.make8(func8.apply(get()));
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
	 * @param <T7> Represents the variants seventh type.
	 * @param <T8> Represents the variants eighth type.
	 * @param item Item of type {@code T1}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make(T1 item, TypeGuard1 ...guard) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item);
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
	 * @param <T7> Represents the variants seventh type.
	 * @param <T8> Represents the variants eighth type.
	 * @param item Item of type {@code T2}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make(T2 item, TypeGuard2 ...guard) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item);
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
	 * @param <T7> Represents the variants seventh type.
	 * @param <T8> Represents the variants eighth type.
	 * @param item Item of type {@code T3}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make(T3 item, TypeGuard3 ...guard) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item);
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
	 * @param <T7> Represents the variants seventh type.
	 * @param <T8> Represents the variants eighth type.
	 * @param item Item of type {@code T4}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make(T4 item, TypeGuard4 ...guard) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item);
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
	 * @param <T7> Represents the variants seventh type.
	 * @param <T8> Represents the variants eighth type.
	 * @param item Item of type {@code T5}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make(T5 item, TypeGuard5 ...guard) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item);
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
	 * @param <T7> Represents the variants seventh type.
	 * @param <T8> Represents the variants eighth type.
	 * @param item Item of type {@code T6}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make(T6 item, TypeGuard6 ...guard) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item);
	}

	/**
	 * Creates a new Variant given an item of type {@code T7}.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param <T2> Represents the variants second type.
	 * @param <T3> Represents the variants third type.
	 * @param <T4> Represents the variants fourth type.
	 * @param <T5> Represents the variants fifth type.
	 * @param <T6> Represents the variants sixth type.
	 * @param <T7> Represents the variants seventh type.
	 * @param <T8> Represents the variants eighth type.
	 * @param item Item of type {@code T7}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make(T7 item, TypeGuard7 ...guard) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item);
	}

	/**
	 * Creates a new Variant given an item of type {@code T8}.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param <T2> Represents the variants second type.
	 * @param <T3> Represents the variants third type.
	 * @param <T4> Represents the variants fourth type.
	 * @param <T5> Represents the variants fifth type.
	 * @param <T6> Represents the variants sixth type.
	 * @param <T7> Represents the variants seventh type.
	 * @param <T8> Represents the variants eighth type.
	 * @param item Item of type {@code T8}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make(T8 item, TypeGuard8 ...guard) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item);
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
	 * @param <T7> Represents the variants seventh type.
	 * @param <T8> Represents the variants eighth type.
	 * @param item Item of type {@code T1}.
	 * @return A Variant containing the given item at index 0.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make1(T1 item) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item, (byte)0);
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
	 * @param <T7> Represents the variants seventh type.
	 * @param <T8> Represents the variants eighth type.
	 * @param item Item of type {@code T2}.
	 * @return A Variant containing the given item at index 1.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make2(T2 item) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item, (byte)1);
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
	 * @param <T7> Represents the variants seventh type.
	 * @param <T8> Represents the variants eighth type.
	 * @param item Item of type {@code T3}.
	 * @return A Variant containing the given item at index 2.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make3(T3 item) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item, (byte)2);
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
	 * @param <T7> Represents the variants seventh type.
	 * @param <T8> Represents the variants eighth type.
	 * @param item Item of type {@code T4}.
	 * @return A Variant containing the given item at index 3.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make4(T4 item) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item, (byte)3);
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
	 * @param <T7> Represents the variants seventh type.
	 * @param <T8> Represents the variants eighth type.
	 * @param item Item of type {@code T5}.
	 * @return A Variant containing the given item at index 4.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make5(T5 item) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item, (byte)4);
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
	 * @param <T7> Represents the variants seventh type.
	 * @param <T8> Represents the variants eighth type.
	 * @param item Item of type {@code T6}.
	 * @return A Variant containing the given item at index 5.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make6(T6 item) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item, (byte)5);
	}

	/**
	 * Creates a new Variant given an item of type {@code T7} explicitly
	 * placed at index 6.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param <T2> Represents the variants second type.
	 * @param <T3> Represents the variants third type.
	 * @param <T4> Represents the variants fourth type.
	 * @param <T5> Represents the variants fifth type.
	 * @param <T6> Represents the variants sixth type.
	 * @param <T7> Represents the variants seventh type.
	 * @param <T8> Represents the variants eighth type.
	 * @param item Item of type {@code T7}.
	 * @return A Variant containing the given item at index 6.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make7(T7 item) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item, (byte)6);
	}

	/**
	 * Creates a new Variant given an item of type {@code T8} explicitly
	 * placed at index 7.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param <T2> Represents the variants second type.
	 * @param <T3> Represents the variants third type.
	 * @param <T4> Represents the variants fourth type.
	 * @param <T5> Represents the variants fifth type.
	 * @param <T6> Represents the variants sixth type.
	 * @param <T7> Represents the variants seventh type.
	 * @param <T8> Represents the variants eighth type.
	 * @param item Item of type {@code T8}.
	 * @return A Variant containing the given item at index 7.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make8(T8 item) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item, (byte)7);
	}

}