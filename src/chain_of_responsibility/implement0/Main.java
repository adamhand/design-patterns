package chain_of_responsibility.implement0;

public class Main {
    public static void main(String[] args) {
        Handler handler0 = new ConcreteHandler0();
        Handler handler1 = new ConcreteHandler1();
        handler0.setNext(handler1);

        handler0.handleRequest("one");
    }
}
