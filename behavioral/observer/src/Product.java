import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private final String name;
    private boolean inStock;

    public Product(String name) {
        this.name = name;
        this.inStock = false;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        if (inStock) {
            notifyObservers();
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("O produto " + name + " está agora disponível em estoque!");
        }
    }
}
