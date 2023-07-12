package ProjectHeroes.units.Rengers;

public class Crossbowman extends RangeChar {
    public Crossbowman(String name, int x, int y) {
        super(name, x, y);
        this.ammo = 10;
        this.type = "crossbowman";
        this.forcePoint = 3;
    }
}
