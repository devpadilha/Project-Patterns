public class Demo {
    public static void main(String[] args) {
        double peso = 10.0; // Peso em kg
        double distancia = 100.0; // Distância em km

        // Criando um pedido com Frete Econômico
        Pedido pedido = new Pedido(new FreteEconomico(), peso, distancia);
        System.out.println("Custo do Frete Econômico: R$ " + pedido.calcularFrete());

        // Mudando a estratégia para Frete Rápido
        pedido.setEstrategiaFrete(new FreteRapido());
        System.out.println("Custo do Frete Rápido: R$ " + pedido.calcularFrete());

        // Mudando a estratégia para Frete Expresso
        pedido.setEstrategiaFrete(new FreteExpresso());
        System.out.println("Custo do Frete Expresso: R$ " + pedido.calcularFrete());
    }
}
