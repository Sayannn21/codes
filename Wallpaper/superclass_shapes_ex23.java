import java.util.*;
class Figure{
    protected double width;
    protected double height;
    public Figure(double w, double h){
        this.width = w;
        this.height = h;
    }
    public double area(){
        return 0.0;
    }
}

class Rectangle extends Figure{
    public Rectangle(double width,double height){
        super(width,height);
    }
    @Override
    public double area(){
        return width*height;
    }
}

class Triangle extends Figure{
    public Triangle(double width,double height){
        super(width,height);
    }
    @Override
    public double area(){
        return 0.5*width*height;
    }
}

public class superclass_shapes_ex23 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the length of the rectagle: ");
        double rectWidth = s.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double rectBreadth = s.nextDouble();

        System.out.println("Enter the base of the triangle: ");
        double triBase = s.nextDouble();
        System.out.println("Enter the height of the tringle: ");
        double triHeight = s.nextDouble();

        Rectangle r = new Rectangle(rectWidth, rectBreadth);
        Triangle t = new Triangle(triBase, triHeight);

        System.out.println("Area o the Rectangle: " + r.area());
        System.out.println("Area of the Triangle: " + t.area()); 

        s.close();
    }

}
