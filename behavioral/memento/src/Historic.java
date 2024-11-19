import java.util.Stack;

public class Historic {
    private final Stack<MementoText> undoPiles = new Stack<>();
    private final Stack<MementoText> redoPiles = new Stack<>();

    public void save(MementoText memento) {
        undoPiles.push(memento);
        redoPiles.clear(); // Limpa o histórico de redo ao fazer uma nova alteração
    }

    public MementoText undo() {
        MementoText memento = undoPiles.pop();
        redoPiles.push(memento);
        return memento;
    }

    public MementoText redo() {
        MementoText memento = redoPiles.pop();
        undoPiles.push(memento);
        return memento;
    }
}
