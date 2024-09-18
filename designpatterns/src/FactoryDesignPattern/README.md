## Vehicle Factory
- The Vehicle Factory is a conceptual system for creating instances
  of different types of vehicles.
- It provides a way to encapsulate the creation logic for various vehicle types,
  such as Car, Bike, and Truck


## Bad Design (Violating Factory Design Pattern)
- Vehicle, Car, Bike, and Truck are the same as in the good design.
- The factory methods createCar(), createBike(), and createTruck() add unnecessary complexity.
- Direct instantiation using new Car(), new Bike(), or new Truck() would be simpler and clearer.
- Does not provide a mechanism for dynamic object creation based on input.


## Good Design (Using Factory Design Pattern)
- The VehicleFactory class provides a single method, getVehicle(),
  that returns an instance of Vehicle based on the input parameter.
- This approach abstracts the instantiation process from the client.


## When to use
- Dynamic Object Creation: When the exact type of object to be created is not known
  until runtime and can vary based on user input or other factors.
- Complex Creation Logic: When object creation involves complex logic
  that should be encapsulated and hidden from the client.


## Use cases
- Database Connections: Creating different types of database connections (e.g., SQL, NoSQL)
  where the type is determined at runtime based on configuration settings.
- Document Generation: Generating different types of documents (e.g., PDF, Word, Excel)
  where the format is chosen based on user input or document requirements.