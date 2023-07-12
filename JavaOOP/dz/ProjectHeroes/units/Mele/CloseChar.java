package ProjectHeroes.units.Mele;

import ProjectHeroes.units.BaseCharacter;

import java.util.ArrayList;

public abstract class CloseChar extends BaseCharacter {
    protected int rage;
    public CloseChar(String name,int x, int y) {
        super(name, x, y);
        this.rage = 50;
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
    @Override
    public void step(ArrayList<BaseCharacter> enemy,ArrayList<BaseCharacter> allys) {
        if( hp <= 0 ) return;
    }
}
