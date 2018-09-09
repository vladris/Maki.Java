package com.vladris.poke;

/**
 * Used internally to implement common variant behavior.
 */
public class VariantBase {
	private IVariantHolder variantHolder;
	private byte index;
	
	<T> VariantBase(T item, byte index) {
		set(item, index);
	}
	
	/**
	 * Places the given item in the variant at the given index.
	 * 
	 * @param <T> Type of item to place in variant.
	 * @param item Item to place in variant.
	 * @param index 0-based index of variant item.
	 */
	protected <T> void set(T item, byte index) {
		this.variantHolder = new VariantHolder<T>(item);
		this.index = index;
	}
	
	/**
	 * Gets the 0-based index of the type inhabiting the variant.
	 * 
	 * @return 0-based index of the type inhabiting the variant.
	 */
	public byte getIndex() {
		return index;
	}
	
	/**
	 * Returns a value that indicates whether the variant is inhabited 
	 * by an item of type {@code T}.
	 * 
	 * @param <T> Should be one of the variant's supplied types.
	 * @param type Class of {@code T}.
	 * @return {@code true} if the variant is inhabited by an item of type {@code T}, false otherwise.
	 */
	public <T> boolean is(Class<T> type) {
		return variantHolder.is(type);
	}
	
	/**
	 * Gets the item inhabiting the variant as a {@code T}.
	 * 
	 * @param <T> Should be one of the variant's supplied types.
	 * @return Item inhabiting the variant as the given type {@code T}.
	 */
	@SuppressWarnings("unchecked")
	public <T> T get() {			
		return ((VariantHolder<T>)variantHolder).get();
	}
	
	/**
	 * Gets the item inhabiting the variant as an Object.
	 * 
	 * @return Item inhabiting the variant as an Object.
	 */
	public Object getItem() {
		return variantHolder.getItem();
	}
	
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof VariantBase)) return false;
		
		VariantBase other = (VariantBase)obj;
		
		return index == other.index && getItem().equals(other.getItem());
	}
	
	public int hashCode() {
		return getItem().hashCode();
	}
}
