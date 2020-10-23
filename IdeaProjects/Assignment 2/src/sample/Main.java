package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Creating the canvas
        Group root= new Group();
        Scene shape= new Scene(root);
        primaryStage.setTitle("MyShapes");
        int w=800, h=500;
        Canvas canvas =new Canvas(w,h);
        GraphicsContext Graphics = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        primaryStage.setScene(shape);

        //Get the points of each corner of the canvas and starting point of each shape
        MyPoint topLeft = new MyPoint(0,0);
        MyPoint bottomRight= new MyPoint(w,h);
        MyPoint topRight= new MyPoint(w,0);
        MyPoint bottomLeft = new MyPoint(0,h);
        MyPoint p= new MyPoint(w/4,h/4);
        MyPoint p2= new MyPoint(w/3.1,h/3.1);
        MyPoint p3= new MyPoint(w/2.68,h/2.68);


        //Rectangles
        MyRectangle rect1= new MyRectangle(p, w/2,h/2, MyColor.getRandomColor());
        MyRectangle rect2= new MyRectangle(p2,w/2.83,h/2.83,MyColor.getRandomColor());
        MyRectangle rect3= new MyRectangle(p3,w/4,h/4,MyColor.getRandomColor());
        //Ovals
        MyOval oval1= new MyOval(p,w/2,h/2, MyColor.getRandomColor());
        MyOval oval2= new MyOval(p2,w/2.83,h/2.83,MyColor.getRandomColor());
        MyOval oval3= new MyOval(p3,w/4,h/4,MyColor.getRandomColor());

        //Draw the lines
        MyLine diagonal = new MyLine(topLeft, bottomRight,MyColor.BLACK());
        MyLine topLine= new MyLine(topLeft, topRight, MyColor.BLACK());
        MyLine bottomLine= new MyLine(bottomLeft, bottomRight, MyColor.BLACK());
        MyLine rightLine= new MyLine(topLeft, bottomLeft, MyColor.BLACK());
        MyLine leftLine = new MyLine( topRight, bottomRight, MyColor.BLACK());
        System.out.println("Rectangle 1 specifications: ");
        System.out.println(rect1.toString());
        System.out.println("Rectangle 2 specifications: ");
        System.out.println(rect2.toString());
        System.out.println("Rectangle 3 specifications: ");
        System.out.println(rect3.toString());
        System.out.println("Oval 1 specifications: ");
        System.out.println(oval1.toString());
        System.out.println("Oval 2 specifications: ");
        System.out.println(oval2.toString());
        System.out.println("Oval 3 specifications: ");
        System.out.println(oval3.toString());
        System.out.println(diagonal.toString());
        System.out.println(topLine.toString());
        System.out.println(bottomLine.toString());
        System.out.println(rightLine.toString());
        System.out.println(leftLine.toString());

        MyPolygon hex1= new MyPolygon(p3,6,5,MyColor.getRandomColor());

        //Draw the shapes and lines
        rect1.draw(Graphics);
        oval1.draw(Graphics);
        rect2.draw(Graphics);
        oval2.draw(Graphics);
        rect3.draw(Graphics);
        oval3.draw(Graphics);
        diagonal.draw(Graphics);
        topLine.draw(Graphics);
        bottomLine.draw(Graphics);
        rightLine.draw(Graphics);
        leftLine.draw(Graphics);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
