public class Demo {
    public static void main(String[] args) {
        // Criar arquivos individuais
        Component arquivo1 = new File("arquivo1.txt");
        Component arquivo2 = new File("arquivo2.txt");
        Component arquivo3 = new File("arquivo3.docx");

        // Criar pastas
        Folder pasta1 = new Folder("Pasta 1");
        Folder pasta2 = new Folder("Pasta 2");
        Folder pastaRaiz = new Folder("Pasta Raiz");

        // Adicionar arquivos e subpastas às pastas
        pasta1.add(arquivo1);
        pasta1.add(arquivo2);

        pasta2.add(arquivo3);

        pastaRaiz.add(pasta1);
        pastaRaiz.add(pasta2);

        // Abrir a pasta raiz (abre todas as subpastas e arquivos)
        pastaRaiz.open();

        // Exibir os detalhes da pasta raiz e seu conteúdo
        pastaRaiz.showDetails();

        // Remover a pasta raiz (remove todos os arquivos e subpastas)
        pastaRaiz.remove();
    }
}
