public class EnchantedMazeFactory extends MazeFactory {
    public EnchantedMazeFactory() {}

    protected Spell castSpell() {return new Spell();}

    public Room makeRoom(int n) {
        return new EnchantedRoom(n, castSpell());
    }

    public Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }
}
