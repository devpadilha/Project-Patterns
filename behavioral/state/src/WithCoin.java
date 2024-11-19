public class WithCoin implements State {
    private SellingMachine maquina;

    public WithCoin(SellingMachine maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insertCoin() {
        System.out.println("Moeda já inserida.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Produto selecionado.");
        maquina.setState(maquina.getSelectedProduct());
    }

    @Override
    public void deliverProduct() {
        System.out.println("Selecione um produto primeiro.");
    }
}
