import java.util.ArrayList;

public class DinnerMenu implements Menu {
    private ArrayList<ItemMenu> items;

    public DinnerMenu() {
        items = new ArrayList<>();
        addItem("Bife com Fritas", 20.00);
        addItem("Sopa de Legumes", 12.00);
    }

    public void addItem(String name, double price) {
        items.add(new ItemMenu(name, price));
    }

    @Override
    public Iterator createIterator() {
        return new DinnerIterator(items);
    }
}
