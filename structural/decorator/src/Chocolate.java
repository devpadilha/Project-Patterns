public class Chocolate extends IngredientDecorator {
    public Chocolate(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chocolate";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.75; // Custo do chocolate
    }
}
