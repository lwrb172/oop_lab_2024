public class Segment {

    private Vec2 startPoint;
    private Vec2 endPoint;

    public Segment(Vec2 startPoint, Vec2 endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Vec2 getStartPoint() {
        return startPoint;
    }

    public Vec2 getEndPoint() {
        return endPoint;
    }

    public double length() {
        return Math.sqrt(Math.pow(endPoint.x - startPoint.x, 2)
                + Math.pow(endPoint.y - startPoint.y, 2));

    }

    public String toSvg() {
        return "<line x1=\""+startPoint.x+"\" y1=\""+endPoint.y+"\"" +
                " x2=\""+startPoint.y+"\" y2=\""+endPoint.y+"\"" +
                " style=\"stroke:black;stroke-width:1\" />";
    }

    public static Segment[] perpendicularSegments(Segment segment, Vec2 point) {
        double dx = segment.endPoint.x - segment.startPoint.x;
        double dy = segment.endPoint.y - segment.startPoint.y;

        double new_dx1 = - dy;
        double new_dy1 = dx;
        double new_dx2 = dy;
        double new_dy2 = - dx;

        double endx1 = point.x + new_dx1;
        double endy1 = point.x + new_dy1;
        double endx2 = point.x + new_dx2;
        double endy2 = point.x + new_dy2;

        Vec2 first_end = new Vec2(endx1, endy1);
        Vec2 second_end = new Vec2(endx2, endy2);

        Segment first = new Segment(point, first_end);
        Segment second = new Segment(point, second_end);

        return new Segment[]{first, second};
    }
}
