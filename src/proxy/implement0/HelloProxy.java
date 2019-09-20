package proxy.implement0;

public class HelloProxy implements Hello{
    private HelloImpl helloImpl;

    HelloProxy() {
        helloImpl = new HelloImpl();
    }

    @Override
    public void say(String name) {
        before();
        helloImpl.say(name);
        after();
    }

    private void before() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }
}
