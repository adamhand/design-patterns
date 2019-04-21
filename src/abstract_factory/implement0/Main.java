package abstract_factory.implement0;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactoryA = new ConcreteFactoryA();
        AbstractProductA abstractProductA = abstractFactoryA.createProductA();
        AbstractProductB abstractProductB = abstractFactoryA.createProductB();

        AbstractFactory abstractFactoryB = new ConcreteFactoryB();
        AbstractProductA abstractProductA1 = abstractFactoryB.createProductA();
        AbstractProductB abstractProductB1 = abstractFactoryB.createProductB();
    }
}
