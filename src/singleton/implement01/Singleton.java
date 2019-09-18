package singleton.implement01;

import java.io.*;

/*饿汉式*/
public class Singleton implements Serializable {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return INSTANCE;
    }
}

class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton singleton = Singleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Singleton.obj"));
        oos.writeObject(singleton);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Singleton.obj"));
        Singleton singleton1 = (Singleton) ois.readObject();
        ois.close();

        System.out.println(singleton);
        System.out.println(singleton1);
        System.out.println(singleton == singleton1);
    }
}
