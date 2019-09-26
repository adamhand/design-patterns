package strategy.implememt1;

public class Chameleon {
    private ColorBehavior colorBehavior;

    public void setColorBehavior (ColorBehavior  colorBehavior) {
        this.colorBehavior = colorBehavior;
    }

    public void doChangeColor() {
        if (colorBehavior != null) {
            colorBehavior.changeColor();
        }
    }
}
