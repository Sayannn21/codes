import java.util.*;
public class string_swap_ex16 {
    public static String swaptwochar(String x){
        if(x == null || x.length()<2){
            return x;
        }
        char arr[] = x.toCharArray();
        int lastIndex = arr.length - 1;
        char temp = arr[lastIndex];

        arr[lastIndex] = arr[lastIndex - 1];
        arr[lastIndex - 1] = temp;

        return new String(arr);
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String swapped = swaptwochar(s.nextLine());
        System.out.println(swapped);
        s.close();
    }
}
