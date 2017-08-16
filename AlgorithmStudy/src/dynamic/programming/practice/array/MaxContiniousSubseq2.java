/**
 * 
 */
package dynamic.programming.practice.array;

/**
 * @author Administrator
 *
 */
public class MaxContiniousSubseq2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int []array= {1,-1,2,3,-2,3};
		System.out.println(findGreatestSumOfSubArray(array));
	}
	
	public static int findGreatestSumOfSubArray(int[] array) {
		int max=array[0];
		int sum=array[0];
		int temp;
		for(int i=1;i<array.length;i++) {
//			max=max(max,sum+array[i],array[i]);
			if(sum+array[i]<=array[i]) {
				temp=array[i];
			}else {
				temp=sum+array[i];
			}
			if(max<=temp) {
				max=temp;
			}
			sum+=array[i];
		}
		return max;
    }
	public static int max(int a,int b,int c) {
		return (a>=b?a:b)>=c?(a>=b?a:b):c;
	}
}