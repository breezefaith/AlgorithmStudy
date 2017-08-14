/**
 * 
 */
package dynamic.programming.practice.matrix;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class ShortetPath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		/**
		 * @decription
		 * 描述：
		 * 给定一个矩阵m，从左上角开始每次只能向右走或者向下走，最后达到右下角的位置，
		 * 路径中所有数字累加起来就是路径和，返回所有路径的最小路径和。
		 * 如果给定的m如下，那么路径1,3,1,0,6,1,0就是最小路径和，返回12.
		 * 示例：
		 * 1 3 5 9
		 * 8 1 3 4
		 * 5 0 6 1
		 * 8 8 4 0
		 */
		
		/**
		 * @input
		 */
		int m=in.nextInt();
		int n=in.nextInt();
//		int m=4,n=4;
		int [][]matrix=new int[m][n];
//		matrix=new int[][] {{1,3,5,9},{8,1,3,4},{5,0,6,1},{8,8,4,0}};
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=in.nextInt();
			}
		}
		
		
		/**
		 * @initial
		 * 初始状态,dp[i][j]表示原点到点（i,j）的最短距离
		 */
		int [][]dp=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				dp[i][j]=Integer.MIN_VALUE;
			}
		}
		
		/**
		 * @solve
		 */
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(dp[i][j]==Integer.MIN_VALUE) {
					if(i==0&&j==0) {
						dp[i][j]=matrix[i][j];
					}else if(i==0&&j!=0) {
						dp[i][j]=matrix[i][j]+dp[i][j-1];
					}else if(i!=0&&j==0) {
						dp[i][j]=matrix[i][j]+dp[i-1][j];
					}else {
						dp[i][j]=matrix[i][j]+Integer.min(dp[i-1][j], dp[i][j-1]);
					}
				}
			}
		}
		
		/**
		 * @result
		 */
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println(dp[i][j]);
			}
		}
	}

}
