package singleton.implement03;

import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
//        AtomicReference reference = new AtomicReference();
//        System.out.println(reference.get());

        Singleton singleton0 = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton0 == singleton1);
    }
}
