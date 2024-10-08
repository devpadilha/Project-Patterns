public class StandardMazeBuilder implements MazeBuilder {
    private static Maze _currentMaze;

    private Direction CommonWall(Room a, Room b) {
        return null;
    }

    public StandardMazeBuilder() {
        _currentMaze = null;
    }

    public static void buildMaze() {
        _currentMaze = new Maze();
    }

    public static void buildRoom(int n) {
        if (!_currentMaze.haveRoom(n)) {
            Room room = new Room(n);
            _currentMaze.addRoom(room);

            room.setSide(Direction.North, new Wall());
            room.setSide(Direction.South, new Wall());
            room.setSide(Direction.East, new Wall());
            room.setSide(Direction.West, new Wall());
        }
    }

    public static void buildDoor(int n1, int n2) {
        Room r1 = _currentMaze.getRoom(n1);
        Room r2 = _currentMaze.getRoom(n2);
        Door d = new Door(r1, r2);
    }

    public static Maze getMaze() {
        return _currentMaze;
    }
}
