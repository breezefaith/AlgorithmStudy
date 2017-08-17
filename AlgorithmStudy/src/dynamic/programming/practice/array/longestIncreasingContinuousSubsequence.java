package dynamic.programming.practice.array;

public class longestIncreasingContinuousSubsequence {

	public static void main(String[] args) {
		System.out.println(longestIncreasingContinuousSubsequence(new int[] {5,4,3,2,1}));
	}
	public static int longestIncreasingContinuousSubsequence(int[] array) {
		return Integer.max(increasing(array), unicreasing(array));
    }
	//最长连续递增
	public static int increasing(int []array) {
		int result=1;
		int currentResult=1;
		int resultEndPosition=0;
		for(int i=1;i<array.length;i++) {
			if(array[i]>array[i-1]&&resultEndPosition==i-1) {
				currentResult++;
				resultEndPosition=i;
			}else {
				currentResult=1;
				resultEndPosition=i;
			}
			result=Integer.max(result, currentResult);
		}
		return result;
	}
	//最长连续递减
	public static int unicreasing(int []array) {
		int result=1;
		int currentResult=1;
		int resultEndPosition=0;
		for(int i=1;i<array.length;i++) {
			if(array[i]<array[i-1]&&resultEndPosition==i-1) {
				currentResult++;
				resultEndPosition=i;
			}else {
				currentResult=1;
				resultEndPosition=i;
			}
			result=Integer.max(result, currentResult);
		}
		return result;
	}
}
