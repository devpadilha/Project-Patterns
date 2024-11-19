public class SellingMachine {
    private State actualState;

    private final State withoutCoin;
    private final State withCoin;
    private final State selectedProduct;
    private final State deliveredProduct;

    public SellingMachine() {
        withoutCoin = new WithoutCoin(this);
        withCoin = new WithCoin(this);
        selectedProduct = new SelectedProduct(this);
        deliveredProduct = new DeliveredProduct(this);

        actualState = withoutCoin;
    }

    public void setState(State newState) {
        this.actualState = newState;
    }

    public State getWithoutCoin() {
        return withoutCoin;
    }

    public State getWithCoin() {
        return withCoin;
    }

    public State getSelectedProduct() {
        return selectedProduct;
    }

    public State getDeliveredProduct() {
        return deliveredProduct;
    }

    public void insertCoin() {
        actualState.insertCoin();
    }

    public void selectProduct() {
        actualState.selectProduct();
    }

    public void deliverProduct() {
        actualState.deliverProduct();
    }
}
