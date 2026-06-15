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
* `BRAND` (static final)
* `model` (static)
* `power` (final)

Methods: 
* `brake()` (static)
* `accelerate()` (non static)

### TESTING AND OBSERVATION
In the Car class, attributes are set to test whether they can be accessed and modified from outside the class.
A setter for `power` was considered but could not be implemented because power is a final attribute, once assigned, it's value can't be change:
`public void setPower(int power){this.power=power; }`

Calling `accelerate()` method without create any object, throws an error: 
`java: non-static method accelerate() cannot be referenced from a static context`.
This happens because `accelerate()` belongs to an instance, so an object must exist first.
And in contrast, `brake()` works without an object since it is static and belongs to the class itself.

Trying to modify power on car1 object throws an error:
`java: cannot assign a value to final variable power`
That confirms that final variables cannot be reassigned after initialization.

When a second object is created `car2` both objects share the same `BRAND` and `model` values, since those are static and belong to the class.
Changing `model` throug one object updates it for all instances.

While try to change `BRAND`, isn't possible because it's a final attribute. 
Finally, calling `accelerate()` after creating an object works correctly.


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
In MainSmartphone a smartphone is created and the `call()`, `takePhoto()` and `alarm()` methods are created.

### RESULTS
The output of the three methods mentioned is shown, because the Smartphone object inherits the `call()` method from Phone and also implements the methods required by Camera and Clock.
This exercise demonstrates how a class can inherit from another class while implementing multiple interfaces and add different functionalities.