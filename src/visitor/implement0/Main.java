package visitor.implement0;

public class Main {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.addElement(new ConcreteElement0());
        os.addElement(new ConcreteElement1());

        Visitor visitor = new ConcreteVisitor0();
        os.accept(visitor);

        visitor = new ConcreteVisitor1();
        os.accept(visitor);
    }
}
