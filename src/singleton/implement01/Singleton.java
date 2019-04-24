package singleton.implement01;

public class Singleton {
    private Singleton(){}

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
