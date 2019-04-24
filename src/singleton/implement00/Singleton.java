package singleton.implement00;

public class Singleton {
    private static Singleton instance = null;

    static {
        instance = new Singleton();
    }

    private Singleton() {}

    public Singleton getInstance(){
        return instance;
    }
}
