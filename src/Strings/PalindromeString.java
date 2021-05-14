/*
    @author: bravura_coder
*/

package Strings;

import java.util.*;
import java.io.*;

public class PalindromeString {
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static boolean solve(String s){
        char[] c1 = s.toCharArray();
        char[] c2 = s.toCharArray();
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i < j){
            char x = c1[i];
            c1[i] = c2[j];
            c2[j] = x;
            i++;
            j--;
        }
        for(int x = 0; x < n; x++){
            if(c1[x] != c2[x]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while(t != 0){
            String s = br.readLine();
            boolean ans = solve(s);
            if(ans)
                System.out.println(1);
            else
                System.out.println(0);
            t -= 1;
        }
    }
}
