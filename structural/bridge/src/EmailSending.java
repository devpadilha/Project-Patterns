public class EmailSending implements SendChannel {
    @Override
    public void send(String message) {
        System.out.println("Enviando Email: " + message);
    }
}
