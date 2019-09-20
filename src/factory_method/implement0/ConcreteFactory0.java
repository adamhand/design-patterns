package factory_method.implement0;

public class ConcreteFactory0 implements AbstractFactory{
    @Override
    public AbstractProduct newProduct() {
        System.out.println("i am concrete factory0, i produce concrete product0");
        return new ConcreteProduct0();
    }
}
