package proto_type.implement0;

public class Naruto implements Cloneable {
    public Naruto(){
        System.out.println("我是鸣人本体");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("我是鸣人的影分身");
        return (Naruto)super.clone();
    }
}
