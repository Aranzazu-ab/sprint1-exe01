package sprint1.exe02;

public class Main {
    static void main() {
        Car.brake();

        Car car1 = new Car(500);
        System.out.println("Car1 power is: " + car1.power);

        Car car2 = new Car(400);
        System.out.println("Car2 power is: " + car2.power);

        System.out.println("Car1 brand: " + car1.BRAND);
        System.out.println("Car2 brand: " + car2.BRAND);

        System.out.println("Car1 model: " + car1.model);
        System.out.println("Car2 model: " + car2.model);

        Car.model = "Focus";
        System.out.println("Model has been changed.");
        System.out.println("Car1 model: " + car1.model);
        System.out.println("Car2 model: " + car2.model);

        car1.accelerate();
        car2.accelerate();

    }
}