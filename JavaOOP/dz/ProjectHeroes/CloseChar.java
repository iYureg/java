package ProjectHeroes;

public abstract class CloseChar extends BaseCharacter{
    int rage;
    int speed;
    protected int baseSpeed = 5;

    public CloseChar(String name) {
        super(name);
        this.rage = 30;
        this.hp = super.maxHp + 50;
    }
    public String toString(){
        return String.format("Name: %s, Hp: %d, FP: %d, Dmg: %d, Rage: %d, Speed: %d",
                this.name, this.hp, this.forcePoint, this.damage, this.rage, this.speed);
    }
}
