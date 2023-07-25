package Test;

import org.testng.annotations.Test;

import Base.Baseclass;
import Pages.Nloginpage;

public class Ntest extends Baseclass {
	@Test
	public void testing() throws InterruptedException
	{
		Nloginpage ob =new Nloginpage(driver1);
		ob.header();
		ob.Setvalues("sreerajsree6666@gmail.com","AqyHTUZtSQ");
		ob.login();
		ob.bycategory();
		ob.kurthis();
		ob.cotton();
		Thread.sleep(3000);
		ob.product();
		Thread.sleep(3000);
		ob.selectsize();
		Thread.sleep(3000);
		ob.cart();
		Thread.sleep(3000);
		ob.cart1();
		Thread.sleep(3000);
		ob.checkout();
		Thread.sleep(3000);
	   
	}

}

