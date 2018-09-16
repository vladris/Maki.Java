package com.vladris.poke;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Variant5Test {
    class T1 { }

    class T2 { }

    class T3 { }

    class T4 { }

    class T5 { }

    @Test
    public void variantNewTest1() {
        T1 value = new T1();
        Variant5<T1, T2, T3, T4, T5> variant = new Variant5<T1, T2, T3, T4, T5>(value);

        assertEquals(0, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantMakeTest1() {
        T1 value = new T1();
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make1(value);

        assertEquals(0, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantSetTest1() {
        T1 value = new T1();
        T1 value2 = new T1();
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make1(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
    }

    @Test
    public void variantApplyTest1() {
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make1(new T1());

        int result = variant.apply(
            (arg) -> 1,
            (arg) -> 2,
            (arg) -> 3,
            (arg) -> 4,
            (arg) -> 5);

        assertEquals(1, result);

        // apply overload with Consumer
        variant.apply(
            (arg) -> {  },
            (arg) -> { fail("Shouldn't be called"); },
            (arg) -> { fail("Shouldn't be called"); },
            (arg) -> { fail("Shouldn't be called"); },
            (arg) -> { fail("Shouldn't be called"); });
    }

    @Test
    public void variantMapTest1() {
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make1(new T1());

        Variant5<T1, T2, T3, T4, T5> result = variant.map(
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg);

        assertEquals(0, result.getIndex());
    }

    @Test
    public void variantNewTest2() {
        T2 value = new T2();
        Variant5<T1, T2, T3, T4, T5> variant = new Variant5<T1, T2, T3, T4, T5>(value);

        assertEquals(1, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantMakeTest2() {
        T2 value = new T2();
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make2(value);

        assertEquals(1, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantSetTest2() {
        T2 value = new T2();
        T2 value2 = new T2();
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make2(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
    }

    @Test
    public void variantApplyTest2() {
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make2(new T2());

        int result = variant.apply(
            (arg) -> 1,
            (arg) -> 2,
            (arg) -> 3,
            (arg) -> 4,
            (arg) -> 5);

        assertEquals(2, result);

        // apply overload with Consumer
        variant.apply(
            (arg) -> { fail("Shouldn't be called"); },
            (arg) -> {  },
            (arg) -> { fail("Shouldn't be called"); },
            (arg) -> { fail("Shouldn't be called"); },
            (arg) -> { fail("Shouldn't be called"); });
    }

    @Test
    public void variantMapTest2() {
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make2(new T2());

        Variant5<T1, T2, T3, T4, T5> result = variant.map(
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg);

        assertEquals(1, result.getIndex());
    }

    @Test
    public void variantNewTest3() {
        T3 value = new T3();
        Variant5<T1, T2, T3, T4, T5> variant = new Variant5<T1, T2, T3, T4, T5>(value);

        assertEquals(2, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantMakeTest3() {
        T3 value = new T3();
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make3(value);

        assertEquals(2, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantSetTest3() {
        T3 value = new T3();
        T3 value2 = new T3();
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make3(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
    }

    @Test
    public void variantApplyTest3() {
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make3(new T3());

        int result = variant.apply(
            (arg) -> 1,
            (arg) -> 2,
            (arg) -> 3,
            (arg) -> 4,
            (arg) -> 5);

        assertEquals(3, result);

        // apply overload with Consumer
        variant.apply(
            (arg) -> { fail("Shouldn't be called"); },
            (arg) -> { fail("Shouldn't be called"); },
            (arg) -> {  },
            (arg) -> { fail("Shouldn't be called"); },
            (arg) -> { fail("Shouldn't be called"); });
    }

    @Test
    public void variantMapTest3() {
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make3(new T3());

        Variant5<T1, T2, T3, T4, T5> result = variant.map(
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg);

        assertEquals(2, result.getIndex());
    }

    @Test
    public void variantNewTest4() {
        T4 value = new T4();
        Variant5<T1, T2, T3, T4, T5> variant = new Variant5<T1, T2, T3, T4, T5>(value);

        assertEquals(3, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantMakeTest4() {
        T4 value = new T4();
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make4(value);

        assertEquals(3, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantSetTest4() {
        T4 value = new T4();
        T4 value2 = new T4();
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make4(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
    }

    @Test
    public void variantApplyTest4() {
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make4(new T4());

        int result = variant.apply(
            (arg) -> 1,
            (arg) -> 2,
            (arg) -> 3,
            (arg) -> 4,
            (arg) -> 5);

        assertEquals(4, result);

        // apply overload with Consumer
        variant.apply(
            (arg) -> { fail("Shouldn't be called"); },
            (arg) -> { fail("Shouldn't be called"); },
            (arg) -> { fail("Shouldn't be called"); },
            (arg) -> {  },
            (arg) -> { fail("Shouldn't be called"); });
    }

    @Test
    public void variantMapTest4() {
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make4(new T4());

        Variant5<T1, T2, T3, T4, T5> result = variant.map(
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg);

        assertEquals(3, result.getIndex());
    }

    @Test
    public void variantNewTest5() {
        T5 value = new T5();
        Variant5<T1, T2, T3, T4, T5> variant = new Variant5<T1, T2, T3, T4, T5>(value);

        assertEquals(4, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantMakeTest5() {
        T5 value = new T5();
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make5(value);

        assertEquals(4, variant.getIndex());
        assertEquals(value, variant.get());
    }

    @Test
    public void variantSetTest5() {
        T5 value = new T5();
        T5 value2 = new T5();
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make5(value);
        variant.set(value2);

        assertNotEquals(value, variant.get());
        assertEquals(value2, variant.get());
    }

    @Test
    public void variantApplyTest5() {
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make5(new T5());

        int result = variant.apply(
            (arg) -> 1,
            (arg) -> 2,
            (arg) -> 3,
            (arg) -> 4,
            (arg) -> 5);

        assertEquals(5, result);

        // apply overload with Consumer
        variant.apply(
            (arg) -> { fail("Shouldn't be called"); },
            (arg) -> { fail("Shouldn't be called"); },
            (arg) -> { fail("Shouldn't be called"); },
            (arg) -> { fail("Shouldn't be called"); },
            (arg) -> {  });
    }

    @Test
    public void variantMapTest5() {
        Variant5<T1, T2, T3, T4, T5> variant = Variant5.make5(new T5());

        Variant5<T1, T2, T3, T4, T5> result = variant.map(
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg,
            (arg) -> arg);

        assertEquals(4, result.getIndex());
    }

}