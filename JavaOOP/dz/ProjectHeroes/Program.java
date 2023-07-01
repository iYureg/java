package ProjectHeroes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ProjectHeroes.Magic.Mage;
import ProjectHeroes.Magic.Monk;
import ProjectHeroes.Mele.Rogue;
import ProjectHeroes.Mele.Spearman;
import ProjectHeroes.Rengers.Crossbowman;
import ProjectHeroes.Rengers.Sniper;

public class Program {

    public static void main(String[] args) {

        List<BaseCharacter> team1 = getTeam();
        List<BaseCharacter> team2 = getTeam();

        team1.forEach(v -> System.out.println(v.getInfo()));

        System.out.println("--------------");

        team2.forEach(v -> System.out.println(v.getInfo()));

    }

    public static ArrayList<BaseCharacter> getTeam() {
        Random r = new Random();
        List<BaseCharacter> team = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String value = Types.values()[r.nextInt(7)].toString();
            switch (value) {
                case "Mage": {
                    team.add(i, new Mage(value + "_" + i));
                    break;
                }
                case "Monk": {
                    team.add(i, new Monk(value + "_" + i));
                    break;
                }
                case "Rogue": {
                    team.add(i, new Rogue(value + "_" + i));
                    break;
                }
                case "Spearman": {
                    team.add(i, new Spearman(value + "_" + i));
                    break;
                }
                case "Sniper": {
                    team.add(i, new Sniper(value + "_" + i));
                    break;
                }
                case "Crossbowman": {
                    team.add(i, new Crossbowman(value + "_" + i));
                    break;
                }
                case "Worker": {
                    team.add(i, new Support(value + "_" + i));
                    break;
                }
            }
        }
        return (ArrayList<BaseCharacter>) team;
    }
}
