package sample;

import javafx.scene.paint.Color;

public interface MyShapeInterface {

    public MyRectangle getMyBoundingRectangle();
    public double getMyArea();
    public static boolean doOverlapMyRectangle(MyRectangle Rectangle1, MyRectangle Rectangle2)
    {
        double point_x1=Rectangle1.getPoint().getX();
        double point_point_y2=Rectangle1.getPoint().getY();
        double width_Rectangle1=Rectangle1.getWidth();
        double height_Rectangle1=Rectangle1.getHeight();

        double point_x2=Rectangle2.getPoint().getX();
        double point_y2=Rectangle2.getPoint().getY();
        double width_Rectangle2=Rectangle2.getWidth();
        double height_Rectangle2=Rectangle2.getHeight();

        if(point_point_y2+height_Rectangle1<point_y2 || point_point_y2>point_y2+height_Rectangle2)
            return false;
        if(point_x1+width_Rectangle1<point_x2 || point_x1>point_x2+width_Rectangle2)
            return false;

        return true;

    }
    public static MyRectangle overlapMyRectangles(MyRectangle Rectangle1, MyRectangle Rectangle2)
    {
        double point_x1=Rectangle1.getPoint().getX();
        double point_point_y2=Rectangle1.getPoint().getY();
        double width_Rectangle1=Rectangle1.getWidth();
        double height_Rectangle1=Rectangle1.getHeight();

        double point_x2=Rectangle2.getPoint().getX();
        double point_y2=Rectangle2.getPoint().getY();
        double width_Rectangle2=Rectangle2.getWidth();
        double height_Rectangle2=Rectangle2.getHeight();

        if(point_point_y2+height_Rectangle1<point_y2 || point_point_y2>point_y2+height_Rectangle2)
            return null;
        if(point_x1+width_Rectangle1<point_x2 || point_x1>point_x2+width_Rectangle2)
            return null;
        double xmax= Math.max(point_x1,point_x2);
        double ymax=Math.max(point_point_y2,point_y2);
        double xmin=Math.min(point_x1+width_Rectangle1, point_x2+width_Rectangle2);
        double ymin=Math.min(point_point_y2+height_Rectangle1,point_y2+height_Rectangle2);

        MyPoint p= new MyPoint((int)xmax,((int)ymax));
        return new MyRectangle(p,Math.abs(xmin-xmax), Math.abs(ymin-ymax),MyColor.BLACK());
    }
    public static MyRectangle overlapMyShapes(MyShape Shape1, MyShape Shape2)
    {
        if(Shape1 instanceof MyLine || Shape2 instanceof MyLine)
            return null;

        MyRectangle Rectangle1=Shape1.getMyBoundingRectangle();
        MyRectangle Rectangle2= Shape2.getMyBoundingRectangle();
        return overlapMyRectangles(Rectangle1,Rectangle2);
    }

}
