class ResumoVisitor implements Visitor {
    @Override
    public void visitar(Relatorio relatorio) {
        System.out.println("Resumo do Relatório: " + relatorio.getConteudo());
    }

    @Override
    public void visitar(Grafico grafico) {
        System.out.println("Gerando resumo do gráfico tipo: " + grafico.getTipoGrafico());
    }

    @Override
    public void visitar(Tabela tabela) {
        System.out.println("Resumo da Tabela:");
        for (String[] linha : tabela.getDados()) {
            for (String dado : linha) {
                System.out.print(dado + " ");
            }
            System.out.println();
        }
    }
}
