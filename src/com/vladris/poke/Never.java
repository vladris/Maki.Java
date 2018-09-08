package com.vladris.poke;

/**
 * 
 * Represents an uninhabitable type.
 * 
 * <p>
 * Never is impossible to instantiate, thus it can be use to denote absence of a value. The following
 * example shows two use-cases of Never: explicitly showing a method does not return and as a generic
 * type argument to remove the type option.
 * </p>
 * 
 * <pre>{@code
 * class Sample {
 *     // This function never returns
 *     static Never Fail(String message) throws Exception {
 *         throw new Exception(message);
 *     }
 *
 *	   // This function also never returns
 *     static Never LoopForever() {
 *         while (true) {
 *         }
 *     }
 *     
 *     // Assume a generic library method which expects an Either<T, U>
 *     static <T, U> void NeedsGenericEither(Either<T, U> either) {
 *         // ...
 *     }
 *     
 *     static void Example() {
 *         // We can remove a type from Either by providing Never
 *         Either<Integer, Never> either = new Either<Integer, Never>(42);
 * 
 *         NeedsGenericEither(either);
 *     }
 * }
 * }</pre>
 *
 */
public final class Never {
	private Never()	{ }
}
