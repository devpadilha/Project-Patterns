import java.util.ArrayList;

public class LunchMenu implements Menu {
    private ArrayList<ItemMenu> items;

    public LunchMenu() {
        items = new ArrayList<>();
        addItem("Arroz com Feijão", 10.0);
        addItem("Salada", 5.50);
        addItem("Refrigerante", 4.00);
    }

    public void addItem(String name, double price) {
        items.add(new ItemMenu(name, price));
    }

    @Override
    public Iterator createIterator() {
        return new LunchIterator(items);
    }
}
