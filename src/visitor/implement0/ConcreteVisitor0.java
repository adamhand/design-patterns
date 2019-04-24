package visitor.implement0;

public class ConcreteVisitor0 implements Visitor {
    @Override
    public void visit(ConcreteElement0 element) {
        System.out.println("具体访问者0访问："+element.operation0());
    }

    @Override
    public void visit(ConcreteElement1 element) {
        System.out.println("具体访问者0访问："+element.operation1());
    }
}
