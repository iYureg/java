package ProjectHeroes;

public class Support extends BaseCharacter{
    public Support(String name) {
        super(name);
        this.damage = 0;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Hp: %d, FP: %d, Dmg: %d",
                this.name, this.hp, this.forcePoint, this.damage);
    }
}
