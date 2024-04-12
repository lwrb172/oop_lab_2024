import java.util.Locale;

public class StrokeShapeDecorator extends ShapeDecorator {
    private String strokeColor;
    private double width;

    public StrokeShapeDecorator(Shape decoratedShape, String strokeColor, double width) {
        super(decoratedShape);
        this.strokeColor = strokeColor;
        this.width = width;
    }

    @Override
    public String toSvg(String parameters) {
        String f = String.format(Locale.ENGLISH, "stroke=\"%s\" stroke-width=\"%f\" %s", strokeColor, width);
        return super.toSvg(f);
    }
}
