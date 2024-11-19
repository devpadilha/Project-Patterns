import java.util.Map;

public class DinerIterator implements Iterator {
    private java.util.Iterator<Map.Entry<String, Double>> iterator;

    public DinerIterator(Map<String, Double> items) {
        this.iterator = items.entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {
        Map.Entry<String, Double> entry = iterator.next();
        return entry.getKey() + " - R$" + entry.getValue();
    }
}
