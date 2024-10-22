import java.util.ArrayList;

public class LunchIterator implements Iterator {
    private ArrayList<ItemMenu> items;
    private int position = 0;

    public LunchIterator(ArrayList<ItemMenu> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        ItemMenu item = items.get(position);
        position++;
        return item;
    }
}
