public class Cream extends IngredientDecorator {
    public Cream(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cream";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.00; // Custo do creme
    }
}
