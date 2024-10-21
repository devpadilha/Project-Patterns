public class MazePrototypeFactory implements MazeFactory {
    private Maze _prototypeMaze;
    private Wall _prototypeWall;
    private Room _prototypeRoom;
    private Door _prototypeDoor;
    private MazeGame game;

    public MazePrototypeFactory(Maze m, Wall w, Room r, Door d) {
        this._prototypeMaze = m;
        this._prototypeWall = w;
        this._prototypeRoom = r;
        this._prototypeDoor = d;
    }

    public MazePrototypeFactory simpleFactory() {
        return new MazePrototypeFactory(new Maze(), new Wall(), new Room(0), new Door(new Room(1), new Room(2)));
    }

    public MazePrototypeFactory bombedMazeFactory() {
        return new MazePrototypeFactory(new Maze(), new BombedWall(), new RoomWithABomb(0), new Door(new Room(1), new Room(2)));
    }

    public Maze maze = game.CreateMaze(simpleFactory());

    public Maze MakeMaze() {
        return _prototypeMaze.clone();
    }

    public Room MakeRoom() {
        return _prototypeRoom.clone();
    }

    public Wall makeWall() {
        return _prototypeWall.clone();
    }

    public Door makeDoor(Room r1, Room r2) {
        return _prototypeDoor.clone();
    }

    public Maze getMaze() {
        return _prototypeMaze.clone();
    }
}
