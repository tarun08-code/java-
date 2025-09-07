public class Whatsapp2 extends Whatsapp1 {
    @Override
    void display() {
        super.display(); // calls Whatsapp1's display()
        System.out.println("double tick supported");
    }

    void call() {
        System.out.println("call supported");
    }
}
