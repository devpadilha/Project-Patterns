public class FreteExpresso implements EstrategiaFrete {
    @Override
    public double calcularFrete(double peso, double distancia) {
        return (peso * 1.0) + (distancia * 0.6);
    }
}
