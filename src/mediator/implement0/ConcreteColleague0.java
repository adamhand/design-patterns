package mediator.implement0;

public class ConcreteColleague0 extends Colleague {
    @Override
    public void send() {
        System.out.println("concrete colleague0 send");
        mediator.relay(this);
    }

    @Override
    public void receive() {
        System.out.println("concrete colleague0 receive");
    }
}
