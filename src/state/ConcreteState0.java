package state;

public class ConcreteState0 implements State {
    @Override
    public void handle(Context context) {
        System.out.println("concrete state0 handler");
        context.setState(new ConcreteState1());
    }
}
