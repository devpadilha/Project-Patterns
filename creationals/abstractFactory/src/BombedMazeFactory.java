public class BombedMazeFactory extends MazeFactory {

    public Wall makeWall() {
        return new BombedWall();
    }

    public Room makeRoom(int n) {
        return new RoomWithABomb(n);
    }
}
