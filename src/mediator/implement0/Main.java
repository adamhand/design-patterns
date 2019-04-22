package mediator.implement0;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague0 = new ConcreteColleague0();
        Colleague colleague1 = new ConcreteColleague1();

        mediator.register(colleague0);
        mediator.register(colleague1);

        colleague0.send();
        System.out.println(".................");
        colleague1.send();
    }
}
