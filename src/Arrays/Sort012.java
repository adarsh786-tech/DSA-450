package Arrays;
import java.util.*;
public class Sort012 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++)
            num[i] = sc.nextInt();
        int zero = 0, one = 0, two = 0;
        for(int x: num){
            if(x == 0)
                zero++;
            else if(x == 1)
                one++;
            else
                two++;
        }
        while (zero != 0) {
            System.out.print("0 ");
            zero -= 1;
        }
        while (one != 0) {
            System.out.print("1 ");
            one -= 1;
        }
        while (two != 0) {
            System.out.print("2 ");
            two -= 1;
        }
    }
}
