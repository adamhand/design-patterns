package command.implement1;

public class Invoker {
    private Command forwardCommand;
    private Command backCommand;

    Invoker () {}

    Invoker (Command forwardCommand, Command backCommand) {
        this.forwardCommand = forwardCommand;
        this.backCommand = backCommand;
    }

    public void setForwardCommand (Command forwardCommand) {
        this.forwardCommand = forwardCommand;
    }

    public void setBackCommand (Command backCommand) {
        this.backCommand = backCommand;
    }

    public void callForward () {
        forwardCommand.execute();
    }

    public void callBack () {
        backCommand.execute();
    }
}
