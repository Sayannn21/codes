import java.util.*;

public class Array_sorting_ex11 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = s.nextInt();
        int numbers[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++){
            numbers[i] = s.nextInt();
        }
        System.out.println("Original array:");
        printArray(numbers);
        bubblesort(numbers);
        System.out.println("Sorted array:");
        printArray(numbers);
        s.close();
    }
    public static void bubblesort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int arr[]){
        for(int num:arr){
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
