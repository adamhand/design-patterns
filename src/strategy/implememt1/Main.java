package strategy.implememt1;

public class Main {
    public static void main(String[] args) {
        Chameleon chameleon = new Chameleon();
        chameleon.setColorBehavior(new BecomeYellow());
        chameleon.doChangeColor();

        chameleon.setColorBehavior(new BecomeBlue());
        chameleon.doChangeColor();
    }
}
