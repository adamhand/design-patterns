package state.implement1;

public class HasQuarterState implements State{
    private VendingMachine vendingMachine;

    HasQuarterState (VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you needn't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("quarter has been returned");
        vendingMachine.setState(vendingMachine.getNoQuarterState());
    }

    @Override
    public void turnkCrank() {
        System.out.println("you turned the crank");
        vendingMachine.setState(vendingMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("drink is dispensing");
    }
}
