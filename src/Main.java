public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 2);
        Segment seg = new Segment(p1, p2);

        System.out.println(seg.length());
        System.out.println(seg.toSvg());

        Segment segment = new Segment(new Point(0,0),new Point(100,100));
        System.out.println(segment.toSvg());
        Segment[] segments = Segment.perpendicularSegments(segment,new Point(100/2,100/2));
        System.out.println(segment.length());
        System.out.println(segments[0].toSvg());
        System.out.println(segments[1].toSvg());
        System.out.println(segments[0].length());
        System.out.println(segments[1].length());

        Point[] pointsArray = {new Point(50, 50), new Point(50, 20),
                                new Point(100, 20),new Point(100, 50)};

        Polygon polygon = new Polygon(pointsArray);
        System.out.println(polygon.toSvg());

        Polygon polygon2 = new Polygon(polygon);
        System.out.println(polygon2.toSvg());
    }
}