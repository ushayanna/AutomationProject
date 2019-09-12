package DataDrivenProject.UshaTestAutomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class sampleTest {

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void Afteaclass()
	{
		System.out.println("After Class");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@org.testng.annotations.Test
	public void Test()
	{
		System.out.println("Sample Test");
	}
}
