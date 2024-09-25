public class MazeGame {
    public Maze CreateMaze() {
        MazeGame game = new MazeGame();
        Room r1 = new Room(1);
        MazePrototypeFactory simpleMazeFactory = new MazePrototypeFactory(new Maze(), new Wall(), new Room(2),
                             new Door(r1, new Room(3)));

        return simpleMazeFactory.getMaze();
    }
}
