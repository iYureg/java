package ProjectHeroes;

public class Monk extends MagicChar{
    public Monk(String name) {
        super(name);
        this.forcePoint = super.baseFP + 2;
        this.damage = super.baseDmg + 10;
        this.heal = super.baseHeal + 20;
    }

    @Override public String toString(){
        return super.toString() + ", Healing: " + this.heal;
    }
}
