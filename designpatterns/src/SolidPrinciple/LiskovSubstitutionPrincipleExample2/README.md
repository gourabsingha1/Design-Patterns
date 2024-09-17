## Payment Processing System
- We want to design a system where we can process payments
  using different payment methods, such as Credit Card and PayPal.
- The PaymentProcessor class is the base class,
  and the CreditCardProcessor and PayPalProcessor classes are derived from it.


## Bad Design (Violating Liskov Substitution Principle)
- In this bad design, we assume all payment processors handle certain payment details in a similar way.
- But we make faulty assumptions when overriding the method for PayPal.
- The PayPalProcessor class throws an exception when the validateCardDetails method is called. 
- This breaks the Liskov Substitution Principle,
  because a PaymentProcessor instance is supposed to validate card details
  but the subclass (PayPal) doesn't follow the same contract.
- If you replace PaymentProcessor with PayPalProcessor,
  the program will crash if card validation is attempted.


## Good Design (Following Liskov Substitution Principle)
- To fix this, we need to decouple the validation of card details
  from the PaymentProcessor class and make sure PayPal doesn't inherit unnecessary behaviors.
- We can split the design into more specific classes.