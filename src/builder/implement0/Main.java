package builder.implement0;

public class Main {
    public static void main(String[] args) {
        AbstratBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        Product product = director.construct();
        product.show();
    }
}
