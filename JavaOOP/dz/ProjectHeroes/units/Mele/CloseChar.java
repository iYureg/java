package ProjectHeroes.units.Mele;

import ProjectHeroes.units.BaseCharacter;

import java.util.ArrayList;

public abstract class CloseChar extends BaseCharacter {
    int rage;
    int speed;
    protected int baseSpeed = 5;
    public CloseChar(String name,int x, int y) {
        super(name, x, y);
        this.rage = 30;
    }
    @Override
    public void step(ArrayList<BaseCharacter> enemy) {
        int[] targer = getTarget(enemy);
        System.out.println(this.getName()+ " Ближайшая цель -> " + enemy.get(targer[1]).getName()+ " дистанция: " + targer[0]);
    }
}
