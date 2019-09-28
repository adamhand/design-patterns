package command.implement1;

public class Main {
    public static void main(String[] args) {
        ToyCar car = new ToyCar();
        Invoker invoker = new Invoker();
        Command forwardCommand = new MovingForward(car);
        Command backCommand = new MovingBack(car);
        invoker.setForwardCommand(forwardCommand);
        invoker.setBackCommand(backCommand);

        invoker.callForward();
        invoker.callBack();
    }
}
