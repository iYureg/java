package JavaOOP.Lections.Lesson2_adstr_interface.ex4_interface.v2;

import JavaOOP.Lections.Lesson2_adstr_interface.ex4_interface.v2.Healers.Healer;
import JavaOOP.Lections.Lesson2_adstr_interface.ex4_interface.v2.Warriors.Warrior;

public class God extends Hero implements Healer, Warrior {

    @Override
    public void attack(Hero target) {

    }

    @Override
    public void healing(Hero target) {

    }
}
