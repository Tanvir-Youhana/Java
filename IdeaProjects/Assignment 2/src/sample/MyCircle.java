package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyCircle extends MyOval {

    private double r;

    MyCircle(MyPoint P, double w, double h, double r, Color color) {
        super(P, w, h, color);
        this.r = r;
        this.color=color;
    }

    //returns the radius
    public double getRadius() {
        return r;
    }

    //using the area formula of a circle to find area
    public double getArea() {
        return Math.PI * (Math.pow(r, 2));
    }

    //using the circumference formula we can find hte perimeter of the circle
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "The circles radius is: " + getRadius() + "\nThe circles area is: " + getArea() +
                "\nThe circles perimeter is: " + getPerimeter();
    }

    //used to draw the circle and fill in the circle with desired color
    @Override
    public void draw(GraphicsContext Graphics) {
        Graphics.setFill(color);
        Graphics.fillOval(P.getX() - r, P.getY() - r, r * 2, r * 2);
    }

}

