package state.implement1;

public class NoQuarterState implements State{
    private VendingMachine vendingMachine;

    NoQuarterState (VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you inserted a quarter");
        vendingMachine.setState(vendingMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you haven't insert a quarter");
    }

    @Override
    public void turnkCrank() {
        System.out.println("you turned the crank, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("you need to pay first");
    }
}
