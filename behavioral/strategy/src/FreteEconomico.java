public class FreteEconomico implements EstrategiaFrete {
    @Override
    public double calcularFrete(double peso, double distancia) {
        return (peso * 0.5) + (distancia * 0.2);
    }
}
