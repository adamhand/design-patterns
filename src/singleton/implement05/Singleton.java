package singleton.implement05;

/*静态内部类实现*/
public class Singleton {
    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton  getInstance() {
        return SingletonHolder.INSTANCE;
    }
}