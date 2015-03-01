package Test;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class TestApplication 
{
	public int sum;
	
	@Test
	public void TESTCASE1()
	{
		System.out.println("TESTCASE 1 : Sum x 1 is " + sum *1);
	}
	
	@Test
	public void TESTCASE2()
	{
		System.out.println("TESTCASE 2 : Sum x 2  is " + sum *2);
	}
	
	@Test
	public void TESTCASE3()
	{
		System.out.println("TESTCASE 3 : Sum x 3 is " + sum *3);
	}
	
	
	public TestApplication(int a, int b)
	{
		this.sum = a + b;
		//System.out.println("Sum is : " + sum);
	}

	@BeforeClass
	public static void RunBeforeAnyMethod()
	{
		System.out.println("RunBeforeAnyMethod");
	}
	
	@AfterClass
	public static void RunAfterAnyMethod()
	{
		System.out.println("RunAfterAnyMethod");
	}
	
	@Parameters
	public static Collection<Object[]> getData()
	{
		Object data[][] = new Object[3][2];
		
		data[0][0]= 10;
		data[0][1]= 20;
		
		data[1][0]= 3445;
		data[1][1]= 2234;
		
		data[2][0]= 434;
		data[2][1]= 244;		
		return Arrays.asList(data);
	}
	
}
