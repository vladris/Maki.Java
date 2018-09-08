package com.vladris.poke;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Variant6Test {
    class T1 { }

    class T2 { }

    class T3 { }

    class T4 { }

    class T5 { }

    class T6 { }

    @Test
	public void VariantNewTest1() {
        T1 value = new T1();
        Variant6<T1, T2, T3, T4, T5, T6> variant = new Variant6<T1, T2, T3, T4, T5, T6>(value);

        assertEquals(0, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantMakeTest1() {
        T1 value = new T1();
        Variant6<T1, T2, T3, T4, T5, T6> variant = Variant6.make1(value);

        assertEquals(0, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantSetTest1() {
        T1 value = new T1();
        T1 value2 = new T1();
        Variant6<T1, T2, T3, T4, T5, T6> variant = Variant6.make1(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
	}

    @Test
	public void VariantNewTest2() {
        T2 value = new T2();
        Variant6<T1, T2, T3, T4, T5, T6> variant = new Variant6<T1, T2, T3, T4, T5, T6>(value);

        assertEquals(1, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantMakeTest2() {
        T2 value = new T2();
        Variant6<T1, T2, T3, T4, T5, T6> variant = Variant6.make2(value);

        assertEquals(1, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantSetTest2() {
        T2 value = new T2();
        T2 value2 = new T2();
        Variant6<T1, T2, T3, T4, T5, T6> variant = Variant6.make2(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
	}

    @Test
	public void VariantNewTest3() {
        T3 value = new T3();
        Variant6<T1, T2, T3, T4, T5, T6> variant = new Variant6<T1, T2, T3, T4, T5, T6>(value);

        assertEquals(2, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantMakeTest3() {
        T3 value = new T3();
        Variant6<T1, T2, T3, T4, T5, T6> variant = Variant6.make3(value);

        assertEquals(2, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantSetTest3() {
        T3 value = new T3();
        T3 value2 = new T3();
        Variant6<T1, T2, T3, T4, T5, T6> variant = Variant6.make3(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
	}

    @Test
	public void VariantNewTest4() {
        T4 value = new T4();
        Variant6<T1, T2, T3, T4, T5, T6> variant = new Variant6<T1, T2, T3, T4, T5, T6>(value);

        assertEquals(3, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantMakeTest4() {
        T4 value = new T4();
        Variant6<T1, T2, T3, T4, T5, T6> variant = Variant6.make4(value);

        assertEquals(3, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantSetTest4() {
        T4 value = new T4();
        T4 value2 = new T4();
        Variant6<T1, T2, T3, T4, T5, T6> variant = Variant6.make4(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
	}

    @Test
	public void VariantNewTest5() {
        T5 value = new T5();
        Variant6<T1, T2, T3, T4, T5, T6> variant = new Variant6<T1, T2, T3, T4, T5, T6>(value);

        assertEquals(4, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantMakeTest5() {
        T5 value = new T5();
        Variant6<T1, T2, T3, T4, T5, T6> variant = Variant6.make5(value);

        assertEquals(4, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantSetTest5() {
        T5 value = new T5();
        T5 value2 = new T5();
        Variant6<T1, T2, T3, T4, T5, T6> variant = Variant6.make5(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
	}

    @Test
	public void VariantNewTest6() {
        T6 value = new T6();
        Variant6<T1, T2, T3, T4, T5, T6> variant = new Variant6<T1, T2, T3, T4, T5, T6>(value);

        assertEquals(5, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantMakeTest6() {
        T6 value = new T6();
        Variant6<T1, T2, T3, T4, T5, T6> variant = Variant6.make6(value);

        assertEquals(5, variant.getIndex());
        assertEquals(value, variant.get());
	}

    @Test
	public void VariantSetTest6() {
        T6 value = new T6();
        T6 value2 = new T6();
        Variant6<T1, T2, T3, T4, T5, T6> variant = Variant6.make6(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
	}

}