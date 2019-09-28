package state.implement1;

public class SoldoutState implements State{
    private VendingMachine vendingMachine;

    SoldoutState (VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you can't insert a quarter, the drink is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you can't eject, you haven't insert a quarter yet");
    }

    @Override
    public void turnkCrank() {
        System.out.println("you turned the crank, but the drink have been sold out");
    }

    @Override
    public void dispense() {
        System.out.println("no drink will dispense because they are sold out");
    }
}
