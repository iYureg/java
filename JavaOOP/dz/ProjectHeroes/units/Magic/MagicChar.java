package ProjectHeroes.units.Magic;

import ProjectHeroes.units.BaseCharacter;
import ProjectHeroes.units.Support;

import java.util.ArrayList;
import java.util.Random;

public abstract class MagicChar extends BaseCharacter {
    static Random r = new Random();
    protected int mana;
    protected int heal;

    public MagicChar(String name, int x, int y) {
        super(name,x ,y);
        this.heal = r.nextInt(20, 31);
        this.mana = 100;
    }

    public void healing(BaseCharacter ch){
        ch.setHp(this.heal);
        this.mana -= 10;
        System.out.println(this.name + " лечит " + ch.getName());
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + this.mana + "\u2735 ";
    }
    @Override
    public void step(ArrayList<BaseCharacter> enemy, ArrayList<BaseCharacter> allys) {
        if ( hp <= 0 ) return;
        if ( mana < 10 ) return;

        int pacientIndex = allys.size() + 10;
        int minHp = super.maxHp;
        for (int i = 0; i < allys.size() ; i++) {
            if(allys.get(i).getHp() < minHp){
                minHp = allys.get(i).getHp();
                pacientIndex = i;
            }
        }

        if (pacientIndex < allys.size()) {
            healing(allys.get(pacientIndex));
        } else {
            BaseCharacter target = getTarget(enemy);
            target.getDamage(super.minDmg);
            this.mana -= 10;
        }
    }
}
