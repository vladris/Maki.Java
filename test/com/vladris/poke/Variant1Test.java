package com.vladris.poke;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Variant1Test {
    class T1 { }

    @Test
    public void variantNewTest1() {
        T1 value = new T1();
        Variant1<T1> variant = new Variant1<T1>(value);

        assertEquals(0, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantMakeTest1() {
        T1 value = new T1();
        Variant1<T1> variant = Variant1.make1(value);

        assertEquals(0, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantSetTest1() {
        T1 value = new T1();
        T1 value2 = new T1();
        Variant1<T1> variant = Variant1.make1(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
    }

    @Test
    public void variantApplyTest1() {
        Variant1<T1> variant = Variant1.make1(new T1());

        int result = variant.apply(
            (arg) -> 1);

        assertEquals(1, result);
    }

    @Test
    public void variantMapTest1() {
        Variant1<T1> variant = Variant1.make1(new T1());

        Variant1<T1> result = variant.map(
            (arg) -> arg);

        assertEquals(0, result.getIndex());
    }

}