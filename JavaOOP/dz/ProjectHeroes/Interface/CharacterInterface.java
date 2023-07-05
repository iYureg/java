package ProjectHeroes.Interface;

import ProjectHeroes.units.BaseCharacter;

import java.util.ArrayList;

/**
 * CharacterInterface
 */
public interface CharacterInterface {
    void step(ArrayList<BaseCharacter> enemy);

    String getInfo();
}