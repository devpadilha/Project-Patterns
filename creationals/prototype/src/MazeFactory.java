public interface MazeFactory {
    public default Maze makeMaze() { return new Maze(); }
    public default Wall makeWall() { return new Wall(); }
    public default Room makeRoom(int n) {return new Room(n); }
    public default Door makeDoor(Room r1, Room r2) { return new Door(r1, r2); }
}
