# SOLID_Principles_and_Design_Patterns
 Example implementations of SOLID Principles and common Design Patterns

## SOLID Principles:
### S - Single Responsibility:
* There should never be more than one reason for a class to change.
* Focused, single functionality
* Addresses a specific concern
### O - Open Closed:
* Entities (Classes, Modules, Methods, ets.) should be open for extension, but closed for modification
* Open for Extension: Extend existing behavior and
* Closed for Modification: Existing code remains unchanged
### L - Liskov Substitution:
* Should be able to substitute base class objects with child class objects and this should not alter behavior or characteristics of the program
### I - Interface Segregation:
* Clients should not be forced to depend on interfaces that they do not use
* Signs ofInterface Pollution:
  * Large Interfaces
  * Classes have empty method implementations
  * Method implementations throw UnsupportedOperationException (or similar)
  * implementations return null or default/dummy values
### D - Dependency Inversion:
* High level modules should not depend on low level modules
    * Both should depend on abstraction
* Abstraction should not depend on details
    * Details should depend on abstraction


## Design Patterns:
## 1. Creational
* Deal with the process of creating objects of classes
### 1. Builder
### 2. Simple Factory
### 3. Factory
### 4. Abstract Factory
### 5. Prototype
### 6. Singleton
### 7. Object Pool

## 2. Structural
* Deal with how classes and objects are arranged or composed
### 1. Adapter
### 2. Bridge
### 3. Decorator
### 4. Composite
### 5. Facade
### 6. Flyweight
### 7. Proxy

## 3. Behavioral
* Describe how classes and objects interact and communicate with each other
### 1. Chain of Responsibility
### 2. Command
### 3. Interpreter
### 4. Mediator
### 5. Iterator
### 6. Observer
### 7. State
### 8. Strategy
### 9. Template Method
### 10. Visitor
### 11. Null Object