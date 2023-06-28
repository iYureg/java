package ProjectHeroes;

public class Program {
    public static void main(String[] args) {
        Mage mage = new Mage("Маг");
        System.out.println(mage.toString());
        System.out.println(mage.isAlive());

        Monk monk = new Monk("Монах");
        System.out.println(monk.toString());
        System.out.println(monk.isAlive());

        Sniper sniper = new Sniper("Лучник");
        System.out.println(sniper.toString());
        System.out.println(sniper.isAlive());

        Crossbowman crossbowman = new Crossbowman("Арбалет");
        System.out.println(crossbowman.toString());
        System.out.println(crossbowman.isAlive());

        Rogue rogue = new Rogue("Рога");
        System.out.println(rogue.toString());
        System.out.println(rogue.isAlive());

        Spearman spearman = new Spearman("Копьё");
        System.out.println(spearman.toString());
        System.out.println(spearman.isAlive());

        Support support = new Support("Санчо");
        System.out.println(support.toString());
        System.out.println(support.isAlive());
    }
}
