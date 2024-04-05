import java.util.Locale;

public class Ellipse extends Shape {
    private Point center;
    private double rx, ry;

    public Ellipse(Point center, double rx, double ry, Style style) {
        super(style);
        this.center = center;
        this.rx = rx;
        this.ry = ry;
    }

    @Override
    public String toSvg() {
        return String.format(Locale.ENGLISH,
                "<ellipse cx='%f' cy='%f' rx='%f' ry='%f' %s />",
                this.center.x, this.center.y,
                this.rx, this.ry, super.style.toSvg());
    }
}
