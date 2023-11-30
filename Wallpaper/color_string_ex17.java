import java.util.*;
public class color_string_ex17 {
    public static String pickColor(String x){
        if(x.startsWith("red")){
            return "red";
        }
        if(x.startsWith("black")){
            return "black";
        }
        return " ";
    }
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = s.nextLine();
        String choice = pickColor(input);
        System.out.println("The given string: " + input );
        System.out.println("The string begins with the color: " + choice);
        s.close();
    }
}
