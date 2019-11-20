package myfirst;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(priority=2,dataProvider="info")
  public void f(String myname,int num) {
	  System.out.println(myname+" "+" "+num);
  }
  @Test(priority=1)
  public void f1() {
	  System.out.println("teju");
  }
  @Test(priority=3,enabled=false)
  public void f2() {
	  System.out.println("blank");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before my first method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after my method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("open browser");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("close browser");
  }
  @DataProvider
  public Object[][] info()
  {
	  Object[][] data= {
			  {"naveen",123}
	  };
	  return data;
  }
  
  
  

}
