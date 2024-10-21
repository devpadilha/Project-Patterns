// Facade

public class CinemaSystem {
    private Reserve reserve;
    private Payment payment;
    private Ticket ticket;
    private Email email;

    public CinemaSystem() {
        reserve = new Reserve();
        payment = new Payment();
        ticket = new Ticket();
        email = new Email();
    }

    public void buyTicket(Movie movie, String time, double value) {
        if(reserve.reserveSeat(movie.getTitle(), time)) {
            if(payment.processPayment(value)) {
                ticket.generateTicket(movie.getTitle());
                email.sendTicket(movie.getTitle());
                System.out.println("Compra realizada com sucesso!");
            }
        }
    }
}
