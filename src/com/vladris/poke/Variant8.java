package com.vladris.poke;

import com.vladris.poke.details.*;

public class Variant8<T1, T2, T3, T4, T5, T6, T7, T8> extends VariantBase {
	// Private constructor explicitly sets index
	private <T> Variant8(T item, byte index) {
		super(item, index);
	}
	
	// TypeGuard* are used to disambiguate methods after type erasure, no argument
	// should be supplied - eg. new Variant2<String, Byte>("Hello");
	public Variant8(T1 item, TypeGuard1 ...guard) {
		this(item, (byte)0);
	}

	public Variant8(T2 item, TypeGuard2 ...guard) {
		this(item, (byte)1);
	}

	public Variant8(T3 item, TypeGuard3 ...guard) {
		this(item, (byte)2);
	}

	public Variant8(T4 item, TypeGuard4 ...guard) {
		this(item, (byte)3);
	}

	public Variant8(T5 item, TypeGuard5 ...guard) {
		this(item, (byte)4);
	}

	public Variant8(T6 item, TypeGuard6 ...guard) {
		this(item, (byte)5);
	}

	public Variant8(T7 item, TypeGuard7 ...guard) {
		this(item, (byte)6);
	}

	public Variant8(T8 item, TypeGuard8 ...guard) {
		this(item, (byte)7);
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

	public void set(T4 item, TypeGuard4 ...guard) {
		set4(item);
	}

	public void set(T5 item, TypeGuard5 ...guard) {
		set5(item);
	}

	public void set(T6 item, TypeGuard6 ...guard) {
		set6(item);
	}

	public void set(T7 item, TypeGuard7 ...guard) {
		set7(item);
	}

	public void set(T8 item, TypeGuard8 ...guard) {
		set8(item);
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

	public void set4(T4 item) {
		set(item, (byte)3);
	}

	public void set5(T5 item) {
		set(item, (byte)4);
	}

	public void set6(T6 item) {
		set(item, (byte)5);
	}

	public void set7(T7 item) {
		set(item, (byte)6);
	}

	public void set8(T8 item) {
		set(item, (byte)7);
	}

	// make factories for each variant type
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make(T1 item, TypeGuard1 ...guard) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make(T2 item, TypeGuard2 ...guard) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make(T3 item, TypeGuard3 ...guard) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make(T4 item, TypeGuard4 ...guard) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make(T5 item, TypeGuard5 ...guard) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make(T6 item, TypeGuard6 ...guard) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make(T7 item, TypeGuard7 ...guard) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make(T8 item, TypeGuard8 ...guard) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item);
	}

	// make1, make2... explicitly set the element at the given index, like the
	// set1, set2... methods
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make1(T1 item) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item, (byte)1);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make2(T2 item) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item, (byte)2);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make3(T3 item) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item, (byte)3);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make4(T4 item) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item, (byte)4);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make5(T5 item) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item, (byte)5);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make6(T6 item) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item, (byte)6);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make7(T7 item) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item, (byte)7);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8> Variant8<T1, T2, T3, T4, T5, T6, T7, T8> make8(T8 item) {
		return new Variant8<T1, T2, T3, T4, T5, T6, T7, T8>(item, (byte)8);
	}

}