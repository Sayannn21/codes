import java.util.*;

public class remove_word_ex19 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = s.nextLine();
        System.out.println("Enter the word to remove:");
        String word = s.nextLine();
        str = str.replaceAll(word, " ");
        System.out.println("New string:" + str);
        s.close();
    }
}
