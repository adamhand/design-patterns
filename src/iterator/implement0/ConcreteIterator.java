package iterator.implement0;

public class ConcreteIterator<I> implements Iterator {
    private I[] items;
    private int position;

    public ConcreteIterator(I[] items){
        this.items = items;
    }

    @Override
    public Object next() {
        return items[position++];
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }
}
