package strategy.implememt1;

public class BecomeYellow implements ColorBehavior{
    @Override
    public void changeColor() {
        System.out.println("become yellow");
    }
}
