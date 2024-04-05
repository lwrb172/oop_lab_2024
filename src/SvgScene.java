import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class SvgScene {
    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void save(String path) {
        StringBuilder text = new StringBuilder();
        text.append("<!DOCTYPE html>\n<html>\n<body>\n" +
                "<svg width=\"1024\" height=\"768\"" +
                " xmlns=\"http://www.w3.org/2000/svg\">\n");

        for(Shape sh : shapes) {
            text.append(sh.toSvg());
        }

        text.append("</svg>\n</body>\n</html>");

        try(FileWriter writer = new FileWriter(new File(path))) {
            writer.write(text.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
