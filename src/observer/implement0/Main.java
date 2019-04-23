package observer.implement0;

public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer0 = new ConcreteObserver0();
        Observer observer1 = new ConcreteObserver1();

        subject.addObserver(observer0);
        subject.addObserver(observer1);
        subject.notifyObserver();
    }
}
