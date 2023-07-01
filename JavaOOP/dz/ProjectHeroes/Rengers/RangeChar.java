package ProjectHeroes.Rengers;

import ProjectHeroes.BaseCharacter;

public abstract class RangeChar extends BaseCharacter {
    int ammo;
    int range;
    protected int baseRange = 5;

    public RangeChar(String name) {
        super(name);
        this.range = this.baseRange;
        this.ammo = 50;
    }

}
