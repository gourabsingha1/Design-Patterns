## Pizza Shop
- The Pizza Shop system allows customers to order pizzas
  and customize them with various toppings.
- The goal is to implement a flexible system where pizzas can be dynamically customized
  with different toppings while maintaining a clean, scalable codebase.


## Bad Design (Violating Decorator Design Pattern)
- Each time a new topping or combination of toppings is introduced, a new subclass is created.
- As more toppings and pizzas are added, the number of combinations grows exponentially
- The system is not open for extension but requires modification (new classes)
  for every new combination of pizzas and toppings.


## Good Design (Using Decorator Design Pattern)
- The system has a Pizza interface, which defines the basic structure of pizzas
- Concrete pizza classes like MargheritaPizza, VeggiePizza, and PepperoniPizza
  implement the Pizza interface
- A ToppingDecorator abstract class extends the Pizza interface
  and contains a reference to a Pizza object. This allows us
  to "wrap" a pizza with additional functionality (i.e., toppings).
- Concrete decorators such as CheeseDecorator, OliveDecorator, and MushroomDecorator
  extend the ToppingDecorator class. Each decorator adds a topping’s cost
  and description by wrapping an existing pizza object.
- This design allows for flexible, dynamic combinations of toppings at runtime,
  and you only need to create a new decorator class when introducing a new topping,
  not a new subclass for every possible combination.


## When to Use
- You need to avoid creating a large number of subclasses
  to support every possible combination of functionalities.


## Use Cases
- GUI Libraries: A text field wrapped with a scrollable decorator.
- Java I/O Streams: The Java I/O library heavily uses the Decorator pattern.
  For example, you can wrap an InputStream with a BufferedInputStream
  and then further wrap it with an ObjectInputStream to add multiple functionalities
  like buffering and object serialization dynamically.