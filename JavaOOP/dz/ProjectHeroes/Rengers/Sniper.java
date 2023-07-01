package ProjectHeroes.Rengers;

import ProjectHeroes.Interface.CharacterInterface;

public class Sniper extends RangeChar implements CharacterInterface {

    public Sniper(String name) {
        super(name);
        this.range = super.baseRange + 5;
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
