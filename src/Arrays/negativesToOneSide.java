package Arrays;
import java.util.*;
public class negativesToOneSide {
    static Scanner sc = new Scanner(System.in);

    public static void convert(int[] num, int n){
        int left = 0, right = n - 1;
        while(left < right){
            if(num[left] < 0 && num[right] < 0)
                left++;
            else if(num[left] > 0 && num[right] < 0){
                int t = num[left];
                num[left] = num[right];
                num[right] = t;
                left++;
                right--;
            }
            else if(num[left] > 0 && num[right] > 0){
                right--;
            }
            else{
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++)
            num[i] = sc.nextInt();
        convert(num, n);
        for(int x: num)
            System.out.print(x+" ");
    }
}
