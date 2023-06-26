package JavaOOP.Lections.lesson1_customTypes.Ex3_Point2D;

public class Program {
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);

        System.out.println(a.getX());
        // Point2D a = new Point2D(0, 2);
        System.out.println(a.getX());
        System.out.println(a.getY());
        Point2D b = new Point2D(0, 10);
        System.out.println(b);
        System.out.println(b.toString());

        // Point2D b = new Point2D(0, 10);

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
