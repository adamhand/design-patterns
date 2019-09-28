package state.implement1;

public class VendingMachine {
    private State hasQuarterState;
    private State noQuarterState;
    private State soldoutState;
    private State soldState;

    private int numbersOfDrinks;
    private State state;

    VendingMachine (int numbersOfDrinks) {
        this.numbersOfDrinks = numbersOfDrinks;
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldoutState = new SoldoutState(this);
        soldState = new SoldState(this);

        if (numbersOfDrinks > 0) {
            state = noQuarterState;
        } else {
            state = soldoutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnGrank() {
        state.turnkCrank();
        state.dispense();
    }

    public void releaseDrink() {
        System.out.println("your drink comes rolling out the slot");
        if (numbersOfDrinks > 0) {
            numbersOfDrinks -= 1;
        }
    }

    public void setState (State state) {
        this.state = state;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldoutState() {
        return soldoutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getNumbersOfDrinks() {
        return numbersOfDrinks;
    }
}
