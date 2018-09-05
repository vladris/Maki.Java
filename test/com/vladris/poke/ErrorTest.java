package com.vladris.poke;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ErrorTest {
	@Test
	public void testError() {
		Exception ex = new Exception();
		Error<String> error = Error.makeError(ex);
		
		assertTrue(error.isError());
		assertEquals(ex, error.getError());
		assertFalse(error.hasValue());
		assertThrows(ClassCastException.class, () -> error.getValue());
	}

	@Test
	public void testValue() {
		Error<String> error = Error.makeValue("Hello");
		
		assertTrue(error.hasValue());
		assertEquals("Hello", error.getValue());
		assertFalse(error.isError());
		assertThrows(ClassCastException.class, () -> error.getError());
	}
}
