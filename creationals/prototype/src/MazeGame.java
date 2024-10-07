public class MazeGame {
    public Maze CreateMaze(MazePrototypeFactory prototypeFactory) {
        MazeGame game = new MazeGame();

        MazePrototypeFactory simpleMazeFactory = new MazePrototypeFactory(new Maze(), new Wall(), new Room(0),
                new Door(new Room(1), new Room(2)));

        return game.CreateMaze(simpleMazeFactory);
    }
}
