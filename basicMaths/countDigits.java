package basicMaths;

import java.util.Scanner;
public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Solution.countDigits(n));
        sc.close();
    }
}

class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int c=0, y=n;
        while (n>0) {
            int x=n%10;
            if(x!=0&&(y%x)==0) c++;
            n/=10;
        }
        return c;
    }
}