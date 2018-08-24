package com.vladris.poke;

import com.vladris.poke.details.*;

public class Variant1<T1> extends VariantBase {
	// Private constructor explicitly sets index
	private <T> Variant1(T item, byte index) {
		super(item, index);
	}
	
	// TypeGuard* are used to disambiguate methods after type erasure, no argument
	// should be supplied - eg. new Variant2<String, Byte>("Hello");
	public Variant1(T1 item, TypeGuard1 ...guard) {
		this(item, (byte)0);
	}

	// set methods re-assign the contained item
	public void set(T1 item, TypeGuard1 ...guard) {
		set1(item);
	}

	// set1, set2... explicitly set the element at the given index so no
	// disambiguation is needed (no TypeGuard* arguments)
	public void set1(T1 item) {
		set(item, (byte)0);
	}

	// make factories for each variant type
	public static <T1> Variant1<T1> make(T1 item, TypeGuard1 ...guard) {
		return new Variant1<T1>(item);
	}

	// make1, make2... explicitly set the element at the given index, like the
	// set1, set2... methods
	public static <T1> Variant1<T1> make1(T1 item) {
		return new Variant1<T1>(item, (byte)0);
	}

}