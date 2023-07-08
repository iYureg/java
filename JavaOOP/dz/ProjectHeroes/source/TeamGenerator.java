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

public class TeamGenerator <T extends BaseCharacter> {
    private static Random r = new Random();

    public ArrayList<T> getTeam(int side, int size) {
        List<T> team = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String value = Types.values()[r.nextInt(7)].toString();
            int rand = r.nextInt(200);
            switch (value) {
                case "Mage": {
                    team.add(i, (T) new Mage(value + "_" + i, side, rand));
                    break;
                }
                case "Monk": {
                    team.add(i, (T) new Monk(value + "_" + i, side, rand));
                    break;
                }
                case "Rogue": {
                    team.add(i, (T) new Rogue(value + "_" + i, side, rand));
                    break;
                }
                case "Spearman": {
                    team.add(i, (T) new Spearman(value + "_" + i, side, rand));
                    break;
                }
                case "Sniper": {
                    team.add(i, (T) new Sniper(value + "_" + i, side, rand));
                    break;
                }
                case "Crossbowman": {
                    team.add(i, (T) new Crossbowman(value + "_" + i, side, rand));
                    break;
                }
                case "Worker": {
                    team.add(i, (T) new Support(value + "_" + i, side, rand));
                    break;
                }
            }
        }
        return (ArrayList<T>) team;
    }
}
