package sprint1.n2exe01;

public class MainSmartphone {
    static void main () {

        Smartphone mymobile = new Smartphone("Xiaomi", "Redmi 13");

        mymobile.call(7777777);
        mymobile.takePhoto();
        mymobile.alarm();
    }
}
