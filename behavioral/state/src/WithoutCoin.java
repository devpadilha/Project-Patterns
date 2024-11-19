public class WithoutCoin implements State {
    private SellingMachine machine;

    public WithoutCoin(SellingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Moeda inserida.");
        machine.setState(machine.getWithCoin());
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
