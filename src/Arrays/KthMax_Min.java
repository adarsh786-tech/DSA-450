package Arrays;
import java.util.*;
public class KthMax_Min {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n, k;
        n = sc.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        for(int i = 0; i < n; i++){
            num.add(sc.nextInt());
        }
        k = sc.nextInt();
        Collections.sort(num);
        int kthSmallest = num.get(k-1);
        System.out.println(""+k+"th Smallest element in list: "+kthSmallest);
        Collections.sort(num, Collections.reverseOrder());
        int kthLargest = num.get(k-1);
        System.out.println(""+k+"th Largest element in list: "+kthLargest);


    }
}
