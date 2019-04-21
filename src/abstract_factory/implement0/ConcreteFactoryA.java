package abstract_factory.implement0;

public class ConcreteFactoryA extends AbstractFactory {
    @Override
    AbstractProductA createProductA() {
        System.out.println("ConcreteFactoryA生产商品ProductA");
        return new ConcreteProductA();
    }

    @Override
    AbstractProductB createProductB() {
        System.out.println("ConcreteFactoryA生产商品ProductB");
        return new ConcreteProductB();
    }
}
