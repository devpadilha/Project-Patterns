public class Main {
    public static void main(String[] args) {
        MazeGame game = new MazeGame();
        BombedMazeFactory factory = new BombedMazeFactory(); // é possível criar facilmente um BombedMaze utilizando abstract factory

        game.createMaze(factory);
    }
}
