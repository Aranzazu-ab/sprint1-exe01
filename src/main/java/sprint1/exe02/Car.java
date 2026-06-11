package sprint1.exe02;

public class Car {
    public static final String brand = "Ford";
    public static String model = "Fiesta";
    public final int power;

    //Constructor
    public Car (int power){
        this.power = power;
    }
//Getters
    public int getPower(){
        return power;
    }

    public static String getModel(){
        return model;
    }

    //Setter
    public static void setModel(String model) {
        Car.model = model;
    }

//    public void setPower(int power){
//        this.power=power;
//    }

    //Methods
    public static void brake(){
        System.out.println("The car is braking");
    }

    public void accelerate(){
        System.out.println("The car is accelerating");
    }
}
