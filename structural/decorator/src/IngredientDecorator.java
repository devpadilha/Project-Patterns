public abstract class IngredientDecorator implements Drink {
    protected Drink drink;

    public IngredientDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription();
    }

    @Override
    public double getPrice() {
        return drink.getPrice();
    }
}
