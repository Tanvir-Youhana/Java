package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyOval extends MyShape {

   MyPoint P;
   double x_center,y_center;
   private int w,h;
   MyRectangle R= new MyRectangle(new MyPoint(w/2,h/2),w,h,color);

   MyOval(MyPoint P,double w, double h, Color color) {
        this.P=P;
        R.w=w;
        R.h=h;
        this.color=color;

    }
    //get perimeter of oval using rectangle height and width
    public double getPerimeter()
    {
    return 2*Math.PI*(Math.sqrt((Math.pow(R.w/2,2)+Math.pow(R.h/2,2))/2));
    }

    //get area of oval using rectangles height and width
    public double getArea()
    {
    return Math.PI*(R.w/2)*(R.h/2);
    }
    public String getCenter()
    {
     return "\n The center is="+ "("+(P.getX()+R.w/2)+","+(P.getY()+ R.h/2) + ")";
    }

    public void setAxes(double w, double h)
    {
    this.h=(int)h;
    this.w=(int)w;
    }
    public void setCenter()
    {
     x_center= (P.getX()+R.w/2);
     y_center= (P.getY()+ R.h/2);
    }

    @Override
    public String toString()
    {
     return " The ovals area is= " + getArea() + "\n The perimeter is= "+ getPerimeter()+ getCenter();
    }

    @Override
    public void draw(GraphicsContext Graphics) {
     Graphics.setFill(color);
     Graphics.fillOval(P.getX(),P.getY(),R.w,R.h);
    }
    @Override
    public double getMyArea() {
        return getArea();
    }
    @Override
    public MyRectangle getMyBoundingRectangle() {
        return new MyRectangle(P,R.getWidth(),R.getHeight(),color);
    }

}
