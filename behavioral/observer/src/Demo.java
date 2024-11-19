public class Demo {
    public static void main(String[] args) {
        Product product = new Product("Notebook Gamer");

        // Clientes interessados no produto
        Client client1 = new Client("Alice");
        Client client2 = new Client("Bob");
        Client client3 = new Client("Carlos");

        // Inscrevendo clientes para receber notificações de estoque
        product.addObserver(client1);
        product.addObserver(client2);
        product.addObserver(client3);

        // Produto volta ao estoque
        System.out.println("Atualizando o estoque do produto...");
        product.setInStock(true);

        // Removendo um cliente e atualizando o estoque novamente
        product.removeObserver(client2);
        product.setInStock(false); // Produto está indisponível novamente
        System.out.println("Atualizando o estoque do produto...");
        product.setInStock(true); // Produto volta ao estoque
    }
}
