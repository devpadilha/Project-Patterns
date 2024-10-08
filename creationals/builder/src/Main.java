public class Main {
    public static void main(String[] args) {
        MazeGame game = new MazeGame();
        CountingMazeBuilder builder = new CountingMazeBuilder();

        game.createMaze(builder);
        builder.getCounts();
    }
}
