package ProjectHeroes.units.Magic;

import ProjectHeroes.units.BaseCharacter;

import java.util.ArrayList;

public abstract class MagicChar extends BaseCharacter {
    int mana;
    int heal;
    protected int baseHeal = 40;
    public MagicChar(String name, int x, int y) {
        super(name,x ,y);
        this.mana = 100;
        this.heal = this.baseHeal;
    }
    @Override
    public void step(ArrayList<BaseCharacter> enemy) {
        int[] targer = getTarget(enemy);
        System.out.println(this.getName()+ " Ближайшая цель -> " + enemy.get(targer[1]).getName()+ " дистанция: " + targer[0]);
    }
}
