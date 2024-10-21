public class Milk extends IngredientDecorator {
    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Leite";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.50; // Custo do leite
    }
}
