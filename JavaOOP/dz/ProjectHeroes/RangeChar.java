package ProjectHeroes;

public abstract class RangeChar extends BaseCharacter{
    int ammo;
    int range;
    protected int baseRange = 5;
    public RangeChar(String name) {
        super(name);
        this.range = this.baseRange;
        this.ammo = 50;
    }

    public String toString(){
        return String.format("Name: %s, Hp: %d, FP: %d, Dmg: %d, Ammo: %d",
                this.name, this.hp, this.forcePoint, this.damage, this.ammo);
    }
}
