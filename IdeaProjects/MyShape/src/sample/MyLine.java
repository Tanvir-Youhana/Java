package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyLine extends MyShape {

    private double x1,y1, x2, y2;
    private Color color;

    //Constructor
    MyLine(double x1, double x2, double y1, double y2,Color color) {
        super(0, 0, color);
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.color= color;
    }

    // Gives the length of the line
    public double getLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Gives the angle of the line
    public double get_xAngle() {
            return Math.toDegrees(Math.atan((y2 - y1) / (x2 - x1)));
    }


    @Override
    public String toString() {
        return "The lines endpoints are " + "(" + x1 + "," + y1 + ")" + " and " + "(" + x2 + "," + y2 + ")" + " \nThe length of line:" + getLength() + "\nThe angle with the x-axis: " + get_xAngle();
    }

    //used to draw the lines with a width of 5 between two points
    @Override
    public void draw(GraphicsContext Graphics) {
        Graphics.setStroke(color);
        Graphics.setLineWidth(5);
        Graphics.strokeLine(x1,y1,x2,y2);

    }
}
