package factory_method.implement0;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory0 = new ConcreteFactory0();
        AbstractProduct product0 = factory0.newProduct();
        product0.show();
    }
}
