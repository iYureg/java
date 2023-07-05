package ProjectHeroes.units.Rengers;

import ProjectHeroes.units.BaseCharacter;

import java.util.ArrayList;

public abstract class RangeChar extends BaseCharacter {
    int ammo;
    int range;
    protected int baseRange = 5;
    public RangeChar(String name,int x, int y) {
        super(name, x, y);
        this.range = this.baseRange;
        this.ammo = 50;
    }
    @Override
    public void step(ArrayList<BaseCharacter> enemy) {
        int[] targer = getTarget(enemy);
        System.out.println(this.getName()+ " Ближайшая цель -> " + enemy.get(targer[1]).getName()+ " дистанция: " + targer[0]);
    }
}
