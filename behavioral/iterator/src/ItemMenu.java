public class ItemMenu {
    private String name;
    private double price;

    public ItemMenu(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - R$" + price;
    }
}
