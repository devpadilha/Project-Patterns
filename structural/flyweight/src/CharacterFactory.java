import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<String, Character> characters = new HashMap<>();

    public Character getCharacter(String type, String weapon) {
        String key = type + ":" + weapon;
        if(!characters.containsKey(key)) {
            characters.put(key, new Character(type, weapon));
            System.out.println("Criando novo personagem: " + key);
        }
        return characters.get(key);
    }
}
