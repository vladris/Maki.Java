package com.vladris.poke;

/**
 * Represents a unit type.
 * 
 * <p>
 * A unit type has only one possible value. It is semantically equivalent to Void, but
 * can be instantiated.
 * </p>
 */
public final class Unit {
	private Unit() { }

    private static class UnitHolder { 
        public static final Unit instance = new Unit();
    }

    /**
     * Gets the singleton Unit value.
     * 
     * @return Singleton Unit value.
     */
    public static Unit get() {
        return UnitHolder.instance;
    }
}
