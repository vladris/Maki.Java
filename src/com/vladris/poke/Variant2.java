package com.vladris.poke;

import com.vladris.poke.details.*;

public class Variant2<T1, T2> extends VariantBase {
	// Private constructor explicitly sets index
	private <T> Variant2(T item, byte index) {
		super(item, index);
	}
	
	// TypeGuard* are used to disambiguate methods after type erasure, no argument
	// should be supplied - eg. new Variant2<String, Byte>("Hello");
	public Variant2(T1 item, TypeGuard1 ...guard) {
		this(item, (byte)0);
	}
	
	public Variant2(T2 item, TypeGuard2 ...guard) {
		this(item, (byte)1);
	}
	
	// set methods re-assign the contained item
	public void set(T1 item, TypeGuard1 ...guard) {
		set1(item);
	}
	
	public void set(T2 item, TypeGuard2 ...guard) {
		set2(item);
	}
	
	// set1, set2 explicitly set the element at the given index so no
	// disambiguation is needed (no TypeGuard* arguments)
	public void set1(T1 item) {
		set(item, (byte)0);
	}
	
	public void set2(T2 item) {
		set(item, (byte)1);
	}
	
	// make factories for each variant type
	public static <T1, T2> Variant2<T1, T2> make(T1 item, TypeGuard1 ...guard) {
		return new Variant2<T1, T2>(item);
	}

	public static <T1, T2> Variant2<T1, T2> make(T2 item, TypeGuard2 ...guard) {
		return new Variant2<T1, T2>(item);
	}
	
	// make1, make2 explicitly set the element at the given index, like the
	// set1, set2 methods
	public static <T1, T2> Variant2<T1, T2> make1(T1 item) {
		return new Variant2<T1, T2>(item, (byte)0);
	}
	
	public static <T1, T2> Variant2<T1, T2> make2(T2 item) {
		return new Variant2<T1, T2>(item, (byte)1);
	}
}
