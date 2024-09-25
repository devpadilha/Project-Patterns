import java.util.ArrayList;

public class Maze {
    private ArrayList<Room> rooms;
    
    public Maze() {}
    
    public void addRoom(Room room) {this.rooms.add(room);}

    public boolean haveRoom(int roomNo) {
        for (Room room : rooms) {
            return roomNo == room.get_roomNumber();
        } return false;
    }

    public Room getRoom(int roomNo) {
        for (Room room : rooms) {
            if (room.get_roomNumber() == roomNo) return room;
        } return null;
    }
}
