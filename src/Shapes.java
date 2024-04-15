import java.awt.*;
import java.awt.geom.Area;
import java.util.Scanner;

public class Shapes {

    double radius ;
    double length ;
    double wid ;
    double len;

   // public Shapes(double radius) {
     //   this.radius = radius;
    //}


    public static double CircleArea (double radius){
        double area;
        area = 3.14 * radius * radius;
        System.out.println("The area of circle is : " + area);
        return area;
    }
    public static double SquareArea(double length){
        double Area;
        Area = length * length;
        System.out.println("The area of square is : " + Area);
        return Area;
    }
    public static double RectArea(double len , double wid) {
        double Area;
        Area = len * wid;
        System.out.println("The area of rectangle is : " + Area);
        return Area;
    }
    public static void main(String[] args) {

        CircleArea(10.0);
        SquareArea(15.5);
        RectArea(12.0 , 22.0);

    }
}
