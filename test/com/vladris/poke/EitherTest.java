package com.vladris.poke;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EitherTest {
	@Test
	public void testLeft() {
		Either<String, Integer> either = Either.makeLeft("Hello");
		
		assertTrue(either.isLeft());
		assertEquals("Hello", either.getLeft());
		assertFalse(either.isRight());
		assertThrows(ClassCastException.class, () -> either.getRight());
	}

	@Test
	public void testRight() {
		Either<String, Integer> either = Either.makeRight(42);
		
		assertTrue(either.isRight());
		assertEquals((Integer)42, either.getRight());
		assertFalse(either.isLeft());
		assertThrows(ClassCastException.class, () -> either.getLeft());
	}
	
	@Test
	public void testSetLeft() {
		Either<String, Integer> either = new Either<>(42);
		
		assertFalse(either.isLeft());
		either.setLeft("Hello");
		assertTrue(either.isLeft());
	}
	
	@Test
	public void testSetRight() {
		Either<String, Integer> either = new Either<>("Hello");
		
		assertFalse(either.isRight());
		either.setRight(42);
		assertTrue(either.isRight());
	}
}
