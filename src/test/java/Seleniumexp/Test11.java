package Seleniumexp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver","E:\\batch247\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//Click on Gmail link
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(5000);
		//Click on Sign in
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}



