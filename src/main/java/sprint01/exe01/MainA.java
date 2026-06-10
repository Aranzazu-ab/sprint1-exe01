package sprint01.exe01;

//Main that demostrates the inheritance and polimorphism between the superclass Instrument and its subclasses.
//Also, this illustrates how using a static initialization block in the Instrument superclass and creating the first
//instance of subclass, the super class is loaded and initialized once, regardless of how many objects are created.

public class MainA {
    static void main() {
        Instrument wind01 = new WindInstrument("saxophone", 85.00);
        Instrument string01 = new StringInstrument("violin", 140.00);
        Instrument percussion01 = new PercussionInstrument("drums", 250.00);

        wind01.play();
        string01.play();
        percussion01.play();
    }
}
