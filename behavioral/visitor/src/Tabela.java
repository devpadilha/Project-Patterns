class Tabela implements Elemento {
    private String[][] dados;

    public Tabela(String[][] dados) {
        this.dados = dados;
    }

    public String[][] getDados() {
        return dados;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}
