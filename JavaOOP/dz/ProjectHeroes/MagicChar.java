package ProjectHeroes;

public abstract class MagicChar extends BaseCharacter {

    int mana;
    int heal;
    protected int baseHeal = 40;
    public MagicChar(String name) {
        super(name);
        this.mana = 100;
        this.heal = this.baseHeal;
    }

    @Override
    public String toString() {
       return String.format("Name: %s, Hp: %d, FP: %d, Dmg: %d, Mana: %d",
               this.name, this.hp, this.forcePoint, this.damage, this.mana);
    }
}
