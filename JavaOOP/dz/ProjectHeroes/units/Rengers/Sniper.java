package ProjectHeroes.units.Rengers;

public class Sniper extends RangeChar {
    public Sniper(String name, int x, int y) {
        super(name, x, y);
        this.type = "sniper";
        this.ammo = 11;
        this.forcePoint = 2;
    }
}
