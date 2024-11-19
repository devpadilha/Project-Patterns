class BoloDeChocolate extends Receita {

    @Override
    protected void misturarIngredientes() {
        System.out.println("Misturando ingredientes do Bolo de Chocolate: farinha, açúcar, cacau, ovos e leite.");
    }

    @Override
    protected void servir() {
        System.out.println("Servindo o Bolo de Chocolate com cobertura de chocolate.");
    }
}
