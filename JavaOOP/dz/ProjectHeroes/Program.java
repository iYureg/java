package ProjectHeroes;

import java.util.ArrayList;
import java.util.List;

import ProjectHeroes.units.TeamGenerator;
import ProjectHeroes.units.BaseCharacter;
import ProjectHeroes.view.View;

public class Program {
    public static List<BaseCharacter> spartak =  new ArrayList<>();
    public static List<BaseCharacter> cska =  new ArrayList<>();
    public static List<BaseCharacter> allChars = new ArrayList<>();
    public static void main(String[] args) {

        spartak = new TeamGenerator<BaseCharacter>().getTeam(1, 10);
        cska = new TeamGenerator<BaseCharacter>().getTeam(10, 10);
        allChars.addAll(spartak);
        allChars.addAll(cska);
//        allChars.sort((v1, v2) -> v1.getFP() - v2.getFP());


        View.view();


        allChars.forEach(ch -> {
            if (spartak.contains(ch)) {
                ch.step((ArrayList<BaseCharacter>) cska, (ArrayList<BaseCharacter>) spartak);
                if(ch.getType().equals("rogue") || ch.getType().equals("spearman")) ch.setCordX(1);
            } else {
                ch.step((ArrayList<BaseCharacter>) cska, (ArrayList<BaseCharacter>) spartak);
                if(ch.getType().equals("rogue") || ch.getType().equals("spearman")) ch.setCordX(-1);
            }
        });

        View.view();
    }
}
