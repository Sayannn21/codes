import java.util.*;
public class palindrome_check_ex18 {
    public static void main(String args[]){
        String str, reverse = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = s.nextLine();
        int length = str.length();
        for(int i= length - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        if(reverse.equals(str)){
            System.out.println("Its palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        s.close();
    }
}
