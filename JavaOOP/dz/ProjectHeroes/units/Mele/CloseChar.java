package ProjectHeroes.units.Mele;

import ProjectHeroes.units.BaseCharacter;

import java.util.ArrayList;

public abstract class CloseChar extends BaseCharacter {
    protected int rage;

    protected int baseSpeed = 5;
    public CloseChar(String name,int x, int y) {
        super(name, x, y);
        this.rage = 50;
    }
    @Override
    public void step(ArrayList<BaseCharacter> enemy,ArrayList<BaseCharacter> allys) {
        if( hp <= 0 ) return;
        if ( rage == 0 ) return;

        BaseCharacter target = getTarget(enemy);
        target.getDamage(this.damage);
        System.out.println(this.getName()+ " Наносит -> " +
                this.damage + "dmg: " +
                target.getName() + " получает урон: " +
                target.getHp()+"HP " + " Rage: " +
                this.getRage() + " FP: " +
                this.getFP());
    }

    public int getRage(){return this.rage;}
}
