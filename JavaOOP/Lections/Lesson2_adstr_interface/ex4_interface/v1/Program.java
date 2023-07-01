package JavaOOP.Lections.Lesson2_adstr_interface.ex4_interface.v1;

import java.util.ArrayList;
import java.util.List;

import JavaOOP.Lections.Lesson2_adstr_interface.ex4_interface.v1.Healers.Druid;
import JavaOOP.Lections.Lesson2_adstr_interface.ex4_interface.v1.Healers.Healer;
import JavaOOP.Lections.Lesson2_adstr_interface.ex4_interface.v1.Healers.Shaman;
import JavaOOP.Lections.Lesson2_adstr_interface.ex4_interface.v1.Warriors.Knight;
import JavaOOP.Lections.Lesson2_adstr_interface.ex4_interface.v1.Warriors.Paladin;
import JavaOOP.Lections.Lesson2_adstr_interface.ex4_interface.v1.Warriors.Warrior;

public class Program {
    public static void main(String[] args) {

        // #region team1
        List<Hero> team1 = new ArrayList<>();
        team1.add(new Druid());
        team1.add(new Shaman());
        team1.add(new Paladin());
        team1.add(new Druid());

        // team1.get(0).attack

        var h = team1.get(0);

        if (h instanceof Warrior) {
            ((Warrior) h).attack(null);
        } else if (h instanceof Healer) {
            ((Healer) h).healing(null);
        } else {
            // ....
        }
        // #endregion

        // #region team2
        List<Warrior> team2 = new ArrayList<>();
        // team2.add(new Druid());
        team2.add(new Paladin());
        team2.add(new Knight());

        team2.get(0).attack(null);

        List<Healer> team3 = new ArrayList<>();
        // team2.add(new Paladin());
        team3.add(new Druid());
        team3.add(new Shaman());

        team3.get(0).healing(null);

        // #endregion

    }
}
