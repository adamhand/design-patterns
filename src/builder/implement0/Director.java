package builder.implement0;


public class Director {
    private AbstratBuilder builder;

    public Director(AbstratBuilder builder){
        this.builder = builder;
    }

    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();

        return builder.getProduct();
    }
}
