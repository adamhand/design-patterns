package command.implement0;

public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void call(){
        System.out.println("执行者执行command");
        command.execute();
    }
}
