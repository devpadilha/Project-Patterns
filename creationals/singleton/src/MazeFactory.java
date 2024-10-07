public class MazeFactory {
    private static MazeFactory instance;

    MazeFactory() {}

    public static MazeFactory getInstance() {
        if (instance == null) {
            String mazeStyle = System.getenv("MAZESTYLE");

            if ("bombed".equals(mazeStyle)) {
                instance = new BombedMazeFactory();
            } else if ("enchanted".equals(mazeStyle)) {
                instance = new EnchantedMazeFactory();
            } else {
                instance = new MazeFactory();
            }
        }
        return instance;
    }
}
