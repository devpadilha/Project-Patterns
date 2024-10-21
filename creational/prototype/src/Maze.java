import java.util.ArrayList;

public class Maze {
    private ArrayList<Room> rooms;
    
    public Maze() {}
    public Maze(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public Maze clone() {
        return new Maze(this.rooms);
    }
    
    public void addRoom(Room room) {this.rooms.add(room);}
}