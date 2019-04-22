package proto_type.implement0;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Naruto naruto = new Naruto();
        Naruto naruto1 = (Naruto) naruto.clone();
        System.out.println(naruto == naruto1);
    }
}
