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
	
	@Parameters
	public static Collection data() {
		int [][]data= {
				{},
				{},
				{},
				{}
			};
		return Arrays.asList(data);
		
	}
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void testMax() {
		
	}

}
