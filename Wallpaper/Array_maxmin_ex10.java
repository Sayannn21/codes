import java.util.*;

public class Array_maxmin_ex10 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the nnumber of elements:");
        int n = s.nextInt();
        int number[]= new int[50];
        System.out.println("Enter te elements:");
        for(int i=0; i<n; i++){
            number[i] = s.nextInt();
        }
        s.close();
        int max = number[0];
        int min = number[0];
        for(int i=1; i<n; i++){
            if(number[i]>max){
                max = number[i];
            }if(number[i]<min){
                min = number[i];
            }
        }
        System.out.println("Maimum vlue:"+max);
        System.out.println("Minimum value"+min);
    }
}
