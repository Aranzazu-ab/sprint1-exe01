package sprint1.exe02;

public class Main {
    static void main() {
//  java: non-static method accelerate() cannot be referenced from a static context
//        Car.accelerate();
//  static method referenced without any object.
        Car.brake();

//  Comprobation atribut final power is initializated on constructor and can't be changed.
        Car car1 = new Car(500);
        System.out.println("Car1 power is: " + car1.power);

//      java: cannot assign a value to final variable power
//        car1.power=200;

        Car car2 = new Car(400);
        System.out.println("Car2 power is: " + car2.power);

//      Brand can be changed because is final and it's the same for all the class Car
//        Car.brand = "Mercedez";
        System.out.println("Car1 brand: " + car1.brand);
        System.out.println("Car2 brand: " + car2.brand);

        //Model for Cars
        System.out.println("Car1 model: " + car1.model);
        System.out.println("Car2 model: " + car2.model);

        //Change model
        Car.model = "Focus";
        System.out.println("Model has been changed.");
        System.out.println("Car1 model: " + car1.model);
        System.out.println("Car2 model: " + car2.model);

//      After initializate the objects the non static method can be used:
        System.out.println("Car1: "+ car1.accelerate());
        System.out.println("Car2: "+ car2.accelerate());

    }
}