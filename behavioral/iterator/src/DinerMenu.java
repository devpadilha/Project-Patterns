import java.util.HashMap;
import java.util.Map;

public class DinerMenu implements Menu {
    private Map<String, Double> items;

    public DinerMenu() {
        items = new HashMap<>();
        addItem("Bife com Fritas", 20.00);
        addItem("Sopa de Legumes", 12.00);
    }

    public void addItem(String name, double price) {
        items.put(name, price);
    }

    @Override
    public Iterator createIterator() {
        return new DinerIterator(items);
    }
}
