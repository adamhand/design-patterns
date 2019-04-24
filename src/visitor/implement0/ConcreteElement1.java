package visitor.implement0;

public class ConcreteElement1 implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operation1(){
        return "具体元素1的操作";
    }
}
