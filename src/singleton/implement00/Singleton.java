package singleton.implement00;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*饿汉的变种，使用静态代码块*/
public class Singleton {
    private static Singleton instance = null;

    static {
        instance = new Singleton();
    }

    private Singleton() {}

    public static Singleton getInstance(){
        return instance;
    }
}

class Main {
    public static void main(String[] args) throws Exception{
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);

        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton1 = constructor.newInstance();

        System.out.println(singleton == singleton1);
    }
}
