public class Demo {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        // Criar personagens com atributos comuns
        Character guerreiroEspada = factory.getCharacter("Guerreiro", "Espada");
        Character magoCajado = factory.getCharacter("Mago", "Cajado");
        Character arqueiroArco = factory.getCharacter("Arqueiro", "Arco");

        // Criar contextos para personagens específicos
        CharacterContext personagem1 = new CharacterContext(guerreiroEspada, "Aragorn", 10);
        CharacterContext personagem2 = new CharacterContext(magoCajado, "Gandalf", 20);
        CharacterContext personagem3 = new CharacterContext(arqueiroArco, "Legolas", 15);
        CharacterContext personagem4 = new CharacterContext(guerreiroEspada, "Boromir", 8);

        // Exibir informações dos personagens
        personagem1.showInfo();
        personagem2.showInfo();
        personagem3.showInfo();
        personagem4.showInfo();
    }
}
