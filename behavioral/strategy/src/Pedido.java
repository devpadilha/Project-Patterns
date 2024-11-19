public class Pedido {
    private EstrategiaFrete estrategiaFrete;
    private double peso;
    private double distancia;

    public Pedido(EstrategiaFrete estrategiaFrete, double peso, double distancia) {
        this.estrategiaFrete = estrategiaFrete;
        this.peso = peso;
        this.distancia = distancia;
    }

    public void setEstrategiaFrete(EstrategiaFrete estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }

    public double calcularFrete() {
        return estrategiaFrete.calcularFrete(peso, distancia);
    }
}
