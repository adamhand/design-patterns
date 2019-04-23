package template_method.implement0;

public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("tea.brew()");
    }

    @Override
    void addCondiments() {
        System.out.println("tea.brew()");
    }
}
