package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.Group;


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

        //Positioning of all the lines on the canvas
        MyLine left = new MyLine(2 , 2 , 0, h,MyColor.BLACK());
        MyLine right= new MyLine(w-2,w-2 ,0,h,MyColor.BLACK());
        MyLine top= new MyLine(2,w,2,2,MyColor.BLACK());
        MyLine bottom = new MyLine(2,w,h-2,h-2,MyColor.BLACK());
        MyLine diag1 = new MyLine(0, w,0,h,MyColor.BLACK());
        MyLine diag2 = new MyLine(w,0,0,h,MyColor.BLACK());


        MyShape S= new MyShape(800,500,MyColor.WHITE());

        double Radius1= Math.sqrt(Math.pow(200,2)-Math.pow(200/2,2));
        double Radius2= Math.sqrt(Math.pow(Radius1,2)-Math.pow(Radius1/2,2));
        //Inner hex;
        MyPolygon hexagon1= new MyPolygon(w/2,h/2,6, 149, MyColor.getRandomColor());
        //outer circle
        MyCircle circle1= new MyCircle(w/2,h/2,Radius1,MyColor.getRandomColor());
        //Middle hex;
        MyPolygon hexagon2= new MyPolygon(w/2,h/2,6,Radius1,MyColor.getRandomColor());
        //inner circle
        MyCircle circle2= new MyCircle(w/2,h/2,Radius2, MyColor.getRandomColor());
        //outer  hex
        MyPolygon hexagon3= new MyPolygon(w/2,h/2,6,199, MyColor.getRandomColor());

        //Draws on the canvas
        S.draw(Graphics);
        hexagon3.draw(Graphics);
        circle1.draw(Graphics);
        hexagon2.draw(Graphics);
        circle2.draw(Graphics);
        hexagon1.draw(Graphics);
        left.draw(Graphics);
        right.draw(Graphics);
        diag1.draw(Graphics);
        diag2.draw(Graphics);
        top.draw(Graphics);
        bottom.draw(Graphics);

        //Prints out all the details of each shape and line
        System.out.println(left.toString());
        System.out.println(right.toString());
        System.out.println(top.toString());
        System.out.println(bottom.toString());
        System.out.println(diag1.toString());
        System.out.println(diag2.toString());
        System.out.println(hexagon1.toString());
        System.out.println(hexagon2.toString());
        System.out.println(hexagon3.toString());
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
