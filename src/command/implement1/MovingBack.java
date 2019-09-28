package command.implement1;

public class MovingBack implements Command{
    private ToyCar car;

    MovingBack(ToyCar car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.movingBack();
    }
}
