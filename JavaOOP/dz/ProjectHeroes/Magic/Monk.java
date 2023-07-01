package ProjectHeroes.Magic;

import ProjectHeroes.Interface.CharacterInterface;

public class Monk extends MagicChar implements CharacterInterface {
    public Monk(String name) {
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
