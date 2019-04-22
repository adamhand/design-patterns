package mediator.implement0;

public class ConcreteColleague1 extends Colleague {
    @Override
    public void send() {
        System.out.println("concrete colleague1 send");
        mediator.relay(this);
    }

    @Override
    public void receive() {
        System.out.println("concrete colleague1 receive");
    }
}
