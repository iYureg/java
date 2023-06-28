package ProjectHeroes;

public class Rogue extends CloseChar{

    int agility;
    public Rogue(String name) {
        super(name);
        this.forcePoint = super.baseFP + 3;
        this.damage = super.baseDmg + 15;
        this.speed = super.baseSpeed + 5;
        this.agility = 15;
    }

    @Override public String toString(){
        return super.toString() + ", Agility: " + this.agility;
    }
}
