package ProjectHeroes.units.Rengers;

import ProjectHeroes.Interface.CharacterInterface;
import ProjectHeroes.units.BaseCharacter;

import java.util.ArrayList;

public class Sniper extends RangeChar {
    public Sniper(String name, int x, int y) {
        super(name, x, y);
        this.range = super.baseRange + 5;
    }
    @Override
    public String getInfo() {
        return this.getClass().getTypeName() + " " + this.getName();
    }

}
