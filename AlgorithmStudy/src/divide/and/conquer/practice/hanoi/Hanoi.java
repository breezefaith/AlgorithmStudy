/**
 * 
 */
package divide.and.conquer.practice.hanoi;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Hanoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		solve(n);
//		System.out.println(solve(n));
	}

	private static void solve(int n) {
		
	}
	private static void hanoi(int n,int a,int b,int c) {
		if(n>0) {
			hanoi(n-1, a, c, b);
			move(a, b);
			hanoi(n-1, c, b, a);
		}
	}
	private static void move(int a,int b) {
		
	}

}
