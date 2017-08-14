/**
 * 
 */
package divide.and.conquer.practice.quicksort;

/**
 * @author Administrator
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int []array= {1,5,9,6,8,2,4,7,3};
		new QuickSort().quickSort(array);
	}
	
	public void quickSort(int []array) {
		quickSort(array, 0, array.length-1);
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println("");
	}

	public void quickSort(int []array,int left,int right) {
		if(left>=right)
			return;
		int i=left;
		int j=right+1;
		do {
			do {
				i++;
			}while(i<right&&array[i]<=array[left]);
			do {
				j--;
			}while(j>left&&array[j]>array[left]);
			if(i<j) {
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}while(i<j);
		int temp=array[left];
		array[left]=array[j];
		array[j]=temp;
		
		quickSort(array, 0, j-1);
		quickSort(array, j+1, right);
		
	}
}
