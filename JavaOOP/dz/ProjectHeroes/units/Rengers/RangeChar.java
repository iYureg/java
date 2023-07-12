package ProjectHeroes.units.Rengers;

import ProjectHeroes.units.BaseCharacter;
import ProjectHeroes.units.Support;

import java.util.ArrayList;

public abstract class RangeChar extends BaseCharacter {
     protected int ammo;

    public RangeChar(String name,int x, int y) {
        super(name, x, y);
        this.ammo = 10;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + this.ammo + "\u27BC ";
    }
    @Override
    public void step(ArrayList<BaseCharacter> enemy, ArrayList<BaseCharacter> allys) {
        if( this.hp <= 0 ) return;
        if ( this.ammo == 0 ) return;

        BaseCharacter target = getTarget(enemy);
        target.getDamage(this.damage);
        for(BaseCharacter ch : allys) {
            if(ch.getType().equals("support") && !((Support)(ch)).getBusy() && ch.getHp() > 0){
                ((Support)(ch)).setBusy();
                return;
            }
        }
        this.ammo--;
    }
}
