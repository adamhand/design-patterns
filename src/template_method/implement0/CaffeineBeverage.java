package template_method.implement0;

public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        addCondiments();
        pureInCup();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("boil water");
    }
    void pureInCup(){
        System.out.println("pure in cup");
    }
}
