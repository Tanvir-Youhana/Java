package sample;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

    public class MyShape {
        public double X; // X coordinate
        public double Y; //Y coordinate
        public Color color; // color of shape


        //constructor that take x-cord, y-cord and color
        MyShape(double X,double Y, Color color)
        {
            this.X=X;
            this.Y=Y;
            this.color=color;
        }

        //get the x-cord
        public double getX() {
            return X;
        }
        //get the y-cord
        public double getY() {
            return Y;
        }
        //get the color
        public Color getColor() {
            return color;
        }


        public void setX(double input) {
            this.X = input;
        }

        public void setY(double input) {
            this.Y = input;
        }

        public void setColor(Color input) {
            this.color = input;
        }

        public String  toString()
        {
            return "This is the canvas with"+ X + ","+ Y;
        }

        //Draws the rectangle where all the shapes are
        public void draw(GraphicsContext Graphics)
        {   Graphics.setFill(color);
            Graphics.fillRect(0, 0, X,Y);
        }

}
