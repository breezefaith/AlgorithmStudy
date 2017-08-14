/**
 * 
 */
package divide.and.conquer.practice;

import java.util.Arrays;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Object[]> list=Arrays.asList(new Object[][] {  
			{ 1, true },  
			{ 3, true },//  
			{ 6, false },  
			{ 11, true },  
			{ 22, false },  
			{ 23, true }  
		});
		System.out.println(list);
	}

}
