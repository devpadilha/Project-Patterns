public class DeliveredProduct implements State {
    private final SellingMachine machine;

    public DeliveredProduct(SellingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Retornando ao estado inicial.");
        machine.setState(machine.getWithoutCoin());
    }

    @Override
    public void selectProduct() {
        System.out.println("Insira uma moeda primeiro.");
    }

    @Override
    public void deliverProduct() {
        System.out.println("Insira uma moeda primeiro.");
    }
}
