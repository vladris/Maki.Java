package com.vladris.poke;

import com.vladris.poke.details.*;

/**
 * Represents a 2-type discriminate union with Left and Right components. 
 *
 * <p>
 * The following example assigns values to and extracts them from an 
 * {@code Either<Integer, String>}:
 * </p>
 * 
 * <pre>{@code
 * class Sample {
 *     static void PrintEither(Either<Integer, String> either) {
 *         // If either contains the left type (Integer)
 *         if (either.isLeft()) {
 *             // Output the left (Integer) value to the console
 *             System.out.println(either.getLeft());
 *         } else { // either.isRight()
 *             // Output the right (String) value to the console
 *             System.out.println(either.getRight());    		
 *         }
 *     }
 * 
 *     public static void Example() {
 *         // Assign an Integer
 *         Either<Integer, String> either = new Either<Integer, String>(42);
 *
 *         // Will print "42"
 *         PrintEither(either);
 * 
 *         // Re-assign a String
 *         either.setRight("Hello world!");
 * 
 *         // Will print "Hello world!"
 *         PrintEither(either);
 *     }
 * }
 * }</pre>
 * 
 * @param <TLeft> Left type.
 * @param <TRight> Right type. 
 */
public final class Either<TLeft, TRight> {
	private Variant2<TLeft, TRight> variant;
	
	private Either(Variant2<TLeft, TRight> variant) {
		this.variant = variant;
	}
	
	/**
	 * Creates a new instance of Either from an item of type {@code TLeft}.
	 * 
	 * @param left Item of type {@code TLeft}.
	 * @param guard Do not provide, used to disambiguate functions with similar signatures.
	 */
	public Either(TLeft left, TypeGuard1 ...guard) {
		this(Variant2.make1(left));
	}
	
	/**
	 * Creates a new instance of Either from an item of type {@code TRight}.
	 * 
	 * @param right Item of type {@code TRight}.
	 * @param guard Do not provide, used to disambiguate functions with similar signatures.
	 */
	public Either(TRight right, TypeGuard2 ...guard) {
		this(Variant2.make2(right));
	}
	
	/**
	 * Returns {@code true} if holding a value of type {@code TLeft}.
	 * 
	 * @return {@code true} if holding a value of type {@code TLeft}.
	 */
	public boolean isLeft() {
		return variant.getIndex() == 0;
	}

	/**
	 * Gets the Left component.
	 * 
	 * @return Contained item of type {@code TLeft}.
	 * @throws ClassCastException Thrown on get if the inhabiting object is Right.
	 */
	@SuppressWarnings("unchecked")
	public TLeft getLeft() throws ClassCastException {
		if (!isLeft()) {
			throw new ClassCastException();
		}
			
		return (TLeft)variant.get();
	}
	
	/**
	 * Sets the Left component.
	 * 
	 * @param left Value of type {@code TLeft}.
	 */
	public void setLeft(TLeft left) {
		variant.set(left, (byte)0);
	}
	
	/**
	 * Returns {@code true} if holding a value of type {@code TRight}.
	 * 
	 * @return {@code true} if holding a value of type {@code TRight}.
	 */
	public boolean isRight() {
		return variant.getIndex() == 1;
	}
	
	/**
	 * Gets the Right component.
	 * 
	 * @return Contained item of type {@code TRight}.
	 * @throws ClassCastException Thrown on get if the inhabiting object is Left.
	 */
	@SuppressWarnings("unchecked")
	public TRight getRight() throws ClassCastException {
		if (!isRight()) {
			throw new ClassCastException();
		}
		
		return (TRight)variant.get();
	}
	
	/**
	 * Sets the Right component.
	 * 
	 * @param right Value of type {@code TRight}.
	 */
	public void setRight(TRight right) {
		variant.set(right, (byte)1);
	}
	
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Either)) return false;
		
		Either<?,?> other = (Either<?,?>)obj;
		
		return variant.equals(other.variant);
	}
	
	public int hashCode() {
		return variant.hashCode();
	}
	
	/**
	 * Creates a new Either explicitly placing the item in the Left component.
	 * 
	 * @param <TLeft> Left type.
	 * @param <TRight> Right type.
	 * @param left Item to place in the Either.
	 * @return Either containing the item.
	 */
	public static <TLeft, TRight> Either<TLeft, TRight> makeLeft(TLeft left) {
		return new Either<TLeft, TRight>(left, (TypeGuard1)null);
	}
	
	/**
	 * Creates a new Either explicitly placing the item in the Right component.
	 * 
	 * @param <TLeft> Left type.
	 * @param <TRight> Right type.
	 * @param right Item to place in the Either.
	 * @return Either containing the item.
	 */
	public static <TLeft, TRight> Either<TLeft, TRight> makeRight(TRight right) {
		return new Either<TLeft, TRight>(right, (TypeGuard2)null);
	}
}
