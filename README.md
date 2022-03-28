# SOLID_Principles_and_Design_Patterns
 Example implementations of SOLID Principles and common Design Patterns

##SOLID Principles:
### 1. Single Responsibility:
* There should never be more than one reason for a class to change.
* Focused, single functionality
* Addresses a specific concern
### 2. Open Closed:
* Entities (Classes, Modules, Methods, ets.) should be open for extension, but closed for modification
* Open for Extension: Extend existing behavior and
* Closed for Modification: Existing code remains unchanged
### 3. Liskov Substitution:
* Should be able to substitute base class objects with child class objects and this should not alter behavior or characteristics of the program
### 4. Interface Segregation:
* Clients should not be forced to depend on interfaces that they do not use
* Signs ofInterface Pollution:
  * Large Interfaces
  * Classes have empty method implementations
  * Method implementations throw UnsupportedOperationException (or similar)
  * implementations return null or default/dummy values
### 4. Dependency Inversion:
* High level modules should not depend on low level modules
    * Both should depend on abstraction
* Abstraction should not depend on details
    * Details should depend on abstraction