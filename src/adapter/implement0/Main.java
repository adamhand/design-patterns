package adapter.implement0;

public class Main {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new AdapterTurkey(turkey);
        duck.quack();
    }
}
