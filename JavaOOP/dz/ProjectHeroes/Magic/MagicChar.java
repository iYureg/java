package ProjectHeroes.Magic;

import ProjectHeroes.BaseCharacter;

public abstract class MagicChar extends BaseCharacter {

    int mana;
    int heal;
    protected int baseHeal = 40;

    public MagicChar(String name) {
        super(name);
        this.mana = 100;
        this.heal = this.baseHeal;
    }

}
