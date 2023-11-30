import java.util.*;

public class remove_duplicates_ex15 {
    static void removeDuplicate(char str[], int length){
        int index = 0;

        for(int i = 0; i<length; i++){
            int j;
            for(j = 0; j<i; j++){
                if(str[i] == str[j]){
                    break;
                }
            }
            if(j == i){
                str[index++] = str[i];
            }
        }
        System.out.println( String.valueOf(Arrays.copyOf(str, index)));
    }
    public static void main(String args[]){
        Scanner s =  new Scanner(System.in);
        System.out.println(("Enter a string:"));
        char s1[] = s.nextLine().toCharArray();
        int n = s1.length;
        removeDuplicate(s1, n);
        s.close();
    }
}
