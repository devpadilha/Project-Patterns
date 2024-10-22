public interface MazeFactory {
    default Maze makeMaze() {return new Maze();}
    default Room makeRoom(int n) {return new Room(n);}
    default Wall makeWall() {return new Wall();}
    default Door makeDoor(Room r1, Room r2) {return new Door(r1,r2);}
}