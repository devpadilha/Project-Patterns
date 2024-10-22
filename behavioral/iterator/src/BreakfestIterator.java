public class BreakfestIterator implements Iterator {
    private ItemMenu[] items;
    private int position = 0;

    public BreakfestIterator(ItemMenu[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        ItemMenu item = items[position];
        position++;
        return item;
    }
}
