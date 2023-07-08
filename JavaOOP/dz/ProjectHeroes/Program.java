package ProjectHeroes;

import java.util.ArrayList;
import java.util.List;

import ProjectHeroes.source.TeamGenerator;
import ProjectHeroes.units.BaseCharacter;

public class Program {

    public static void main(String[] args) {

        List<BaseCharacter> spartak = new TeamGenerator<BaseCharacter>().getTeam(0, 11);
        List<BaseCharacter> cska = new TeamGenerator<BaseCharacter>().getTeam(9, 11);

        List<BaseCharacter> allChars = new ArrayList<>();
        allChars.addAll(spartak);
        allChars.addAll(cska);
        allChars.sort((v1, v2) -> v1.getFP() - v2.getFP());
        // allChars.sort((v1, v2) -> v2.getFP() - v1.getFP());

        allChars.forEach(ch -> {
            if (spartak.contains(ch)) {
                ch.step((ArrayList<BaseCharacter>) cska, (ArrayList<BaseCharacter>) spartak);
            } else {
                ch.step((ArrayList<BaseCharacter>) spartak, (ArrayList<BaseCharacter>) cska);
            }
        });

        // System.out.println();
        // System.out.println();

        // compareByFP(cska);
        // compareByFP(spartak);

        // spartak.forEach(v -> v.step((ArrayList<BaseCharacter>) cska,
        // (ArrayList<BaseCharacter>) spartak));
        // System.out.println("-".repeat(60));
        // cska.forEach(v -> v.step((ArrayList<BaseCharacter>) spartak,
        // (ArrayList<BaseCharacter>) cska));

    }

    // private static void compareByFP(List<BaseCharacter> team){
    // team.sort((o1, o2) -> - o1.getFP() - o2.getFP());
    // }
    // private static void compareByHP(List<BaseCharacter> team){
    // team.sort((o1, o2) -> o1.getHp() - o2.getHp());
    // }
}
