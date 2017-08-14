/**
 * 
 */
package dynamic.programming.practice.maxsum;

/**
 * @author Administrator
 *
 */
public class MaxSubSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int []array= {-1,2,3,-4,2};

		int []dp=new int[array.length];
		
		int maxSum=-1;
		int temp=-1;
		for(int i=1;i<array.length;i++) {
			temp=Integer.max(array[i],temp+array[i]);
			maxSum=Integer.max(maxSum, temp);
			System.out.println("temp="+temp+",maxSum="+maxSum);
		}

	}

}
