public class Demo {
    public static void main(String[] args) {
        // Criar uma bebida base (Expresso)
        Drink meuCafe = new Expresso();
        System.out.println(meuCafe.getDescription() + " -> Custo: $" + meuCafe.getPrice());

        // Adicionar Leite
        meuCafe = new Milk(meuCafe);
        System.out.println(meuCafe.getDescription() + " -> Custo: $" + meuCafe.getPrice());

        // Adicionar Chocolate
        meuCafe = new Chocolate(meuCafe);
        System.out.println(meuCafe.getDescription() + " -> Custo: $" + meuCafe.getPrice());

        // Adicionar Creme
        meuCafe = new Cream(meuCafe);
        System.out.println(meuCafe.getDescription() + " -> Custo: $" + meuCafe.getPrice());

        // Outro exemplo com Latte
        Drink outroCafe = new Latte();
        outroCafe = new Milk(outroCafe);
        outroCafe = new Chocolate(outroCafe);
        System.out.println(outroCafe.getDescription() + " -> Custo: $" + outroCafe.getPrice());
    }
}
