package sprint01.exe01;

//Main that demostrates that the class is loaded when a static member is accessed.

public class MainB {
    static void main() {
        System.out.println("Getting access to a static attribute: ");
        System.out.println(Instrument.total);
    }
}
