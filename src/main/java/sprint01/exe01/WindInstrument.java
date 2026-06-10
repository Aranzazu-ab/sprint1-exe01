package sprint01.exe01;

public class WindInstrument extends Instrument {

    public WindInstrument (String name, double price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("It's playing a wind instrument");
    }
}
