package ProjectHeroes.Mele;

import ProjectHeroes.BaseCharacter;

public abstract class CloseChar extends BaseCharacter {
    int rage;
    int speed;
    protected int baseSpeed = 5;

    public CloseChar(String name) {
        super(name);
        this.rage = 30;
    }
}
