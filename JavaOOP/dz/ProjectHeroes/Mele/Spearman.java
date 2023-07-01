package ProjectHeroes.Mele;

import ProjectHeroes.Interface.CharacterInterface;

public class Spearman extends CloseChar implements CharacterInterface {

    int armor;

    public Spearman(String name) {
        super(name);

        this.speed = super.baseSpeed;
        this.armor = 30;
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
