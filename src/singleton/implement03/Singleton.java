package singleton.implement03;

import java.util.concurrent.atomic.AtomicReference;

public class Singleton {
    private static final AtomicReference<Singleton> INSTANCE = new AtomicReference<>();

    private Singleton(){}

    public static Singleton getInstance(){
        for(;;){
            Singleton singleton = INSTANCE.get();
            if (null != singleton){
                return singleton;
            }
            singleton = new Singleton();
            if (INSTANCE.compareAndSet(null, singleton)){
                return singleton;
            }
        }
    }
}
