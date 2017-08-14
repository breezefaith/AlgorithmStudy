/**
 * 
 */
package dynamic.programming.practice.array;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class LongestIncreamentSubSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * input
		 */
//		Scanner in=new Scanner(System.in);
//		int n=in.nextInt();
//		int []array=new int[n];
//		for(int i=0;i<n;i++) {
//			array[i]=in.nextInt();
//		}
		int []array={2,1,5,3,6,4,8,9,7};
		
		/*
		 * 最大连续递增子序列长度
		 */
		
		/*
		 * initial
		 */
//		int []dp=new int[array.length];
//		for(int i=0;i<dp.length;i++)
//			dp[i]=Integer.MIN_VALUE;
//		int max=dp[0];
		
		/*
		 * solve
		 */
//		for(int i=0;i<array.length;i++) {
//			if(i==0) {
//				dp[i]=1;
//			}else if(array[i]<=array[i-1]){
//				dp[i]=1;
//			}else if(array[i]>array[i-1]) {
//				dp[i]=dp[i-1]+1;
//			}
//			max=Integer.max(max, dp[i]);
//		}
		
		/*
		 * 最大非连续递增子序列长度
		 */
		//dp[i]表示以i结尾时最大递增序列长度
		int []dp=new int[array.length];
		for(int i=0;i<dp.length;i++)
			dp[i]=Integer.MIN_VALUE;
		
		for(int i=0;i<array.length;i++) {
			if(i==0) {
				dp[i]=1;
				System.out.println(dp[i]);
				continue;
			}
			int max=0;
			for(int j=0;j<i;j++) {
				if(dp[j]>max&&array[i]>array[j]) {
					max=dp[j];
				}
			}
			dp[i]=max+1;
			System.out.println(dp[i]);
		}
		
		/*
		 * result
		 */
//		System.out.println(dp[dp.length-1]);
		
	}

}
