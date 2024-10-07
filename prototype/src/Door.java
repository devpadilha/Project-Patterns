public class Door extends MapSite {
    private Room _room1;
    private Room _room2;
    private boolean _isOpen;

    public Door clone() {
        return new Door(this._room1, this._room2);
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
