public class Demo {
    public static void main(String[] args) {
        Elemento relatorio = new Relatorio("Relatório de Vendas do Mês");
        Elemento grafico = new Grafico("Gráfico de Barras");
        Elemento tabela = new Tabela(new String[][]{
                {"Produto", "Quantidade"},
                {"Produto A", "10"},
                {"Produto B", "20"}
        });

        Visitor resumoVisitor = new ResumoVisitor();
        Visitor estatisticasVisitor = new EstatisticasVisitor();

        // Gerando resumos
        System.out.println("=== Resumos ===");
        relatorio.aceitar(resumoVisitor);
        grafico.aceitar(resumoVisitor);
        tabela.aceitar(resumoVisitor);
        System.out.println();

        // Calculando estatísticas
        System.out.println("=== Estatísticas ===");
        relatorio.aceitar(estatisticasVisitor);
        grafico.aceitar(estatisticasVisitor);
        tabela.aceitar(estatisticasVisitor);
    }
}
