package DataDrivenProject.UshaTestAutomation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTestTest {

  @AfterTest
  public void Afteaclass() {
    System.out.println("after test");
  }

  @BeforeTest
  public void BeforeTest() {
	  System.out.println("Before test");
  }

  @Test
  public void Test() {
	  System.out.println("sample test");
  }

  @BeforeClass
  public void beforeclass() {
	  System.out.println("Before Class");
  }
}
