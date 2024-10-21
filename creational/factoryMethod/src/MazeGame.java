public class MazeGame implements MazeFactory{
    public Maze CreateMaze() {
        Maze aMaze = makeMaze();
        Room r1 = makeRoom(1);
        Room r2 = makeRoom(2);
        Door theDoor = makeDoor(r1, r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Direction.North, makeWall());
        r1.setSide(Direction.East, theDoor);
        r1.setSide(Direction.South, makeWall());
        r1.setSide(Direction.West, makeWall());

        r2.setSide(Direction.North, makeWall());
        r2.setSide(Direction.East, makeWall());
        r2.setSide(Direction.South, makeWall());
        r2.setSide(Direction.West, theDoor);

        return aMaze;
    }
}
