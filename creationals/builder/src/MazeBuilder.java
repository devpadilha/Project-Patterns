public abstract class MazeBuilder {
    protected MazeBuilder() {}

    public static void buildMaze() {}

    public static void buildRoom(int n) {}

    public static void buildDoor(int r1, int r2) {}

    public static Maze getMaze() {return new Maze();}
}
