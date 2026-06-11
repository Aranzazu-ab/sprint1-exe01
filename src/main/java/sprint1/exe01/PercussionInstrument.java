package sprint1.exe01;

public class PercussionInstrument extends Instrument {

    public PercussionInstrument (String name, double price) {
        super (name, price);
    }

    @Override
    public void play(){
        System.out.println("It's playing a percussion instrument");
    }
}
