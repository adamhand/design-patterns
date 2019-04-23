package observer.implement0;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> list;

    public ConcreteSubject(){
        list = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        if (!list.contains(observer)){
            list.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生变化：");

        for (Observer o : list){
            o.response();
        }
    }
}
