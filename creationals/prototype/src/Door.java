public class Door extends MapSite implements Cloneable {
    private Room _room1;
    private Room _room2;
    private boolean _isOpen;

    @Override
    public Door clone() {
        try{
            return(Door) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Door(Room room1, Room room2) {
        super();
        this._room1 = room1;
        this._room2 = room2;
    }
    
    public Room otherSideFrom(Room room) {
        if (room == _room1) return _room2;
        if (room == _room2) return _room1;
        else return null;
    }
}
