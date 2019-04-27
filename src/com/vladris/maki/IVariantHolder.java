package com.vladris.maki;

interface IVariantHolder {
	<T> boolean is(Class<T> type);
		
	Object getItem();
}
