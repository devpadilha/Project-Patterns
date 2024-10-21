public class SMSSending implements SendChannel {
    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
