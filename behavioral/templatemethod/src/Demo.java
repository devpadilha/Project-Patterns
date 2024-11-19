public class Demo {
    public static void main(String[] args) {
        Receita boloDeChocolate = new BoloDeChocolate();
        System.out.println("Preparando Bolo de Chocolate:");
        boloDeChocolate.prepararReceita();
        System.out.println();

        Receita boloDeBaunilha = new BoloDeBaunilha();
        System.out.println("Preparando Bolo de Baunilha:");
        boloDeBaunilha.prepararReceita();
    }
}
