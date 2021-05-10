package Arrays;
import java.util.*;
public class Reverse {
    static Scanner sc = new Scanner(System.in);

    public static void rev(int[] arr, int n){
        int left = 0;
        int right = n - 1;
        while(left < right){
            int t = arr[left];
            arr[left] = arr[right];
            arr[right] = t;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int[] num_array = new int[n];
        System.out.println("Enter the "+n+" elements in the array: ");
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            num_array[i] = x;
        }
        System.out.println("Array elements before reversing: ");
        for(int i = 0; i < n; i++){
            System.out.print(num_array[i]+" ");
        }

        rev(num_array, n);
        System.out.println("\nArray elements after reversing: ");
        for(int i = 0; i < n; i++){
            System.out.print(num_array[i]+" ");
        }
    }
}
