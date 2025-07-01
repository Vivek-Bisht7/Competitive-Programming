// Problem: C. XOR and Triangle
// Contest: Codeforces - Codeforces Round 1009 (Div. 3)
// URL: https://codeforces.com/problemset/problem/2074/C
// Memory Limit: 256 MB
// Time Limit: 2000 ms


import java.util.*;

public class Main{
    public static void solve(Scanner sc){
		 int x = sc.nextInt();
            int ans = -1;

            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 30; j++) {
                    int y = (1 << i) | (1 << j);
                    int z = x ^ y;

                    if (y < x && x + y > z && y + z > x) {
                        ans = y;
                    }
                }
            }
            System.out.println(ans);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            solve(sc);
        }

        sc.close();
    }
}