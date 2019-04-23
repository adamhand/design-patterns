package memento.implement0;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("s0");
        careTaker.setMemento(originator.createMemento());
        System.out.println("初始状态为： " + originator.getState());

        originator.setState("s1");
        System.out.println("新的状态为： " + originator.getState());

        originator.restoreMemeto(careTaker.getMemento());
        System.out.println("回滚之后的状态为： " + originator.getState());
    }
}
