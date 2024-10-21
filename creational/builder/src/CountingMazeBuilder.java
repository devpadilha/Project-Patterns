public class CountingMazeBuilder implements MazeBuilder {
    private static Maze _currentMaze;
    private static int _doors;
    private static int _rooms;

    public CountingMazeBuilder() {
        _doors = _rooms = 0;
    }

    public static void buildMaze() {}

    public static void buildRoom(int n) {
        _rooms++;
    }

    public static void buildDoor(int r1, int r2) {
        _doors++;
    }

    public void addWall(int n, Direction d) {}

    public static void getCounts() {
        int rooms = _rooms;
        int doors = _doors;
        System.out.println(rooms + " rooms and " + doors + " doors");
    }

    public static Maze getMaze() {
        return _currentMaze;
    }
}
