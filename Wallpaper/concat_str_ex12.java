class concat_str_ex12{
    public static void main(String args[]){
        String str1 = "Hello";
        String str2 = "World";
        String res = str1 + " " + str2;
        System.out.println("Concatented string is:"+" " + res);

        String res1 = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string again:"+" "+res1);
    }
}