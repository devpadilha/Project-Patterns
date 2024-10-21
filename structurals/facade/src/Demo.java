public class Demo {
    public static void main(String[] args) {
        // Criar um filme
        Movie filme = new Movie("O Senhor dos Anéis");

        // Criar o sistema de cinema (fachada)
        CinemaSystem sistemaCinema = new CinemaSystem();

        // Comprar um ingresso
        sistemaCinema.buyTicket(filme, "19:00", 25.00);
    }
}
