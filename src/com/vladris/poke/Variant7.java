package com.vladris.poke;

import com.vladris.poke.details.*;

/**
 * Represents a 7-type discriminate union.
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
 */
public class Variant7<T1, T2, T3, T4, T5, T6, T7> extends VariantBase {
	// Private constructor explicitly sets index
	private <T> Variant7(T item, byte index) {
		super(item, index);
	}
	/**
	 * Creates a new Variant instance from an item of type {@code T1}.
	 *
	 * @param item Item of type {@code T1}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant7(T1 item, TypeGuard1 ...guard) {
		this(item, (byte)0);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T2}.
	 *
	 * @param item Item of type {@code T2}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant7(T2 item, TypeGuard2 ...guard) {
		this(item, (byte)1);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T3}.
	 *
	 * @param item Item of type {@code T3}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant7(T3 item, TypeGuard3 ...guard) {
		this(item, (byte)2);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T4}.
	 *
	 * @param item Item of type {@code T4}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant7(T4 item, TypeGuard4 ...guard) {
		this(item, (byte)3);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T5}.
	 *
	 * @param item Item of type {@code T5}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant7(T5 item, TypeGuard5 ...guard) {
		this(item, (byte)4);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T6}.
	 *
	 * @param item Item of type {@code T6}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant7(T6 item, TypeGuard6 ...guard) {
		this(item, (byte)5);
	}

	/**
	 * Creates a new Variant instance from an item of type {@code T7}.
	 *
	 * @param item Item of type {@code T7}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 */
	public Variant7(T7 item, TypeGuard7 ...guard) {
		this(item, (byte)6);
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
	 * Creates a new Variant given an item of type {@code T1}.
	 *
	 * @param <T1> Represents the variants first type.
	 * @param <T2> Represents the variants second type.
	 * @param <T3> Represents the variants third type.
	 * @param <T4> Represents the variants fourth type.
	 * @param <T5> Represents the variants fifth type.
	 * @param <T6> Represents the variants sixth type.
	 * @param <T7> Represents the variants seventh type.
	 * @param item Item of type {@code T1}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7> Variant7<T1, T2, T3, T4, T5, T6, T7> make(T1 item, TypeGuard1 ...guard) {
		return new Variant7<T1, T2, T3, T4, T5, T6, T7>(item);
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
	 * @param item Item of type {@code T2}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7> Variant7<T1, T2, T3, T4, T5, T6, T7> make(T2 item, TypeGuard2 ...guard) {
		return new Variant7<T1, T2, T3, T4, T5, T6, T7>(item);
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
	 * @param item Item of type {@code T3}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7> Variant7<T1, T2, T3, T4, T5, T6, T7> make(T3 item, TypeGuard3 ...guard) {
		return new Variant7<T1, T2, T3, T4, T5, T6, T7>(item);
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
	 * @param item Item of type {@code T4}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7> Variant7<T1, T2, T3, T4, T5, T6, T7> make(T4 item, TypeGuard4 ...guard) {
		return new Variant7<T1, T2, T3, T4, T5, T6, T7>(item);
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
	 * @param item Item of type {@code T5}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7> Variant7<T1, T2, T3, T4, T5, T6, T7> make(T5 item, TypeGuard5 ...guard) {
		return new Variant7<T1, T2, T3, T4, T5, T6, T7>(item);
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
	 * @param item Item of type {@code T6}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7> Variant7<T1, T2, T3, T4, T5, T6, T7> make(T6 item, TypeGuard6 ...guard) {
		return new Variant7<T1, T2, T3, T4, T5, T6, T7>(item);
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
	 * @param item Item of type {@code T7}.
	 * @param guard TypeGuards are used to disambiguate methods after type 
	 * erasure, no argument should be supplied.
	 * @return A Variant containing the given item.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7> Variant7<T1, T2, T3, T4, T5, T6, T7> make(T7 item, TypeGuard7 ...guard) {
		return new Variant7<T1, T2, T3, T4, T5, T6, T7>(item);
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
	 * @param item Item of type {@code T1}.
	 * @return A Variant containing the given item at index 0.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7> Variant7<T1, T2, T3, T4, T5, T6, T7> make1(T1 item) {
		return new Variant7<T1, T2, T3, T4, T5, T6, T7>(item, (byte)0);
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
	 * @param item Item of type {@code T2}.
	 * @return A Variant containing the given item at index 1.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7> Variant7<T1, T2, T3, T4, T5, T6, T7> make2(T2 item) {
		return new Variant7<T1, T2, T3, T4, T5, T6, T7>(item, (byte)1);
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
	 * @param item Item of type {@code T3}.
	 * @return A Variant containing the given item at index 2.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7> Variant7<T1, T2, T3, T4, T5, T6, T7> make3(T3 item) {
		return new Variant7<T1, T2, T3, T4, T5, T6, T7>(item, (byte)2);
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
	 * @param item Item of type {@code T4}.
	 * @return A Variant containing the given item at index 3.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7> Variant7<T1, T2, T3, T4, T5, T6, T7> make4(T4 item) {
		return new Variant7<T1, T2, T3, T4, T5, T6, T7>(item, (byte)3);
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
	 * @param item Item of type {@code T5}.
	 * @return A Variant containing the given item at index 4.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7> Variant7<T1, T2, T3, T4, T5, T6, T7> make5(T5 item) {
		return new Variant7<T1, T2, T3, T4, T5, T6, T7>(item, (byte)4);
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
	 * @param item Item of type {@code T6}.
	 * @return A Variant containing the given item at index 5.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7> Variant7<T1, T2, T3, T4, T5, T6, T7> make6(T6 item) {
		return new Variant7<T1, T2, T3, T4, T5, T6, T7>(item, (byte)5);
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
	 * @param item Item of type {@code T7}.
	 * @return A Variant containing the given item at index 6.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7> Variant7<T1, T2, T3, T4, T5, T6, T7> make7(T7 item) {
		return new Variant7<T1, T2, T3, T4, T5, T6, T7>(item, (byte)6);
	}

}