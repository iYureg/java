package ProjectHeroes.units.Mele;

import ProjectHeroes.Interface.CharacterInterface;
import ProjectHeroes.units.BaseCharacter;

import java.util.ArrayList;

public class Spearman extends CloseChar {
    int armor;
    public Spearman(String name,int x, int y) {
        super(name,x, y);

        this.speed = super.baseSpeed;
        this.armor = 30;
    }
    @Override
    public String getInfo() {
        return this.getClass().getTypeName() + " " + this.getName();
    }
}
