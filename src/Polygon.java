public class Polygon implements Shape {
    private Vec2[] points;

    public Polygon(Vec2[] points) {
        this.points = points;
    }

    public Polygon(Vec2[] points, Style style) {
        this.points = points;
    }

    public Polygon(Polygon polygon) {

        this.points = new Vec2[polygon.points.length];

        for(int i = 0; i < polygon.points.length; ++i) {
            points[i] = new Vec2(polygon.points[i].x, polygon.points[i].y);
        }
    }

    @Override
    public String toSvg(String param) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n<polygon points=\"");

        for(Vec2 point : points) {
            sb.append(point.x).append(",").append(point.y).append(" ");
        }
        sb.append("\" ");
        sb.append(param);
        sb.append(" />");
        return sb.toString();
    }

    public static Polygon square(Segment segment){
        double xs, ys, dx, dy;
        xs = Math.abs(segment.getStartPoint().x - segment.getEndPoint().x)/2;
        ys = Math.abs(segment.getStartPoint().y - segment.getEndPoint().y)/2;
        dx = Math.abs(xs - segment.getEndPoint().x);
        dy = Math.abs(ys - segment.getEndPoint().y);
        return new Polygon(new Vec2[]{new Vec2(xs - dx, ys-dy),new Vec2(xs+dx,ys+dy),new Vec2(xs-dx,ys+dy),new Vec2(xs+dx,ys-dy)});
    }

}
