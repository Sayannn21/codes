import java.util.*;
class method_overloading{
    public double area(double rad){
        return (Math.PI*rad*rad);
    }
    public double area(double height, double base){
        return (0.5*height*base);
    }
}

public class area_overloading_ex21 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        method_overloading calc = new method_overloading();
        System.out.println("Select a choice to calcuate area: ");
        System.out.println("1 for circle.");
        System.out.println("2 for triangle.");
        int choice = s.nextInt();

        if(choice == 1){
            System.out.println("Enter the radius:");
            double rad = s.nextDouble();
            System.out.println("The area of the circle is: " + calc.area(rad));
        }else if(choice == 2){
            System.out.println("Enter the height of the triangle:");
            double height = s.nextDouble();
            System.out.println("Enter the base of te triangle: ");
            double base = s.nextDouble();
            System.out.println("The area of the trianle: " + calc.area(height,base));
        }else{
            System.out.println("The choice is invalid.");
        }
        s.close();
    }
}
