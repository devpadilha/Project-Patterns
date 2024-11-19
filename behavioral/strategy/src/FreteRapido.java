public class FreteRapido implements EstrategiaFrete {
    @Override
    public double calcularFrete(double peso, double distancia) {
        return (peso * 0.7) + (distancia * 0.4);
    }
}
