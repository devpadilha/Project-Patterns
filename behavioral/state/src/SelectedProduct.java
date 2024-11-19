public class SelectedProduct implements State {
    private final SellingMachine machine;

    public SelectedProduct(SellingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Produto já foi selecionado. Aguarde a entrega.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Produto já selecionado. Aguarde a entrega.");
    }

    @Override
    public void deliverProduct() {
        System.out.println("Produto entregue. Aproveite!");
        machine.setState(machine.getDeliveredProduct());
    }
}
