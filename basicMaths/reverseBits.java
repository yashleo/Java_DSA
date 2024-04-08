package basicMaths;

import java.util.Scanner;
public class reverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println("Reverse bit number = " + SolutionReverseBits.reverseBits(n));
        sc.close();
    }
}

class SolutionReverseBits {
	static long reverseBits(long n) {
		// Write your code here
        long ans = 0;
        for (long i = 0; i < 32 && n!=0; i++) {
                ans |= ((n&1L) << (31-i));
                n >>>= 1;
        }
        return ans;
	}
}
