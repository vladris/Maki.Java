package com.vladris.poke;

final class VariantHolder<T> implements IVariantHolder {
	private T item;
	
	public VariantHolder(T item) {
		this.item = item;
	}
	
	public <U> boolean is(Class<U> type) {
		return type.equals(item.getClass());
	}
	
	public T get() {
		return item;
	}
	
	public Object getItem() {
		return item;
	}
}
