package memento.implement0;

public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restoreMemeto(Memento memento){
        this.state = memento.getState();
    }
}
