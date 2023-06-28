package ProjectHeroes;

import java.util.Random;

public abstract class BaseCharacter {
    protected int id;
    String name;
    protected boolean isAlive;
    protected int maxHp = 200;
    int hp;
    protected int baseDmg = 30;
    int damage;
    protected  int baseFP = 3;
    int forcePoint;

    public BaseCharacter(String name) {
        this.id = new Random().nextInt(0, Integer.MAX_VALUE);
        this.name = name;
        this.isAlive = true;
        this.hp = maxHp;
        this.damage = baseDmg;
        this.forcePoint = baseFP;
    }

    public boolean isAlive(){
        return this.isAlive;
    }
}
