import java.awt.*;
import java.util.Locale;

public class TransformationDecorator extends ShapeDecorator {

    String transform;

    public TransformationDecorator(Shape shape, String transform) {
        super(shape);
        this.transform = transform;
    }

    @Override
    public String toSvg(String parameters) {
        return super.toSvg(String.format(Locale.ENGLISH, "transform=\"%s\" %s", this.transform, parameters));
    }

    public static class Builder {
        String transform;
        private Shape shape;

        public Builder(Shape shape) {
            this.transform = "";
            this.shape = shape;
        }

        public Builder translate(Vec2 translation) {
            this.transform += String.format(Locale.ENGLISH," translate(%f %f)", translation.x, translation.y);
            return this;
        }

        public Builder rotate(double rotateAngle, Vec2 rotateCenter ) {
            this.transform += String.format(Locale.ENGLISH," rotate(%f %f %f)", rotateAngle, rotateCenter.x, rotateCenter.y);
            return this;
        }

        public Builder scale(Vec2 scaleVector) {
            this.transform += String.format(Locale.ENGLISH," scale(%f %f)", scaleVector.x, scaleVector.y);
            return this;
        }

        public TransformationDecorator build() {
            return new TransformationDecorator(shape, this.transform);
        }
    }

}
