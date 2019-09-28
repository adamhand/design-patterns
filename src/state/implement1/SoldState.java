package state.implement1;

public class SoldState implements State{
    private VendingMachine vendingMachine;

    SoldState (VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait, the drink is coming");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry, you have turned the crank, the quarter can't be ejected");
    }

    @Override
    public void turnkCrank() {
        System.out.println("turning twice doesn't get you another drink");
    }

    @Override
    public void dispense() {
        vendingMachine.releaseDrink();
        if (vendingMachine.getNumbersOfDrinks() > 0) {
            vendingMachine.setState(vendingMachine.getNoQuarterState());
        } else {
            System.out.println("OOD! out of drink");
            vendingMachine.setState(vendingMachine.getSoldoutState());
        }
    }
}
