public class Demo {
    public static void main(String[] args) {
        SellingMachine machine = new SellingMachine();

        // Tentativa de selecionar um produto sem moeda
        machine.selectProduct();

        // Inserindo uma moeda
        machine.insertCoin();

        // Selecionando o produto
        machine.selectProduct();

        // Entregando o produto
        machine.deliverProduct();

        // Inserindo uma moeda para recomeçar o ciclo
        machine.insertCoin();
    }
}
