## Notification System
- Consider a system that sends notifications via email or SMS.


## Bad Design (Violating Dependency Inversion Principle)
- In this design, the high-level NotificationService class directly depends
  on the low-level EmailService and SMSService classes (Tight coupling)
- This makes it difficult to extend or modify the notification mechanism (e.g., adding Push Notification).


## Good Design (Following Dependency Inversion Principle)
- To fix this design and follow the Dependency Inversion Principle,
  we need to introduce an abstraction (NotificationSender) that both EmailService and SMSService will implement.
- The NotificationService will now depend on the abstraction rather than the concrete classes.