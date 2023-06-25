package JavaOOP.Lections.lesson1_customTypes.Ex2_Point2D;

public class Program {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.x = 0;
        a.y = 2;
        System.out.println(a.x);
        System.out.println(a.y);
        System.out.println(a.toString());

        Point2D b = new Point2D();
        b.x = 0;
        b.y = 10;
        System.out.println(b.x);
        System.out.println(b.y);
        System.out.println(b.toString());

        System.out.println(distance(a, b));
        System.out.println(distance(0, 2, 0, 10));

    }
}
