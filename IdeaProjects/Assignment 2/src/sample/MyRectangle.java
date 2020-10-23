package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyRectangle extends MyShape {


    public double h, w;
    MyPoint P;
    MyRectangle( MyPoint P, double w, double h, Color color) {
        this.P=P;
        this.w=w;
        this.h=h;
        this.color=color;
    }

    // get width of rectangle
    public double getWidth()
    {
        return w;
    }

    //get height of rectangle
    public double getHeight()
    {
        return h;
    }

    //get the perimeter of the rectangle
    public double getPerimeter()
    {
        return (2*h)+(2*w);
    }

    public MyPoint getPoint()
    {
        return P;
    }

    //get the area of the rectangle
    public double getArea()
    {
        return h*w;
    }

    @Override
    public String toString()
    {
        return " The height is = " +h +"\n The width is= " + w+ "\n The perimeter is= " + getPerimeter() + "\n The area is= " + getArea() + "\n The top corner point is= " + "(" + P.getX() + "," + P.getY()+ ")";
    }
    @Override
    public void draw(GraphicsContext Graphics) {
        Graphics.setFill(color);
        Graphics.fillRect(P.getX(),P.getY(),w,h);
    }
    @Override
    public MyRectangle getMyBoundingRectangle() {
        return new MyRectangle(P,w,h,color);
    }
    @Override
    public double getMyArea()
    {
        return getArea();
    }
}
