package ProjectHeroes.Mele;

import ProjectHeroes.Interface.CharacterInterface;

public class Rogue extends CloseChar implements CharacterInterface {

    int agility;

    public Rogue(String name) {
        super(name);
        this.speed = super.baseSpeed + 5;
        this.agility = 15;
    }

    @Override
    public String getInfo() {
        return this.getClass().getTypeName() + " " + this.getName();
    }

    @Override
    public void step() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }
}
