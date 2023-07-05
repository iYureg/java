package ProjectHeroes.units;

import ProjectHeroes.Interface.CharacterInterface;

import java.util.ArrayList;

public class Support extends BaseCharacter implements CharacterInterface {
    public Support(String name, int x, int y) {
        super(name, x ,y);
        this.damage = 0;
    }
    @Override
    public String getInfo() {
        return this.getClass().getTypeName() + " " + this.getName();
    }

    @Override
    public void step(ArrayList<BaseCharacter> enemy) {
        int[] targer = getTarget(enemy);
        System.out.println(this.getName()+ " Ближайшая цель -> " + enemy.get(targer[1]).getName()+ " дистанция: " + targer[0]);
    }
}
