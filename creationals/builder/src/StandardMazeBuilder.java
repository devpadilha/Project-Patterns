public abstract class StandardMazeBuilder extends MazeBuilder {
    private Maze _currentMaze;

    public StandardMazeBuilder () {
        this._currentMaze = null;
    }

    public void BuildMaze() {this._currentMaze = new Maze();}

    public Maze getCurrentMaze() {return this._currentMaze;}

    public void BuildRoom(int roomNo) {
        if (!this._currentMaze.haveRoom(roomNo)) {
            Room room = new Room(roomNo);
            this._currentMaze.addRoom(room);

            room.setSide(Direction.North, new Wall());
            room.setSide(Direction.South, new Wall());
            room.setSide(Direction.East, new Wall());
            room.setSide(Direction.West, new Wall());
        }
    }

    public void BuildDoor(int n1, int n2) {
        Room r1 = _currentMaze.getRoom(n1);
        Room r2 = _currentMaze.getRoom(n2);
        Door d = new Door(r1, r2);
    }


}
