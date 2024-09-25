public class Door extends MapSite {
    private Room _room1;
    private Room _room2;
    private boolean _isOpen;
    
    public Door(Room room1, Room room2) {}
    
    public Room otherSideFrom(Room room) {
        if (room == _room1) return this._room2;
        if (room == _room2) return this._room1;
        else return null;
    }
}
