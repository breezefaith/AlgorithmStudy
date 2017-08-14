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
		 * ������
		 * ����һ������m�������Ͻǿ�ʼÿ��ֻ�������߻��������ߣ����ﵽ���½ǵ�λ�ã�
		 * ·�������������ۼ���������·���ͣ���������·������С·���͡�
		 * ���������m���£���ô·��1,3,1,0,6,1,0������С·���ͣ�����12.
		 * ʾ����
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
		 * ��ʼ״̬,dp[i][j]��ʾԭ�㵽�㣨i,j������̾���
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
