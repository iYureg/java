package ProjectHeroes.units.Mele;

import ProjectHeroes.Interface.CharacterInterface;
import ProjectHeroes.units.BaseCharacter;

import java.util.ArrayList;

public class Rogue extends CloseChar {
    int agility;
    public Rogue(String name, int x, int y) {
        super(name, x, y);
        this.speed = super.baseSpeed + 5;
        this.agility = 15;
    }
    @Override
    public String getInfo() {
        return this.getClass().getTypeName() + " " + this.getName();
    }


}
