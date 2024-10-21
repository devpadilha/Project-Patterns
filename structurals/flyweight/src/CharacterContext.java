public class CharacterContext {
    private Character character;
    private String characterName;
    private int level;

    public CharacterContext(Character character, String characterName, int level) {
        this.character = character;
        this.characterName = characterName;
        this.level = level;
    }

    public void showInfo() {
        character.showInfo(characterName, level);
    }
}
