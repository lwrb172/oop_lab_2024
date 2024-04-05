public class Polygon extends Shape {
    private Point[] points;

    public Polygon(Point[] points) {
        super(new Style("none", "black", 1.0));
        this.points = points;
    }

    public Polygon(Point[] points, Style style) {
        super(style);
        this.points = points;
    }

    public Polygon(Polygon polygon) {
        super(new Style(polygon.style.fillColor, polygon.style.strokeColor,
                polygon.style.strokeWidth));

        this.points = new Point[polygon.points.length];

        for(int i = 0; i < polygon.points.length; ++i) {
            points[i] = new Point(polygon.points[i].x, polygon.points[i].y);
        }
    }

    @Override
    public String toSvg() {
        StringBuilder sb = new StringBuilder();
        sb.append("<polygon points=\"");

        for(Point point : points) {
            sb.append(point.x).append(",").append(point.y).append(" ");
        }
        sb.append("\"");
        sb.append(super.style.toSvg());
        sb.append("/>");
        return sb.toString();
    }

}
