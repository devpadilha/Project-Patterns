class Grafico implements Elemento {
    private String tipoGrafico;

    public Grafico(String tipoGrafico) {
        this.tipoGrafico = tipoGrafico;
    }

    public String getTipoGrafico() {
        return tipoGrafico;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}
