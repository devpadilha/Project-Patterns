public class EnchantedRoom extends Room {
    protected Spell spell;

    public EnchantedRoom(int roomNo, Spell spell) {
        super(roomNo);
        this.spell = spell;
    }
}
