package dynamic.programming.practice.array;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MaxContiniousSubseq2Test {
	
	private int []input;
	private int expectMax;
	private int expect;
	
	public MaxContiniousSubseq2Test(int []input,int []expect) {
		this.input=input;
		this.expect=expect[0];
		expectMax=1;
	}
	
	@Parameters
	public static Collection data() {
		int [][][]data= {
				{
					{1,-2,4,-1,-5},{4}
					
				},
				{
					{1,-2,-4,1,5},{6}
				},
				{
					{1,2,3,1,1},{8}
				},
				{
					{-1,-2,-4,-1,-5},{-1}
				},
				{
					{0,0,0,0,0},{0}
				},
			};
		return Arrays.asList(data);
		
	}
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		assertEquals(expect, MaxContiniousSubseq2.findGreatestSumOfSubArray(input));
	}

	@Test
	public void testMax() {
//		assertEquals(expectMax, MaxContiniousSubseq2.max(input[0], input[1], input[2]));
	}

}
