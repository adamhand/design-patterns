package proxy.implement0;

public class HelloImpl implements Hello{
    @Override
    public void say(String name) {
        System.out.println("hello" + name);
    }
}
