public class BreakfestMenu implements Menu {
    private static final int MAX_ITENS = 5;
    private int numberOfItems = 0;
    private ItemMenu[] items;

    public BreakfestMenu() {
        items = new ItemMenu[MAX_ITENS];
        addItem("Pão com manteiga", 3.50);
        addItem("Café", 2.00);
        addItem("Suco de Laranja", 4.00);
    }

    public void addItem(String item, double price) {
        if(numberOfItems >= MAX_ITENS) {
            System.out.println("Menu cheio! Não é possível adicionar mais itens.");
        } else {
            items[numberOfItems] = new ItemMenu(item, price);
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new BreakfestIterator(items);
    }
}
