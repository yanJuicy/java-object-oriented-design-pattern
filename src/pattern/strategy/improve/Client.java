package pattern.strategy.improve;

public class Client {

    public static void main(String[] args) {
        Robot t = new TaekwonV("TaekwonV");
        Robot a = new Atom("Atom");

        t.setMovingStrategy(new WalkingStrategy());
        t.setAttackStrategy(new MissileStrategy());

        a.setMovingStrategy(new FlyingStrategy());
        a.setAttackStrategy(new PunchStrategy());

        System.out.println("My name is " + t.getName());
        t.move();
        t.attack();

        System.out.println();

        System.out.println("My name is " + a.getName());
        a.move();
        a.attack();
    }

}
