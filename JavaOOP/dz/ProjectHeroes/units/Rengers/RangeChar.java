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

    @Override public void Attack(BaseCharacter target){
        super.Attack(target);
    }
    @Override
    public void step(ArrayList<BaseCharacter> enemy, ArrayList<BaseCharacter> allys) {
        if( this.hp <= 0 ) return;
        if ( this.ammo == 0 ) return;

        BaseCharacter target = getTarget(enemy);
        target.getDamage(this.damage);
        for(BaseCharacter ch : allys) {
            if(ch.getType().equals("support")){
                return;
            }
        }
        this.ammo--;
        System.out.println(this.getName()+ " Наносит -> " +
                this.damage + "dmg: " +
                target.getName() + " получает урон: " +
                target.getHp()+"HP " + " Ammo: " +
                this.getAmmo() + " FP: " +
                this.getFP());
    }
    protected int getAmmo(){return this.ammo;}
    protected boolean checkSupport(BaseCharacter ally) {
        return ally.getType() == "support";

    }
}
