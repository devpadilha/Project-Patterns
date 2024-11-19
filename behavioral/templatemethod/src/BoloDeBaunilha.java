class BoloDeBaunilha extends Receita {

    @Override
    protected void misturarIngredientes() {
        System.out.println("Misturando ingredientes do Bolo de Baunilha: farinha, açúcar, ovos e essência de baunilha.");
    }

    @Override
    protected void servir() {
        System.out.println("Servindo o Bolo de Baunilha com cobertura de creme.");
    }
}
