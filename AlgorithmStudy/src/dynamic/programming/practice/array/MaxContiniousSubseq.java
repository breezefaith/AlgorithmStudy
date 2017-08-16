/**
 * 
 */
package dynamic.programming.practice.array;

/**
 * @author Administrator
 *
 */
public class MaxContiniousSubseq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int []array= {1,-1,2,3,-2,3};
		System.out.println(findGreatestSumOfSubArray(array));
	}
	
	public static int findGreatestSumOfSubArray(int[] array) {
		CurrentMax currentMax=new CurrentMax();
		currentMax.start=0;
		currentMax.end=0;
		currentMax.value=array[0];
		currentMax.sum=array[0];
		
		for(int i=1;i<array.length;i++) {
			int lastStart=currentMax.start;
			int lastEnd=currentMax.end;
			int lastMax=currentMax.value;
			int lastSum=currentMax.sum;
			//比较sum[i-1]+array[i]与array[i]
			if(lastSum+array[i]<=array[i]) {
				currentMax.start=i;
				currentMax.end=i;
				currentMax.value=array[i];
			}else {
				currentMax.end=i;
				currentMax.value=lastSum+array[i];
			}
			
			//上面比较后大者与sum[i-1]比较
			if(lastMax>currentMax.value) {
				currentMax.start=lastStart;
				currentMax.end=lastEnd;
				currentMax.value=lastMax;
			}
			
			currentMax.sum+=array[i];
			
		}
        return currentMax.value;
    }
	
}
class CurrentMax{
	int start;
	int end;
	int value;
	int sum;
	
	@Override
	public String toString() {
		return "CurrentMax [start=" + start + ", end=" + end + ", value=" + value + ", sum=" + sum + "]";
	}
	
}