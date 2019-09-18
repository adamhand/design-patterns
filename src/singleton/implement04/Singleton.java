package singleton.implement04;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 10, 0L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(10000));

        CountDownLatch lantch = new CountDownLatch(1);

        for (int i = 0; i < 10000; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        lantch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Singleton instance = Singleton.getInstance();
                    System.out.println(instance);
                }
            });
        }
        lantch.countDown();
        pool.shutdown();
    }
}
