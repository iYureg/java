package ProjectHeroes.units;

import ProjectHeroes.Interface.CharacterInterface;

import java.util.ArrayList;

public class Support extends BaseCharacter implements CharacterInterface {
    public Support(String name, int x, int y) {
        super(name, x ,y);
        this.damage = 0;
        this.type = "support";
        this.forcePoint = 10;

    }
    @Override
    public String getInfo() {
        return this.getClass().getTypeName() + " " + this.getName();
    }

    @Override
    public void step(ArrayList<BaseCharacter> enemy,ArrayList<BaseCharacter> allys) {
        if( hp <= 0 ) return;

        BaseCharacter target = getTarget(enemy);
        target.getDamage(this.damage);
        System.out.println(this.getName()+ " Наносит -> " +
                this.damage + "dmg: " +
                target.getName() + " получает урон: " +
                target.getHp()+"HP " + " FP: " +
                this.getFP());
    }
}
