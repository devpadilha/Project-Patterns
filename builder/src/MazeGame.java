public class MazeGame {
    public Maze CreateMaze(MazeBuilder builder) {
        builder.buildMaze();

        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildDoor(1, 2);

        return builder.getMaze();
    }

    public Maze CreateComplexMaze(MazeBuilder builder) {
        builder.buildMaze();

        for(int i = 1; i < 1000; i++)
            builder.buildRoom(i);

        return builder.getMaze();
    }

    public static void main(String[] args) {
        int rooms, doors;
        Maze maze = new Maze();
        MazeGame game = new MazeGame();
        StandardMazeBuilder builder = new StandardMazeBuilder();

        game.CreateMaze(builder);
        maze = builder.getMaze();
    }
}
