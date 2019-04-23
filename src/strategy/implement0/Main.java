package strategy.implement0;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setQuackBehavior(new Quack());
        duck.doQuack();
        duck.setQuackBehavior(new Squeak());
        duck.doQuack();
    }
}
