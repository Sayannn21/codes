public class replace_char_ex13 {
    public static void main(String args[]){
        String str = "Growing seed";
        int index = 8;
        char ch = 'w';
        System.out.println("Original String:"+ " " + str);

        str = str.substring(0, index)+ch+str.substring(index+1);

        System.out.println("Replaced string:" + " " + str);
    }
}
