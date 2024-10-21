public class Demo {
    public static void main(String[] args) {
        // redondo cabe no redondo, sem surpresas.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Peça redonda r5 cabe no buraco redondo r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Não irá compilar.

        // O Adapter resolve o problema.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Peça quadrada w2 cabe no buraco redondo r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Peça quadrada w20 não cabe no buraco redondo r5.");
        }
    }
}
