package factory_method.implement0;

public class ConcreteFactory1 implements AbstractFactory{
    @Override
    public AbstractProduct newProduct() {
        System.out.println("i am concrete factory1, i produce concrete product1");
        return new ConcreteProduct1();
    }
}
