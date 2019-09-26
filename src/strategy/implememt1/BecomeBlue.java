package strategy.implememt1;

public class BecomeBlue implements ColorBehavior{
    @Override
    public void changeColor() {
        System.out.println("become blue");
    }
}
