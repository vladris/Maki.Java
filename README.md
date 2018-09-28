# Poké

A Java type library.

[![Build Status](https://travis-ci.org/vladris/poke.svg?branch=master)](https://travis-ci.org/vladris/poke)

[Online documentation](https://vladris.com/poke/doc/index.html)

Poke provides discriminate unions of up to 8 types (``Variant1<T1>``,
``Variant2<T1, T2>`` ... ``Variant8<T1, T2, ...>``), ``Unit`` and ``Never``,
an ``Either<TLeft, TRight>`` union and an ``Error<T>`` monad.

## Samples

* [Variant](#variant)
* [Either](#either)
* [Error](#error)
* [Never](#never)

### Variant

``VariantN<...>`` represents a discriminate union type of up to 8 types. Unlike
using a base type and inheritance, a ``Variant`` represents a closed set of
types and no relationship between them is needed.

```java
Variant3<String, Integer, Double> variant = new Variant3<>("Hello world!");

// Use is(T.class) to test for inhabiting type, <T>get() to retrieve it
assertTrue(variant.is(String.class));
System.out.println(variant.<String>get());

// Can reassign another type
variant.set(42);

assertTrue(variant.is(Integer.class));

// Use Apply and supply it with an action or function for each possible type,
// the one corresponding to the inhabiting type will get called
variant.apply(
    s -> { System.out.println("It's a string!"); },
    i -> { System.out.println("It's an int!"); },
    d -> { System.out.println("It's a double!"); });
```

### Either

``Either<TLeft, TRight>`` can hold a value of either ``TLeft`` or ``TRight``
type.

```java
Either<String, Integer> either = Either.makeLeft("Hello world!");

assertTrue(either.isLeft());
assertFalse(either.isRight());

System.out.println(either.getLeft());

either.setRight(42);

assertFalse(either.isLeft());
assertTrue(either.isRight());

System.out.println(2 * either.getRight());
```

### Error

``Error<T>`` represents a value of type ``T`` or an ``Exception``. This allows
packaging exceptions as part of the return type and handling them at any point
in the code.

```java
// Initialize with a function that may throw
Error<String> error = Error.make(() ->
    {
        Random random = new Random();

        if (random.nextBoolean())
            throw new Exception();

        return "Success";
    });

if (error.hasValue())
    System.out.println(error.getValue());
else
    System.out.println("Exception was thrown: " + error.getError());
```

### Never

Using ``Never`` as a return type explicitly shows the function cannot return.

```java
public Never LoopsForever() {
    while (true) {
    }
}

public Never AlwaysThrows() throws Exception {
    throw new Exception();
}
```
