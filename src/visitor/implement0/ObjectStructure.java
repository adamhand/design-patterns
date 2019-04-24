package visitor.implement0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjectStructure {
    private List<Element> list = new ArrayList<>();

    public void accept(Visitor visitor){
        Iterator<Element> it = list.iterator();
        while (it.hasNext()){
            it.next().accept(visitor);
        }
    }

    public void addElement(Element element){
        list.add(element);
    }

    public void removeElement(Element element){
        list.remove(element);
    }
}
