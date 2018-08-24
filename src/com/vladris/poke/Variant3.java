package com.vladris.poke;

import com.vladris.poke.details.*;

public class Variant3<T1, T2, T3> extends VariantBase {
	// Private constructor explicitly sets index
	private <T> Variant3(T item, byte index) {
		super(item, index);
	}
	
	// TypeGuard* are used to disambiguate methods after type erasure, no argument
	// should be supplied - eg. new Variant2<String, Byte>("Hello");
	public Variant3(T1 item, TypeGuard1 ...guard) {
		this(item, (byte)0);
	}

	public Variant3(T2 item, TypeGuard2 ...guard) {
		this(item, (byte)1);
	}

	public Variant3(T3 item, TypeGuard3 ...guard) {
		this(item, (byte)2);
	}

	// set methods re-assign the contained item
	public void set(T1 item, TypeGuard1 ...guard) {
		set1(item);
	}

	public void set(T2 item, TypeGuard2 ...guard) {
		set2(item);
	}

	public void set(T3 item, TypeGuard3 ...guard) {
		set3(item);
	}

	// set1, set2... explicitly set the element at the given index so no
	// disambiguation is needed (no TypeGuard* arguments)
	public void set1(T1 item) {
		set(item, (byte)0);
	}

	public void set2(T2 item) {
		set(item, (byte)1);
	}

	public void set3(T3 item) {
		set(item, (byte)2);
	}

	// make factories for each variant type
	public static <T1, T2, T3> Variant3<T1, T2, T3> make(T1 item, TypeGuard1 ...guard) {
		return new Variant3<T1, T2, T3>(item);
	}

	public static <T1, T2, T3> Variant3<T1, T2, T3> make(T2 item, TypeGuard2 ...guard) {
		return new Variant3<T1, T2, T3>(item);
	}

	public static <T1, T2, T3> Variant3<T1, T2, T3> make(T3 item, TypeGuard3 ...guard) {
		return new Variant3<T1, T2, T3>(item);
	}

	// make1, make2... explicitly set the element at the given index, like the
	// set1, set2... methods
	public static <T1, T2, T3> Variant3<T1, T2, T3> make1(T1 item) {
		return new Variant3<T1, T2, T3>(item, (byte)0);
	}

	public static <T1, T2, T3> Variant3<T1, T2, T3> make2(T2 item) {
		return new Variant3<T1, T2, T3>(item, (byte)1);
	}

	public static <T1, T2, T3> Variant3<T1, T2, T3> make3(T3 item) {
		return new Variant3<T1, T2, T3>(item, (byte)2);
	}

}