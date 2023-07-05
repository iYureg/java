package ProjectHeroes.source;

import ProjectHeroes.units.BaseCharacter;
import ProjectHeroes.units.Magic.Mage;
import ProjectHeroes.units.Magic.Monk;
import ProjectHeroes.units.Mele.Rogue;
import ProjectHeroes.units.Mele.Spearman;
import ProjectHeroes.units.Rengers.Crossbowman;
import ProjectHeroes.units.Rengers.Sniper;
import ProjectHeroes.units.Support;
import ProjectHeroes.units.Types;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TeamGenerator {
    public static ArrayList<BaseCharacter> getTeam(int side, int size) {
        Random r = new Random();
        List<BaseCharacter> team = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            String value = Types.values()[r.nextInt(7)].toString();
            int rand = r.nextInt(200);
            switch (value) {
                case "Mage": {
                    team.add(i, new Mage(value + "_" + i, side, rand));
                    break;
                }
                case "Monk": {
                    team.add(i, new Monk(value + "_" + i, side, rand));
                    break;
                }
                case "Rogue": {
                    team.add(i, new Rogue(value + "_" + i, side, rand));
                    break;
                }
                case "Spearman": {
                    team.add(i, new Spearman(value + "_" + i, side, rand));
                    break;
                }
                case "Sniper": {
                    team.add(i, new Sniper(value + "_" + i, side, rand));
                    break;
                }
                case "Crossbowman": {
                    team.add(i, new Crossbowman(value + "_" + i, side, rand));
                    break;
                }
                case "Worker": {
                    team.add(i, new Support(value + "_" + i, side, rand));
                    break;
                }
            }
        }
        return (ArrayList<BaseCharacter>) team;
    }
}
