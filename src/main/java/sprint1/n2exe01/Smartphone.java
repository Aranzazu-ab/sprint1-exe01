package sprint1.n2exe01;

public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone (String brand, String model){
        super(brand,model);
    }

    @Override
    public void takePhoto() {
        System.out.println("It's taking a photo.");
    }

    @Override
    public void alarm() {
        System.out.println("It's ringing an alarm");
    }
}
