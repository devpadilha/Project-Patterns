public class Door extends MapSite {
    private Room _room1;
    private Room _room2;

    private Door(Door other) {
        this._room1 = other._room1;
        this._room2 = other._room2;
    }

    private void Initialize (Room r1, Room r2) {
        this._room1 = r1;
        this._room2 = r2;
    }

    public Door clone() {
        return new Door(this);
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
