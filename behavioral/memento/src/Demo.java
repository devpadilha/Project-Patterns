public class Demo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Historic historic = new Historic();

        // Escrevendo e salvando estados
        editor.write("Olá, ");
        historic.save(editor.save());

        editor.write("mundo! ");
        historic.save(editor.save());

        editor.write("Este é um editor de texto.");
        historic.save(editor.save());

        System.out.println("Texto atual: " + editor.getText());

        // Desfazendo
        editor.restore(historic.undo());
        System.out.println("Após desfazer: " + editor.getText());

        editor.restore(historic.undo());
        System.out.println("Após desfazer novamente: " + editor.getText());

        // Refazendo
        editor.restore(historic.redo());
        System.out.println("Após refazer: " + editor.getText());

        editor.restore(historic.redo());
        System.out.println("Após refazer novamente: " + editor.getText());
    }
}
