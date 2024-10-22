public class Demo {
    public static void main(String[] args) {
        // Criando os dispositivos (Receivers)
        Light salaLuz = new Light("Sala");
        AirConditioning arCondicionado = new AirConditioning();

        // Criando os comandos para a luz
        Command luzLigar = new TurnOnLightCommand(salaLuz);
        Command luzDesligar = new TurnOffLightCommand(salaLuz);

        // Criando os comandos para o ar-condicionado
        Command arLigar = new AirConditioningTurnOnCommand(arCondicionado);
        Command arDesligar = new AirConditioningTurnOffCommand(arCondicionado);

        // Criando o controle remoto (Invoker)
        RemoteController controle = new RemoteController();

        // Ligar a luz
        controle.setCommand(luzLigar);
        controle.pressButton();  // Saída: Sala: Luz ligada.

        // Desfazer (desliga a luz)
        controle.pressUndo();  // Saída: Sala: Luz desligada.

        // Ligar o ar-condicionado
        controle.setCommand(arLigar);
        controle.pressButton();  // Saída: Ar-condicionado ligado.

        // Desfazer (desliga o ar-condicionado)
        controle.pressUndo();  // Saída: Ar-condicionado desligado.
    }
}
