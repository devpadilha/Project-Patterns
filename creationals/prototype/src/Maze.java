import java.util.ArrayList;

public class Maze implements Cloneable {
    private ArrayList<Room> rooms;
    
    public Maze() {}

    @Override
    public Maze clone() {
        try {
            return (Maze) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void addRoom(Room room) {this.rooms.add(room);}
}