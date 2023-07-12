package ProjectHeroes.units;

import ProjectHeroes.units.Magic.Mage;
import ProjectHeroes.units.Magic.Monk;
import ProjectHeroes.units.Mele.Rogue;
import ProjectHeroes.units.Mele.Spearman;
import ProjectHeroes.units.Rengers.Crossbowman;
import ProjectHeroes.units.Rengers.Sniper;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TeamGenerator <T extends BaseCharacter> {
    private static Random r = new Random();
    private static String[] types = {"Mage","Monk","Rogue","Spearman","Sniper","Crossbowman","Worker"};




   public ArrayList<T> getTeam(int side, int size) {
        List<T> team = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String value = types[r.nextInt(7)];

            switch (value) {
                case "Mage": {
                    team.add((T) new Mage(value + "_" + i, side, i));
                    break;
                }
                case "Monk": {
                    team.add((T) new Monk(value + "_" + i, side, i));
                    break;
                }
                case "Rogue": {
                    team.add((T) new Rogue(value + "_" + i, side, i));
                    break;
                }
                case "Spearman": {
                    team.add((T) new Spearman(value + "_" + i, side, i));
                    break;
                }
                case "Sniper": {
                    team.add((T) new Sniper(value + "_" + i, side, i));
                    break;
                }
                case "Crossbowman": {
                    team.add((T) new Crossbowman(value + "_" + i, side, i));
                    break;
                }
                case "Worker": {
                    team.add((T) new Support(value + "_" + i, side, i));
                    break;
                }
            }
        }
        return (ArrayList<T>) team;
    }
}
