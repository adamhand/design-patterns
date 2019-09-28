package state.implement0;

public class Context {
    private State state;

    public Context(){
        state = new ConcreteState0();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle(){
        state.handle(this);
    }
}
