package com.vladris.poke;

public final class Unit {
	private Unit() { }

    private static class UnitHolder { 
        public static final Unit instance = new Unit();
    }

    public static Unit get() {
        return UnitHolder.instance;
    }
}
