package ProjectHeroes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

import ProjectHeroes.units.TeamGenerator;
import ProjectHeroes.units.BaseCharacter;
import ProjectHeroes.view.View;

public class Program {
    public static List<BaseCharacter> reds = new ArrayList<>();
    public static List<BaseCharacter> blues = new ArrayList<>();
    public static List<BaseCharacter> allChars = new ArrayList<>();

    public static void main(String[] args) {

        reds = new TeamGenerator<BaseCharacter>().getTeam(1, 10);
        blues = new TeamGenerator<BaseCharacter>().getTeam(10, 10);
        allChars.addAll(reds);
        allChars.addAll(blues);
        allChars.sort((v1, v2) -> v1.getFP() - v2.getFP());

        Scanner scanner = new Scanner(System.in);

        View.view();

        AtomicBoolean finish = new AtomicBoolean(true);
        while (finish.get()) {
            scanner.nextLine();

            allChars.forEach(ch -> {
                if (reds.contains(ch)) {
                    ch.step((ArrayList<BaseCharacter>) blues, (ArrayList<BaseCharacter>) reds);
                } else {
                    ch.step((ArrayList<BaseCharacter>) reds, (ArrayList<BaseCharacter>) blues);

                }
            });

            View.view();
        }
    }
}
