package ProjectHeroes.units.Magic;

import ProjectHeroes.Interface.CharacterInterface;
import ProjectHeroes.units.BaseCharacter;

import java.util.ArrayList;

public class Monk extends MagicChar {
    public Monk(String name, int x, int y) {
        super(name, x, y);
        this.type = "monk";
        this.forcePoint = 6;
    }
    @Override
    public String getInfo() {
        return this.getClass().getTypeName() + " " + this.getName();
    }
}
