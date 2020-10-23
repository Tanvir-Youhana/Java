package sample;

public class MyPoint {

    //We need to create variables for the x and y coordinated of the point
    double x, y;

    MyPoint(double x, double y) {
        Initialize(x, y);
    }

    MyPoint(MyPoint P) {
        Initialize(P);
    }

    public void Initialize(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void Initialize(MyPoint P) {
        this.x = P.getX();
        this.y = P.getY();
    }

    //get method
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
