import java.util.ArrayList;

public class LunchIterator implements Iterator {
    private ArrayList<ItemMenu> itens;
    private int posicao = 0;

    public LunchIterator(ArrayList<ItemMenu> itens) {
        this.itens = itens;
    }

    @Override
    public boolean hasNext() {
        return posicao < itens.size();
    }

    @Override
    public Object next() {
        ItemMenu item = itens.get(posicao);
        posicao++;
        return item;
    }
}
