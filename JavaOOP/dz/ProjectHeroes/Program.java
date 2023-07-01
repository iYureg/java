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

        List<BaseCharacter> characters = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String value = Types.values()[new Random().nextInt(6)].toString();
            switch (value) {
                case "Mage": {
                    characters.add(i, new Mage(value + "_" + i));
                    break;
                }
                case "Monk": {
                    characters.add(i, new Monk(value + "_" + i));
                    break;
                }
                case "Rogue": {
                    characters.add(i, new Rogue(value + "_" + i));
                    break;
                }
                case "Spearman": {
                    characters.add(i, new Spearman(value + "_" + i));
                    break;
                }
                case "Sniper": {
                    characters.add(i, new Sniper(value + "_" + i));
                    break;
                }
                case "Crossbowman": {
                    characters.add(i, new Crossbowman(value + "_" + i));
                    break;
                }
                case "Worker": {
                    characters.add(i, new Support(value + "_" + i));
                    break;
                }
            }
        }
        for (BaseCharacter Char : characters) {
            System.out.println(Char.getInfo());
        }
    }
}
