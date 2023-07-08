package ProjectHeroes.units.Rengers;

import ProjectHeroes.Interface.CharacterInterface;
import ProjectHeroes.units.BaseCharacter;

import java.util.ArrayList;

public class Crossbowman extends RangeChar {
    public Crossbowman(String name, int x, int y) {
        super(name, x, y);
        this.ammo = 10;
        this.type = "crossbowman";
        this.forcePoint = 3;
    }
    @Override
    public String getInfo() {
        return this.getClass().getTypeName() + " " + this.getName();
    }
}
