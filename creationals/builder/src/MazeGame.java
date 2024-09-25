public class MazeGame {
    public Maze CreateMaze() {
        StandardMazeBuilder.buildMaze();

        StandardMazeBuilder.buildRoom(1);
        StandardMazeBuilder.buildRoom(2);
        StandardMazeBuilder.buildDoor(1, 2);

        return StandardMazeBuilder.getMaze();
    }
}
