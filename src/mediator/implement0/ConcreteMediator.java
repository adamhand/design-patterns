package mediator.implement0;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<Colleague> list = new ArrayList<>();

    @Override
    public void register(Colleague c) {
        if (!list.contains(c)){
            list.add(c);
            c.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague c) {
        for (Colleague coll : list){
            if (!coll.equals(c)){
                coll.receive();
            }
        }
    }
}
