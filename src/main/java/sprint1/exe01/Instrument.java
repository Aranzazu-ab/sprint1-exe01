package sprint1.exe01;

public abstract class Instrument {
    private String name;
    private double price;

    public static int total = 0;

    static{
        System.out.println("Class Instrument is loaded.");
    }

    public Instrument(String name, double price){
        this.name = name;
        this.price=price;
        total++;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void play ();
}

