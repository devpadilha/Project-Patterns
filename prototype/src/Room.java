import java.util.ArrayList;

public class Room extends MapSite {
    private ArrayList<MapSite> _sides;
    private Integer _roomNumber;
    
    public Room(int roomNo){}

    public Room clone() {
        return new Room(this._roomNumber);
    }
    
    public ArrayList<MapSite> getSide(Direction direction) {return this._sides;}
    public void setSide(Direction direction, MapSite site) {}
}
