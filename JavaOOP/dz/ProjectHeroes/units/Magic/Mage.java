package ProjectHeroes.units.Magic;

import ProjectHeroes.Interface.CharacterInterface;
import ProjectHeroes.units.BaseCharacter;

import java.util.ArrayList;

public class Mage extends MagicChar {
    public Mage(String name, int x, int y) {
        super(name, x, y);
    }
    @Override
    public String getInfo() {
        return this.getClass().getTypeName() + " " + this.getName();
    }
}
