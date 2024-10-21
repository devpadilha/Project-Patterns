public class File implements Component{
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Opening file " + name);
    }

    @Override
    public void remove() {
        System.out.println("Removing file " + name);
    }

    @Override
    public void showDetails() {
        System.out.println("File name: " + name);
    }
}
