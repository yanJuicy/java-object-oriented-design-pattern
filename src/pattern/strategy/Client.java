package pattern.strategy;

public class Client {

    public static void main(String[] args) {
        Robot t = new TaekwonV("TaekwonV");
        Robot a = new Atom("Atom");

        System.out.println("My name is " + t.getName());
        t.move();
        t.attack();

        System.out.println();

        System.out.println("My name is " + a.getName());
        a.move();
        a.attack();
    }

}
