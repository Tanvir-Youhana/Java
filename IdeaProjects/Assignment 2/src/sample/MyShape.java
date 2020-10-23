package sample;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class MyShape implements MyShapeInterface {
    MyPoint P;
    public Color color; // color of shape

    //get the point
    public MyPoint getP() {
        return P;
    }

    //get the color
    public Color getColor() {
        return color;
    }


    public void setP(MyPoint P) {
        this.P = P;
    }

    public void setColor(Color input) {
        this.color = input;
    }

    public String  toString()
    {
        return "This is the canvas with point P"+ P;
    }
    public abstract void draw(GraphicsContext Graphics);
}
