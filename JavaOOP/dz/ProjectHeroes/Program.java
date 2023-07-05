package ProjectHeroes;

import java.util.ArrayList;
import java.util.List;

import ProjectHeroes.source.TeamGenerator;
import ProjectHeroes.units.BaseCharacter;

public class Program {

    public static void main(String[] args) {

        List<BaseCharacter> spartak = TeamGenerator.getTeam(0, 10);
        List<BaseCharacter> cska = TeamGenerator.getTeam(9, 10);

        spartak.forEach(v -> v.step((ArrayList<BaseCharacter>) cska));

        System.out.println("-------------------------------------------------------");

        cska.forEach(v -> v.step((ArrayList<BaseCharacter>) spartak));
        System.out.println();
        System.out.println();

        spartak.get(2).step((ArrayList<BaseCharacter>) cska);
        cska.get(3).step((ArrayList<BaseCharacter>) spartak);
    }
}