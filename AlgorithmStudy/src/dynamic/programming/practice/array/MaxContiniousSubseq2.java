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
		int []array= {1,-2,-4,1,5};
		System.out.println(findGreatestSumOfSubArray(array));
	}
	
	public static int findGreatestSumOfSubArray(int[] array) {
		int max=array[0];
		int sum=array[0];
		int temp=0;
		System.out.printf("i=%d,array[%d]=%d,max=%d,sum=%d,temp=%d\n\n",0,0,array[0],max,sum,temp);
		for(int i=1;i<array.length;i++) {
//			max=max(max,sum+array[i],array[i]);
			if(sum+array[i]<=array[i]) {
				System.out.println("sum<=array[i]:true");
				sum=temp=array[i];
			}else {
				System.out.println("sum<=array[i]:false");
				sum=temp=sum+array[i];
			}
			System.out.printf("i=%d,array[%d]=%d,max=%d,sum=%d,temp=%d\n",i,i,array[i],max,sum,temp);
			if(max<temp) {
				System.out.println("max<temp:true");
				max=temp;
			}else {
				System.out.println("max<temp:false");
			}
			System.out.printf("i=%d,array[%d]=%d,max=%d,sum=%d,temp=%d\n\n",i,i,array[i],max,sum,temp);
		}
		return max;
    }
	public static int max(int a,int b,int c) {
		return (a>b?a:b)>c?(a>b?a:b):c;
	}
}