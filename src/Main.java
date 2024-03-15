public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        Segment seg = new Segment(p1, p2);

        System.out.println(seg.length());
    }
}