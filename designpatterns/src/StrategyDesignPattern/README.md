## Discount System
- In an e-commerce application, customers can receive discounts
  based on different strategies, such as Seasonal Discount, Loyalty Discount, or Coupon Discount.
- We want to design a system that allows flexibility in applying these discounts.


## Bad Design (Violating Strategy Pattern)
- The discount logic is handled inside the Order class itself, 
  using conditional statements to determine which discount to apply.
- This design tightly couples the discount logic with the Order class.
- To add a new discount type (e.g., a Black Friday discount),
  we would need to modify the Order class, violating the open/closed principle.
- The class is not open for extension but is being modified.


## Good Design (Using Strategy Design Pattern)
- Instead of embedding discount logic in the Order class, 
  we will encapsulate the discount strategies in separate classes,
  allowing them to be interchangeable and extendable.
- We can easily switch between discount strategies
  by passing different implementations of the DiscountStrategy interface.
- Each discount strategy can be tested independently of the Order class,
  making the system easier to test.


## When to use
- When all the child share same functionalities