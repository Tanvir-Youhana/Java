package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyLine extends MyShape {

    MyPoint P1, P2;
    private Color color;

    //Constructor
    MyLine(MyPoint P1, MyPoint P2,Color color) {
        this.P1=P1;
        this.P2=P2;
        this.color= color;
    }


    // Gives the length of the line
    public double getLength() {
        return Math.sqrt(Math.pow(P2.getX() - P1.getX(), 2) + Math.pow(P2.getY() - P1.getY(), 2));
    }

    // Gives the angle of the line
    public double get_xAngle() {
        return Math.toDegrees(Math.atan((P2.getY() - P1.getY()) / (P2.getX() - P1.getX())));
    }


    @Override
    public String toString() {
        return "The lines endpoints are " + "(" + P1.getX() + "," + P1.getY() + ")" + " and " + "(" + P2.getX() + "," + P2.getY() + ")" + " \nThe length of line:" + getLength() + "\nThe angle with the x-axis: " + get_xAngle();
    }

    //used to draw the lines with a width of 5 between two points
    @Override
    public void draw(GraphicsContext Graphics) {
        Graphics.setStroke(color);
        Graphics.setLineWidth(5);
        Graphics.strokeLine(P1.getX(),P1.getY(),P2.getX(),P2.getY());

    }

    @Override
    public MyRectangle getMyBoundingRectangle() {
        return new MyRectangle(P1,P2.getX()-P1.getX(),P2.getY()-P1.getY(),color);
    }

    @Override
    public double getMyArea() {
        return 0;
    }

}
