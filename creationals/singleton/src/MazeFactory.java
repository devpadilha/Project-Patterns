import static java.lang.System.getenv;

public class MazeFactory {
    private static MazeFactory instance;

    protected MazeFactory() {}

    public static MazeFactory getInstance() {
        if(instance == null) {
            instance = new MazeFactory();
        }
        return instance;
    }

    public MazeFactory instance() {
        if(instance == null) {
            String mazeStyle = getenv("MAZESTYLE");

            if(mazeStyle.equals("bombed")) {
                instance = new BombedMazeFactory();
            } else if(mazeStyle.equals("enchanted")) {
                instance = new EnchantedMazeFactory();
            } else {
                instance = new MazeFactory();
            }
        }
        return instance;
    }
}
