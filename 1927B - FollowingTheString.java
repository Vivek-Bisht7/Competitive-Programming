// Problem: B. Following the String
// Contest: Codeforces - Codeforces Round 923 (Div. 3)
// URL: https://codeforces.com/problemset/problem/1927/B
// Memory Limit: 256 MB
// Time Limit: 2000 ms

import java.util.*;

public class Main{
    public static void solve(Scanner sc){
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		
		int[] count = new int[26];
		
		StringBuilder ans = new StringBuilder();
		
		for(int i=0; i<n; i++){
			for(int j=0; j<26; j++){
				 if (count[j] == a[i]) {
                    count[j]++;
                    ans.append((char) ('a' + j));
                    break;
                }
			}
		}
		
		System.out.println(ans.toString());
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