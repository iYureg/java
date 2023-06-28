package ProjectHeroes;

public class Sniper extends RangeChar {

    public Sniper(String name) {
        super(name);
        this.range = super.baseRange + 5;
        this.forcePoint = super.baseFP + 1;
        this.damage = super.baseDmg + 15;
    }
    @Override public String toString(){
        return super.toString() + ", Range: " + this.range;
    }
}
