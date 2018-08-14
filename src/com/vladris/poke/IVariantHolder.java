package com.vladris.poke;

interface IVariantHolder {
	<T> boolean is(Class<T> type);
		
	Object getItem();
}
