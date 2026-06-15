package sprint1.exe02;

public class Car {
    public static final String BRAND = "Ford";
    public static String model = "Fiesta";
    public final int power;


    public Car (int power){
        this.power = power;
    }

    public int getPower(){
        return power;
    }

    public static String getModel(){
        return model;
    }


    public static void setModel(String model) {
        Car.model = model;
    }

    public static void brake(){
        System.out.println("The car is braking");
    }

    public void accelerate(){
        System.out.println("The car is accelerating");
    }
}
