package sprint01.exe01;

public class Main {
    static void main() {
        Instrument wind01 = new WindInstrument("saxophone", 85.00);
        Instrument string01 = new StringInstrument("violin", 140.00);
        Instrument percussion01 = new PercussionInstrument("drums", 250.00);

        wind01.play();
        string01.play();
        percussion01.play();
    }
}
