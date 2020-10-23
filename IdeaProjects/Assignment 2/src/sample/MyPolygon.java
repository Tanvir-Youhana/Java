package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class MyPolygon extends MyShape {
    private int N;
    private double L;
    MyPoint P;
    //Constructor
    MyPolygon(MyPoint P, int N, double L, Color color) {
        this.N = N;
        this.L = L;
    }

    //returns the side length
    public double getSide() {
        return L;
    }

    //return the area of polygon using the formula below
    public double getArea() {
        return Math.pow(getSide(), 2) * (N / 4) * (Math.tan(Math.PI/N));
    }
    //return the perimeter of the polygon using the side lengths and number of sides
    public double getPerimeter() {
        return N * getSide();
    }
    //return the angle of interior angle of the polygon
    public double getAngle() {
        return (N - 2) * 180 / N;
    }


    @Override
    public String toString() {
        return "Side length of polygon: " + getSide() + "\nPolygons interior equal angle: "
                + getAngle()+ "\nPolygons perimeter: " + getPerimeter()+ "\nPolygons area is: " + getArea();
    }

    //used to draw the polygon with a for loop that takes in x and y coordinates
    @Override
    public void draw(GraphicsContext Graphics){
        Graphics.setFill(getColor());
        double[] x_vert = new double[N];
        double[] y_vert = new double[N];
        for (int i = 0; i < N; i++) {
            x_vert[i] = (Math.sin((double)i/N*2*Math.PI)*L)+P.getX();
            y_vert[i] = (Math.cos((double)i/N*2*Math.PI)*L)+P.getY();
        }
        Graphics.strokePolygon(x_vert, y_vert, N);
        Graphics.fillPolygon(x_vert, y_vert, N);
    }
    @Override
    public MyRectangle getMyBoundingRectangle() {
        return null;
    }

    @Override
    public double getMyArea() {
        return getArea();
    }
}
