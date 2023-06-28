package ProjectHeroes;

public class Mage extends MagicChar{


    public Mage(String name) {
        super(name);
        this.forcePoint = super.baseFP + 2;
        this.damage = super.baseDmg + 20;

    }

    @Override public String toString(){
        return super.toString() + ", Healing: " + this.heal;
    }
}
