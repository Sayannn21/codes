
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class valid_mbnum_ex20 {
    public static boolean isValidMobNum(String num){
        String pattern = "(0/91)?[7-9][0-9]{9}";
        Pattern regax = Pattern.compile(pattern);
        Matcher matcher = regax.matcher(num);
        return matcher.matches();

    }
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a mobile number:");
        String mob = s.nextLine();
        if(isValidMobNum(mob)){
            System.out.println("Valid");
        }else{
            System.out.println("Not valid");
        }
        s.close();
    }
}
