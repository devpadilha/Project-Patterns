abstract class Receita {

    // Metodo template
    public final void prepararReceita() {
        reunirIngredientes();
        misturarIngredientes();
        assar();
        servir();
    }

    // Métodos concretos
    private void reunirIngredientes() {
        System.out.println("Reunindo ingredientes...");
    }

    // Métodos abstratos que as subclasses devem implementar
    protected abstract void misturarIngredientes();

    private void assar() {
        System.out.println("Assando o bolo...");
    }

    protected abstract void servir();
}
