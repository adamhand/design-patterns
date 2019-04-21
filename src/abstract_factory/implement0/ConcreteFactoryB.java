package abstract_factory.implement0;

public class ConcreteFactoryB extends AbstractFactory {
    @Override
    AbstractProductA createProductA() {
        System.out.println("ConcreteFactoryB生产商品ProductA");
        return new ConcreteProductA();
    }

    @Override
    AbstractProductB createProductB() {
        System.out.println("ConcreteFactoryB生产商品ProductB");
        return new ConcreteProductB();
    }
}
