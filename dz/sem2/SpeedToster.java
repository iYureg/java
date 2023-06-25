//Сравнить время выполнения замены символа "а" на "А"
// любой строки содержащей > 1000 символов средствами String и StringBuilder.
public class SpeedToster {
    public static void main(String[] args) {

        String a1 = "";
        for (int i = 0; i < 10000; i++) {
            a1 += "a";
        }
        StringBuilder a2 = new StringBuilder(a1);


        long timer = System.currentTimeMillis();
        a1.replaceAll("a", "a".toUpperCase());
        System.out.println("String time: " + (System.currentTimeMillis() - timer) + "ms");

        timer = System.currentTimeMillis();
        for (int i = 0; i < a2.length(); i++) {
            a2.replace(a2.indexOf("a"),a2.indexOf("a")+1,"a".toUpperCase());
        }
        System.out.println("StringBuilder time: " + (System.currentTimeMillis() - timer) + "ms !!!" );
    }
}
