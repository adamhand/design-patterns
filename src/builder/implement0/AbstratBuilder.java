package builder.implement0;

public abstract class AbstratBuilder {
    protected Product product = new Product();
    public abstract void  buildPartA();
    public abstract void  buildPartB();
    public abstract void  buildPartC();

    public Product getProduct(){
        return product;
    }
}
