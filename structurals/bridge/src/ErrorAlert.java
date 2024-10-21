public class ErrorAlert implements Notification {
    @Override
    public void send(String message, SendChannel sendChannel) {
        System.out.println("Alerta de Erro:");
        sendChannel.send(message);
    }
}
