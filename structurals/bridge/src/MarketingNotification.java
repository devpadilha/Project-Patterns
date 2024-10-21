public class MarketingNotification implements Notification {
    @Override
    public void send(String message, SendChannel sendChannel) {
        System.out.println("Enviando notificação de marketing:");
        sendChannel.send(message);
    }
}
