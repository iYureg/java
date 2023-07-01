package ProjectHeroes;

import ProjectHeroes.Interface.CharacterInterface;

public class Support extends BaseCharacter implements CharacterInterface {
    public Support(String name) {
        super(name);
        this.damage = 0;
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
