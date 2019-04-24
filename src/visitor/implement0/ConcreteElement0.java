package visitor.implement0;

public class ConcreteElement0 implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operation0(){
        return "具体元素0的操作";
    }
}
