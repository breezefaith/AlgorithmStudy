/**
 * 
 */
package divide.and.conquer.practice.quicksort;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Administrator
 *
 */

@RunWith(Parameterized.class)
public class QuickSortTest {
	
	private int[] input;
	private int[] expect={1,2,3,4,5,6,7,8,9};
	
	
	public QuickSortTest(int[] input) {
		super();
		this.input = input;
	}
	
	@BeforeClass
	public static void setUpClass() throws Exception{
		System.out.println("@BeforeClass");
	}
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("@Before");
	}

	@Parameterized.Parameters
	public static Collection initData() throws Exception{
		System.out.println("@Parameters");
		BufferedReader reader=new BufferedReader(new FileReader("bin/divide/and/conquer/practice/quicksort/TestCase.txt"));
		String line=null;
		List list=new ArrayList();
		while((line=reader.readLine())!=null) {
			String []temp=line.split(",");
			int []lineData=new int[temp.length];
			for(int i=0;i<temp.length;i++) {
				lineData[i]=Integer.valueOf(temp[i]);
			}
			list.add(lineData);
		}
		return list;
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
	}

	/**
	 * Test method for {@link divide.and.conquer.practice.quicksort.QuickSort#quickSort(int[])}.
	 */
	@Test
	public void testQuickSort(){
		QuickSort quickSort=new QuickSort();
		quickSort.quickSort(input);
		assertArrayEquals(expect, input);
	}

}
