package com.vladris.poke;

public class VariantBase {
	private IVariantHolder variantHolder;
	private byte index;
	
	<T> VariantBase(T item, byte index) {
		set(item, index);
	}
	
	protected <T> void set(T item, byte index) {
		this.variantHolder = new VariantHolder<T>(item);
		this.index = index;
	}
	
	public byte getIndex() {
		return index;
	}
	
	public <T> boolean is(Class<T> type) {
		return variantHolder.is(type);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T get() {			
		return ((VariantHolder<T>)variantHolder).get();
	}
	
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
