package strategy.implement0;

public class Duck {
    private QuackBehavior quackBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public void doQuack(){
        if (quackBehavior != null){
            quackBehavior.quack();
        }
    }
}
