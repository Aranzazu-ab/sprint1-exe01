package sprint1.exe01;

public class StringInstrument extends Instrument {

    public StringInstrument (String name, double price) {
        super (name, price);
    }

    @Override
    public void play(){
        System.out.println("It's playing a string instrument");
    }
}
