package ProjectHeroes.units.Magic;

public class Monk extends MagicChar {
    public Monk(String name, int x, int y) {
        super(name, x, y);
        this.type = "monk";
        this.forcePoint = 6;
    }
}
