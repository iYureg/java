package ProjectHeroes.Rengers;

import ProjectHeroes.Interface.CharacterInterface;

public class Crossbowman extends RangeChar implements CharacterInterface {
    public Crossbowman(String name) {
        super(name);

    }

    @Override
    public void step() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

    @Override
    public String getInfo() {
        return this.getClass().getTypeName() + " " + this.getName();
    }
}
