package command.implement1;

public class MovingForward implements Command{
    private ToyCar car;

    MovingForward(ToyCar car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.movingForward();
    }
}
