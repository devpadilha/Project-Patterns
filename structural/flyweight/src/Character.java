public class Character {
    private String type;
    private String weapon;

    public Character(String type, String weapon) {
        this.type = type;
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getType() {
        return type;
    }

    public void showInfo(String name, int level) {
        System.out.println("Personagem: " + name + ", Tipo: " + type + ", Arma: " + weapon + ", Nível: " + level);
    }
}
