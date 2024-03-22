public class Polygon {
    private Point[] points;

    public Polygon(Point[] points) {
        this.points = points;
    }

    public Polygon(Polygon polygon) {
        this.points = new Point[polygon.points.length];

        for(int i = 0; i < polygon.points.length; ++i) {
            points[i] = new Point(polygon.points[i].x, polygon.points[i].y);
        }
    }

    public String toSvg() {
        StringBuilder sb = new StringBuilder();
        sb.append("<polygon points=\"");

        for(Point point : points) {
            sb.append(point.x).append(",").append(point.y).append(" ");
        }
        sb.append("\" style=\"fill:none;stroke:black;stroke-width:1\"/>\n");

        return sb.toString();
    }

}
