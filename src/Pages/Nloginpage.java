package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Nloginpage {
WebDriver driver1;
	
	By header=By.xpath("//*[@id=\"siteHeader\"]/div[1]/div/div/div/div/div[2]/div/div[1]/h6/a");
	By Nemail=By.id("login-email");
	By Npassword=By.id("login-pass");
	By Nlogin=By.name("submit");
	By Sbycategory =By.xpath("//*[@id=\"siteHeader\"]/div[2]/div/div/div/div/div[1]/div/ul/li[1]/a");
	By Skurthis=By.xpath("//*[@id=\"siteHeader\"]/div[2]/div/div/div/div/div[1]/div/ul/li[1]/ul/li[1]/a");
	By Scotton=By.xpath("//*[@id=\"home_maincat_sec\"]/div/div[1]/a/img");
	By Sproduct=By.xpath("//*[@id=\"resProduct\"]/div[2]/div/div[1]/a");
	By size=By.xpath("//label[@class='form-option-label form__lanel-variant active ']");
	By addcart=By.xpath("//*[@id=\"btn-cart-add\"]");
    By Ncart =By.xpath("//a[@href='https://sylvina.in/cart']");
	By Ncheckout =By.xpath("//a[@href='https://sylvina.in/checkout']");
	
	public Nloginpage(WebDriver driver1) {
		// TODO Auto-generated constructor stub
		this.driver1=driver1;
	}
	public void header()
	{
	driver1.findElement(header).click();
	}
	public void Setvalues(String username,String password)
	{
		driver1.findElement(Nemail).sendKeys(username);
		driver1.findElement(Npassword).sendKeys(password);
	
	}
	public void login()
	{
		driver1.findElement(Nlogin).click();
	}
	public void bycategory()
	{
		driver1.findElement(Sbycategory).click();
	}
	public void kurthis()
	{
		driver1.findElement(Skurthis).click();
	}
	public void cotton()
	{
		driver1.findElement(Scotton).click();
	}
	public void product()
	{
		driver1.findElement(Sproduct).click();
	}
	public void selectsize()
	{
		driver1.findElement(size).click();
	}
	public void cart()
	{
		driver1.findElement(addcart).click();
	}
	public void cart1()
	{
		driver1.findElement(Ncart).click();
		
	}
	public void checkout()
	{
		driver1.findElement(Ncheckout).click();
	}
}
