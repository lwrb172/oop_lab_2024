import java.util.Locale;

public class Ellipse implements Shape {
    private Vec2 center;
    private double rx, ry;

    public Ellipse(Vec2 center, double rx, double ry, Style style) {
        this.center = center;
        this.rx = rx;
        this.ry = ry;
    }

    @Override
    public String toSvg(String params) {
        return String.format(Locale.ENGLISH,
                "<ellipse cx='%f' cy='%f' rx='%f' ry='%f' %s />",
                this.center.x, this.center.y,
                this.rx, this.ry, params);
    }
}
