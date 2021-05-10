package Arrays;
import java.util.*;
public class UnionIntersection {
    static Scanner sc = new Scanner(System.in);
    public static int union(ArrayList<Integer> num1, ArrayList<Integer>num2, int n, int k){
        Set<Integer> s = new HashSet<>();
        for(int x: num1)
            s.add(x);
        for(int x : num2)
            s.add(x);
        return s.size();
    }
    public static int intersection(ArrayList<Integer> num1, ArrayList<Integer>num2, int n, int k){
        int ans = 0;
        Set<Integer> s = new HashSet<>();
        for(int x: num1)
            s.add(x);
        for(int x: num2){
            if(s.contains(x))
                ans += 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        for(int i=0; i < n; i++)
            num1.add(sc.nextInt());
        for(int i = 0; i < k; i++)
            num2.add(sc.nextInt());
        Collections.sort(num1);
        Collections.sort(num2);
        System.out.println(""+(union(num1, num2, n, k)));
        System.out.println(""+intersection(num1, num2, n, k));
    }
}
