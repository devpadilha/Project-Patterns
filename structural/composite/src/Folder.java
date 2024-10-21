import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {
    private String name;
    private List<Component> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void open() {
        System.out.println("Folder " + name + " opened");
        for (Component component : components) {
            component.open();
        }
    }

    @Override
    public void remove() {
        System.out.println("Folder " + name + " removed");
        for (Component component : components) {
            component.remove();
        }
    }

    @Override
    public void showDetails() {
        System.out.println("Folder " + name + " details:");
        for (Component component : components) {
            component.showDetails();
        }
    }
}
