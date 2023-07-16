package ProjectHeroes.units.Magic;

public class Priest extends MagicChar {
    public Priest(String name, int x, int y) {
        super(name, x, y);
        this.type = "priest";
        this.forcePoint = 6;
    }
}
