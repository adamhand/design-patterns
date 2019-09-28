package state.implement1;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(5);

        vendingMachine.insertQuarter();
        vendingMachine.turnGrank();
        System.out.println(">>>>>>>>>>>>>>>>>>>");

        vendingMachine.insertQuarter();
        vendingMachine.ejectQuarter();
        vendingMachine.turnGrank();
        System.out.println(">>>>>>>>>>>>>>>>>>>");

        vendingMachine.insertQuarter();
        vendingMachine.turnGrank();
        vendingMachine.insertQuarter();
        vendingMachine.turnGrank();
        vendingMachine.ejectQuarter();
        System.out.println(">>>>>>>>>>>>>>>>>>>");

        vendingMachine.insertQuarter();
        vendingMachine.insertQuarter();
        vendingMachine.turnGrank();
        vendingMachine.insertQuarter();
        vendingMachine.turnGrank();
        vendingMachine.insertQuarter();
        vendingMachine.turnGrank();
    }
}
