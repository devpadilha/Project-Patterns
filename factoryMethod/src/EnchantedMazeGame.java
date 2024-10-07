public class EnchantedMazeGame extends MazeGame {
    protected Spell CastSpell() {
        return new Spell();
    }

    public Room MakeRoom(int n) {
        return new EnchantedRoom(n, CastSpell());
    }

    public Door MakeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }
}
