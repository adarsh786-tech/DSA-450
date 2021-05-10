package Arrays;
import java.util.*;
public class MaxAndMinElement {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of elements in array:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the "+n+" elements in array:");
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            arr[i] = x;
        }
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            maximum = Math.max(maximum, arr[i]);
            minimum = Math.min(minimum, arr[i]);
        }
        System.out.println("Maximum Value : "+maximum);
        System.out.println("Minimum Value : "+minimum);
    }
}
