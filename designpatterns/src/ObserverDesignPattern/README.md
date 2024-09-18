## Stock Price Notification System
- In a stock market application, users might want to receive updates
  when the price of a stock changes.
- The Stock object (subject) can have multiple users (observers)
  who want to get notified when the stock price is updated.


## Bad Design (Violating Observer Design Pattern)
- In this design, the Stock class has to explicitly notify each observer.
- If we need to add or remove observers or change the way notifications are sent,
  we will need to modify the Stock class, violating the open/closed principle.


## Good Design (Using Observer Design Pattern)
- The Stock class (subject) maintains a list of observers
  and notifies them whenever its state changes.
- Observers can dynamically subscribe or unsubscribe from the notifications.


## When to use
- You need a one-to-many relationship: When one object’s change in state
  needs to be communicated to multiple dependent objects.
- You need decoupled communication: You want to decouple the subject and its observers
  so that the subject doesn’t need to know specific details about its observers.
- State changes trigger notifications: Whenever the state of the subject changes,
  multiple other parts of the system need to react.
- Dynamic subscription to updates: You want observers to
  be able to subscribe or unsubscribe from receiving updates dynamically.


## Use cases
- Event Handling Systems (UI frameworks): In Java's Swing, button clicks
  notify registered listeners about the event.
- Real-Time Data Systems: A stock price monitoring app
  where users subscribe to updates on certain stocks.
- Logging Systems: When multiple components of a system (e.g., file logger, database logger, console logger)
  need to log events happening in the application, they can observe the main event system and act accordingly.
- Messaging/Notification Systems: Any type of notification or alert system,
  where observers (e.g., users, devices) are notified of certain events.
- Distributed Systems: In a service-oriented architecture, when one service updates its state,
  others need to be notified to perform related operations.