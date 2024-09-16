public class MazePrototypeFactory extends MazeFactory {
    private Maze _prototypeMaze;
    private Wall _prototypeWall;
    private Room _prototypeRoom;
    private Door _prototypeDoor;

    public MazePrototypeFactory(Maze m, Wall w, Room r, Door d) {
        this._prototypeMaze = m;
        this._prototypeWall = w;
        this._prototypeRoom = r;
        this._prototypeDoor = d;
    }

    public Wall makeWall() {
        return _prototypeWall.clone();
    }

    public Door makeDoor(Room r1, Room r2) {
        return _prototypeDoor.clone();
    }

    public Maze getMaze() {                                                          //método get
        return _prototypeMaze.clone();                                               //está correto?
    }
}
