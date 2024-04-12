public class SolidFilledPolygon extends Polygon {
    private String fillColour;

    public SolidFilledPolygon(Vec2[] points, String fillColour) {
        super(points);
        this.fillColour = fillColour;
    }

    @Override
    public String toSvg(String parameters) {
        String f=String.format("fill=\"%s\" %s ",fillColour,parameters);
        return super.toSvg(f);
    }
}
