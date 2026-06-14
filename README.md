# SPRINT 1

## LEVEL1 MUSICAL INSTRUMENTS
This goal of this exercise is to practice POO concepts in Java, like, inheritance,
polymorphism, abstract classes and methods, class loading and static initializacion blocks.

### CLASS STRUCTURE
**Astract class** 
`Instrument`

Attributes:
* `name`
* `price`
* `static int total`

Abstract method:
* `play()` 

**Subclasses**
* WindInstrument
* StringInstrument
* PercussionInstrument

Overrides `play()` method in each subclasses.

## LEVEL1 CARS
The goal of this exercise is understand the difference between `static` and `final`, 
how do they work, if they can be changed and when they get initialized.

### CLASS STRUCTURE
Attributtes:
* `brand` (static final)
* `model` (static)
* `power` (final)

Methods: 
* `brake()` (static)
* `accelerate()` (non static)

### TESTING AND OBSERVATION
In the main file I try to call the `accelerate()` method without create any object, but it get and error; while it works for `brake(`) method.
A `car1` object was created but when I try to change the power it gives me an error.
Also create another object and call for their brand and models, and it was the same for both.
When change the  model, the model change in both objects. And finally I try again call the `accelerate()` method and now it works.

### RESULTS
The power attribute can be initialized in the constructor because it's a final instance attribute, each car can have different values.
The brand and power attributes can't be modified because they are initialized as final instance.
Also, the brand and model attributes affect all the instances of class because they are declared as static, so they belong to the class and no to each object.

The static instance in methods applies the same, that is why the static `brake()` method that belongs to the Car class can be used-called without creating an object.
While, the `accelerate()` methods isn't static and belongs to each object, so they can be used only after the object car was created.

## LEVEL 2 SMARTPHONE
The goal of this exercise is to practice and understand the inheritance and interfaces, as well as the similarities and differences between an abstract class and an interface.

### STRUCTURE
Class phone.
Atributes:
* `brand`
* `model`

Method:
* `call()`

Interface Camera
* `takePhoto()` 

Interface Clock
* `alarm()`

Class Smartphone:
Extends: 
* Phone

Implements:
* Camera
* Clock

Overrides methods:
* ` takePhoto()`
* `alarm()`

### TESTING
In MainSmartphone a smartphone is created and the call(), takePhoto() and alarm() methods are created.

### RESULTS
The output of the three methods mentioned is shown, because the Smartphone object inherits the call() method from Phone and also implements the methods required by Camera and Clock.
This exercise demonstrates how a class can inherit from another class while implementing multiple interfaces and add different functionalities.