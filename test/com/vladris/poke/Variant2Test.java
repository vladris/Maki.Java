package com.vladris.poke;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Variant2Test {
    class T1 { }

    class T2 { }

    @Test
    public void variantNewTest1() {
        T1 value = new T1();
        Variant2<T1, T2> variant = new Variant2<T1, T2>(value);

        assertEquals(0, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantMakeTest1() {
        T1 value = new T1();
        Variant2<T1, T2> variant = Variant2.make1(value);

        assertEquals(0, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantSetTest1() {
        T1 value = new T1();
        T1 value2 = new T1();
        Variant2<T1, T2> variant = Variant2.make1(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
    }

    @Test
    public void variantApplyTest1() {
        Variant2<T1, T2> variant = Variant2.make1(new T1());

        int result = variant.apply(
            (arg) -> 1,
            (arg) -> 2);

        assertEquals(1, result);
    }

    @Test
    public void variantMapTest1() {
        Variant2<T1, T2> variant = Variant2.make1(new T1());

        Variant2<T1, T2> result = variant.map(
            (arg) -> arg,
            (arg) -> arg);

        assertEquals(0, result.getIndex());
    }

    @Test
    public void variantNewTest2() {
        T2 value = new T2();
        Variant2<T1, T2> variant = new Variant2<T1, T2>(value);

        assertEquals(1, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantMakeTest2() {
        T2 value = new T2();
        Variant2<T1, T2> variant = Variant2.make2(value);

        assertEquals(1, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantSetTest2() {
        T2 value = new T2();
        T2 value2 = new T2();
        Variant2<T1, T2> variant = Variant2.make2(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
    }

    @Test
    public void variantApplyTest2() {
        Variant2<T1, T2> variant = Variant2.make2(new T2());

        int result = variant.apply(
            (arg) -> 1,
            (arg) -> 2);

        assertEquals(2, result);
    }

    @Test
    public void variantMapTest2() {
        Variant2<T1, T2> variant = Variant2.make2(new T2());

        Variant2<T1, T2> result = variant.map(
            (arg) -> arg,
            (arg) -> arg);

        assertEquals(1, result.getIndex());
    }

}