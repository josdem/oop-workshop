OOP Workshop
------------------------------------

This demo application is intended to show how apply herency using abstract classes and interfaces

**Inheritance Abstract Classes**

* `Animal` is an abstract class and specify abstract method `String getGreeting()`
* `Animal` has a construct method to specify if is mammal and carnivorous
* Create concrete classes `Dog`, `Cow` and `Duck` as `Aninmal` subclasses

**Inheritance Interface Classes**

* `Animal` is an interface and specify a method `String getGreeting(String name)`
* Create concrete classes `Dog`, `Cow` and `Duck` as `Aninmal` implementations

### To Test

```bash
gradle test
```

### To Run

```bash
gradle bootRun
```