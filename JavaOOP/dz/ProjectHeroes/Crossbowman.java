package ProjectHeroes;

public class Crossbowman extends RangeChar{
    public Crossbowman(String name) {
        super(name);
        this.forcePoint = super.baseFP + 1;
        this.damage = super.baseDmg + 25;
    }

    @Override public String toString(){
        return super.toString() + ", Range: " + this.range;
    }
}
