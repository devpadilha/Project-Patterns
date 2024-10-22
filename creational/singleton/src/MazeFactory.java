import static java.lang.System.getenv;

public class MazeFactory extends Maze {
    private static MazeFactory instance;

    protected MazeFactory() {}

    public static MazeFactory getInstance() {
        if(instance == null) {
            instance = new MazeFactory();
        }
        return instance;
    }

    public MazeFactory instance() {
        if(instance == null) {
            String mazeStyle = getenv("MAZESTYLE");

            if(mazeStyle.equals("bombed")) {
                instance = new BombedMazeFactory();
            } else if(mazeStyle.equals("enchanted")) {
                instance = new EnchantedMazeFactory();
            } else {
                instance = new MazeFactory();
            }
        }
        return instance;
    }

    public Maze makeMaze() {
        return new Maze();
    }

    public Room makeRoom(int roomNo) {
        Room newRoom = new Room(roomNo);
        addRoom(newRoom);
        return newRoom;
    }

    public Room getRoom(int roomNo) {
        for(Room r : instance().rooms) {
            if(r._roomNumber == roomNo) {
                return r;
            }
        }
        return null;
    }

    public Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }

    public Wall makeWall() {
        return new Wall();
    }
}
