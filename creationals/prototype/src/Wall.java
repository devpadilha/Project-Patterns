public class Wall extends MapSite implements Cloneable{
    @Override
    public Wall clone() {
        try {
            return (Wall) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    public Wall() {}
}
