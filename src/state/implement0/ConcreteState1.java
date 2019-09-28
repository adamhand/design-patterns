package state.implement0;

public class ConcreteState1 implements State {
    @Override
    public void handle(Context context) {
        System.out.println("concrete state1 handler");
        context.setState(new ConcreteState0());
    }
}
