package com.vladris.poke;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class VariantTest3 {
    class T1 { }

    class T2 { }

    class T3 { }


/*
    @Test
	public void VariantNewTest1() {
        T1 value = new T1();
        Variant3<T1, T2, T3> variant = new Variant3<>(value);

        assertEquals(0, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantMakeTest1() {
        T1 value = new T1();
        Variant3<T1, T2, T3> variant = Variant3.make1(value);

        assertEquals(0, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantSetTest1() {
        T1 value = new T1();
        T1 value2 = new T1();
        Variant3<T1, T2, T3> variant = Variant3.make1(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
	}

    @Test
	public void VariantNewTest2() {
        T2 value = new T2();
        Variant3<T1, T2, T3> variant = new Variant3<>(value);

        assertEquals(1, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantMakeTest2() {
        T2 value = new T2();
        Variant3<T1, T2, T3> variant = Variant3.make2(value);

        assertEquals(1, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantSetTest2() {
        T2 value = new T2();
        T2 value2 = new T2();
        Variant3<T1, T2, T3> variant = Variant3.make2(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
	}

    @Test
	public void VariantNewTest3() {
        T3 value = new T3();
        Variant3<T1, T2, T3> variant = new Variant3<>(value);

        assertEquals(2, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantMakeTest3() {
        T3 value = new T3();
        Variant3<T1, T2, T3> variant = Variant3.make3(value);

        assertEquals(2, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantSetTest3() {
        T3 value = new T3();
        T3 value2 = new T3();
        Variant3<T1, T2, T3> variant = Variant3.make3(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
	}

*/
}