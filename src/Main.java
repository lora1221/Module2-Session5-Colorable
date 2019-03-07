import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle();
        shapes[1] = new Square();
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Colorable) {
                Colorable a = (Colorable) shape;
                a.howToColor();
            }
        }
    }






}
