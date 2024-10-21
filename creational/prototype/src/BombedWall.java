public class BombedWall extends Wall {
    private boolean _bomb;

    private BombedWall(BombedWall other) {
        this._bomb = other._bomb;
    }

    public Wall clone() {
        return new BombedWall(this);
    }

    public BombedWall() {}
}
