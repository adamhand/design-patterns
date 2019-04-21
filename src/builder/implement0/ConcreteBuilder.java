package builder.implement0;

public class ConcreteBuilder extends AbstratBuilder {
    @Override
    public void buildPartA() {
        product.setPartA("set partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("set partB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("set partC");
    }
}
