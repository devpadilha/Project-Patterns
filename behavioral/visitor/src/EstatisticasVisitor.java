class EstatisticasVisitor implements Visitor {
    @Override
    public void visitar(Relatorio relatorio) {
        System.out.println("Calculando estatísticas para o Relatório: " + relatorio.getConteudo());
    }

    @Override
    public void visitar(Grafico grafico) {
        System.out.println("Calculando estatísticas para o gráfico tipo: " + grafico.getTipoGrafico());
    }

    @Override
    public void visitar(Tabela tabela) {
        System.out.println("Calculando estatísticas para a Tabela:");
        // Exemplo simples: calcular a quantidade de dados
        System.out.println("Número de linhas: " + tabela.getDados().length);
        System.out.println("Número de colunas: " + tabela.getDados()[0].length);
    }
}
