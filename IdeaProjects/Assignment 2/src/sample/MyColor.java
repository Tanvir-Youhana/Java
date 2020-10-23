package sample;

import java.util.Random;
import javafx.scene.paint.Color;

// this enum represents a COLOR
public enum MyColor {
    BLACK(0,0,0), WHITE(255,255,255);

    int Red, Green, Blue;

    MyColor(int red, int green, int blue) {
        this.Red = red;
        this.Green = green;
        this.Blue = blue;
    }

    // If a custom color is set
    public Color getColor(){
        return Color.rgb(Red,Green,Blue);
    }

    //For black Color
    public static Color BLACK()
    {
        return Color.rgb(0,0,0);
    }
    //For WHITE background
    public static Color WHITE()
    {
        return Color.rgb(255,255,255);
    }
    // For some random Color for each shape
    public static Color getRandomColor(){
        Random ran = new Random();
        int r = ran.nextInt(256);
        int g = ran.nextInt(256);
        int b = ran.nextInt(256);
        return Color.rgb(r,g,b);
    }
    @Override
    public String toString(){
        return "R:" + Red + " G:" + Green + " B:" +Blue;
    }
}