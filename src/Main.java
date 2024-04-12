import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        Vec2 p1 = new Vec2(0, 0);
        Vec2 p2 = new Vec2(2, 2);
        Segment seg = new Segment(p1, p2);
        SolidFilledPolygon polygon = new SolidFilledPolygon(new Vec2[]{new Vec2(100,20),new Vec2(40,50),new Vec2(100,120)},"red");

        Vec2[] pointsArray = {new Vec2(50, 50), new Vec2(50, 20),
                                new Vec2(100, 20),new Vec2(100, 50)};


        Shape poly3 = new Polygon(new Vec2[]{new Vec2(90, 45),
                new Vec2(56, 60), new Vec2(100, 10)});
        SvgScene scene = new SvgScene();
        SolidFilledPolygon poly1 = new SolidFilledPolygon(
                new Vec2[]{new Vec2(190, 145),
                        new Vec2(156, 160),
                        new Vec2(254, 200)}, "red");
        scene.add(poly3);
        //scene.add(Polygon.square(new Segment(new Vec2(400, 300), new Vec2(200, 500))));

        ShapeDecorator solidFillShapeDecorator = new SolidFillShapeDecorator(poly3, "red");
        TransformationDecorator.Builder builder = new TransformationDecorator.Builder(new SolidFillShapeDecorator(poly3, "red"));
        TransformationDecorator s = builder.rotate(-10, new Vec2(0, 0)).scale(new Vec2(1, 1.5)).build();
        scene.add(s);
        scene.save("file.html");
    }
}