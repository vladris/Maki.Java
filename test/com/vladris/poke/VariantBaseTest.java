package com.vladris.poke;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VariantBaseTest {
	VariantBase variant;	

	@BeforeEach
	public void setUp() {
		variant = new VariantBase("Hello", (byte)1);
	}
	
	@Test
	void testHashCode() {
		assertEquals("Hello".hashCode(), variant.hashCode());
		
		VariantBase variant2 = new VariantBase("Hello", (byte)1);
		
		assertEquals(variant.hashCode(), variant2.hashCode());
	}

	@Test
	void testSet() {
		assertTrue(variant.is(String.class));
		assertEquals((byte)1, variant.getIndex());

		variant.set(42, (byte)0);
		
		assertTrue(variant.is(Integer.class));
		assertEquals((byte)0, variant.getIndex());
	}

	@Test
	void testGetIndex() {
		assertEquals((byte)1, variant.getIndex());
	}

	@Test
	void testIs() {
		assertTrue(variant.is(String.class));
		assertFalse(variant.is(Integer.class));
	}

	@Test
	void testGet() {
		assertEquals("Hello", variant.<String>get());
		
		// Should throw when attempting to get out the wrong type
		assertThrows(ClassCastException.class, () -> {
			@SuppressWarnings("unused")
			Integer value = variant.<Integer>get();
		});
	}

	@Test
	void testGetItem() {
		Object obj = new Object();
		
		variant.set(obj, (byte)0);
		
		assertEquals(obj, variant.getItem());
	}

	@Test
	void testEqualsObject() {
		// Same value, same index
		VariantBase variant2 = new VariantBase("Hello", (byte)1);
		assertTrue(variant.equals(variant2));
		
		// Same value, different index
		VariantBase variant3 = new VariantBase("Hello", (byte)0);
		assertFalse(variant.equals(variant3));
		
		// Different type
		VariantBase variant4 = new VariantBase(42, (byte)1);		
		assertFalse(variant.equals(variant4));
	}

}
