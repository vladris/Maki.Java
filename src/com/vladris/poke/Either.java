package com.vladris.poke;

import com.vladris.poke.details.*;

public final class Either<TLeft, TRight> {
	private Variant2<TLeft, TRight> variant;
	
	private Either(Variant2<TLeft, TRight> variant) {
		this.variant = variant;
	}
	
	public Either(TLeft left, TypeGuard1 ...guard) {
		this(Variant2.make1(left));
	}
	
	public Either(TRight right, TypeGuard2 ...guard) {
		this(Variant2.make2(right));
	}
	
	public boolean isLeft() {
		return variant.getIndex() == 0;
	}

	@SuppressWarnings("unchecked")
	public TLeft getLeft() throws ClassCastException {
		if (!isLeft()) {
			throw new ClassCastException();
		}
			
		return (TLeft)variant.get();
	}
	
	public void setLeft(TLeft left) {
		variant.set(left, (byte)0);
	}
	
	public boolean isRight() {
		return variant.getIndex() == 1;
	}
	
	@SuppressWarnings("unchecked")
	public TRight getRight() throws ClassCastException {
		if (!isRight()) {
			throw new ClassCastException();
		}
		
		return (TRight)variant.get();
	}
	
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
	
	public static <TLeft, TRight> Either<TLeft, TRight> makeLeft(TLeft left) {
		return new Either<TLeft, TRight>(left, (TypeGuard1)null);
	}
	
	public static <TLeft, TRight> Either<TLeft, TRight> makeRight(TRight right) {
		return new Either<TLeft, TRight>(right, (TypeGuard2)null);
	}
}
