package ProjectHeroes.units.Mele;

import ProjectHeroes.Interface.CharacterInterface;
import ProjectHeroes.units.BaseCharacter;

import java.util.ArrayList;

public class Rogue extends CloseChar {
    int agility;
    public Rogue(String name, int x, int y) {
        super(name, x, y);
        this.type = "rogue";
        this.agility = 15;
        this.forcePoint = 4;
    }
    @Override
    public String getInfo() {
        return this.getClass().getTypeName() + " " + this.getName();
    }


}
