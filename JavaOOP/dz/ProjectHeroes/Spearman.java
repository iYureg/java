package ProjectHeroes;

public class Spearman extends CloseChar{

    int armor;
    public Spearman(String name) {
        super(name);
        this.forcePoint = super.baseFP + 3;
        this.damage = super.baseDmg + 20;
        this.speed = super.baseSpeed;
        this.armor = 30;
    }

    @Override public String toString(){
        return super.toString() + ", Armor: " + this.armor;
    }
}
