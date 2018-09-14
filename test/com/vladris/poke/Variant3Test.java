package com.vladris.poke;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Variant3Test {
    class T1 { }

    class T2 { }

    class T3 { }

    @Test
    public void variantNewTest1() {
        T1 value = new T1();
        Variant3<T1, T2, T3> variant = new Variant3<T1, T2, T3>(value);

        assertEquals(0, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantMakeTest1() {
        T1 value = new T1();
        Variant3<T1, T2, T3> variant = Variant3.make1(value);

        assertEquals(0, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantSetTest1() {
        T1 value = new T1();
        T1 value2 = new T1();
        Variant3<T1, T2, T3> variant = Variant3.make1(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
    }

    @Test
    public void variantApplyTest1() {
        Variant3<T1, T2, T3> variant = Variant3.make1(new T1());

        int result = variant.apply(
            (arg) -> 1,
            (arg) -> 2,
            (arg) -> 3);

        assertEquals(1, result);
    }

    @Test
    public void variantMapTest1() {
        Variant3<T1, T2, T3> variant = Variant3.make1(new T1());

        Variant3<T1, T2, T3> result = variant.map(
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg);

        assertEquals(0, result.getIndex());
    }

    @Test
    public void variantNewTest2() {
        T2 value = new T2();
        Variant3<T1, T2, T3> variant = new Variant3<T1, T2, T3>(value);

        assertEquals(1, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantMakeTest2() {
        T2 value = new T2();
        Variant3<T1, T2, T3> variant = Variant3.make2(value);

        assertEquals(1, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantSetTest2() {
        T2 value = new T2();
        T2 value2 = new T2();
        Variant3<T1, T2, T3> variant = Variant3.make2(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
    }

    @Test
    public void variantApplyTest2() {
        Variant3<T1, T2, T3> variant = Variant3.make2(new T2());

        int result = variant.apply(
            (arg) -> 1,
            (arg) -> 2,
            (arg) -> 3);

        assertEquals(2, result);
    }

    @Test
    public void variantMapTest2() {
        Variant3<T1, T2, T3> variant = Variant3.make2(new T2());

        Variant3<T1, T2, T3> result = variant.map(
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg);

        assertEquals(1, result.getIndex());
    }

    @Test
    public void variantNewTest3() {
        T3 value = new T3();
        Variant3<T1, T2, T3> variant = new Variant3<T1, T2, T3>(value);

        assertEquals(2, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantMakeTest3() {
        T3 value = new T3();
        Variant3<T1, T2, T3> variant = Variant3.make3(value);

        assertEquals(2, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantSetTest3() {
        T3 value = new T3();
        T3 value2 = new T3();
        Variant3<T1, T2, T3> variant = Variant3.make3(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
    }

    @Test
    public void variantApplyTest3() {
        Variant3<T1, T2, T3> variant = Variant3.make3(new T3());

        int result = variant.apply(
            (arg) -> 1,
            (arg) -> 2,
            (arg) -> 3);

        assertEquals(3, result);
    }

    @Test
    public void variantMapTest3() {
        Variant3<T1, T2, T3> variant = Variant3.make3(new T3());

        Variant3<T1, T2, T3> result = variant.map(
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg);

        assertEquals(2, result.getIndex());
    }

}