package Strings;
import java.util.*;
public class Reverse {
    static Scanner sc = new Scanner(System.in);
    public static void reverse(char[] str, int n){
        int left = 0;
        int right = n - 1;
        while(left < right){
            char x = str[left];
            str[left] = str[right];
            str[right] = x;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        char[] str = new char[n];
        str = sc.next().toCharArray();
        reverse(str, n);
        for(char x: str)
            System.out.print(x + " ");
    }
}
