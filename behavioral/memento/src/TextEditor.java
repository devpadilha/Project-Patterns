public class TextEditor {
    private String text = "";

    public void write(String newText) {
        text += newText;
    }

    public String getText() {
        return text;
    }

    public MementoText save() {
        return new MementoText(text);
    }

    public void restore(MementoText memento) {
        text = memento.getState();
    }
}
