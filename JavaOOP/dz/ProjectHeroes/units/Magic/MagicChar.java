package ProjectHeroes.units.Magic;

import ProjectHeroes.units.BaseCharacter;

import java.util.ArrayList;

public abstract class MagicChar extends BaseCharacter {
    int mana;
    int heal;
    protected int baseHeal = 40;
    public MagicChar(String name, int x, int y) {
        super(name,x ,y);
        this.heal = this.baseHeal;
    }
    @Override
    public void step(ArrayList<BaseCharacter> enemy, ArrayList<BaseCharacter> allys) {
        if( hp <= 0 ) return;
        if ( mana == 0 ) return;

        BaseCharacter target = getTarget(enemy);
        target.getDamage(this.damage);
        System.out.println(this.getName()+ " Наносит -> " +
                this.damage + "dmg: " +
                target.getName() + " получает урон: " +
                target.getHp()+"HP " + " mana: " +
                this.getMana() + " FP: " +
                this.getFP());
    }
    public int getMana(){return this.mana;}
}
