package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="D:\\selenium-gurpreet\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		String act =driver.getTitle();
		String exp="Facebook – log in or sign up";
		
		if (act.equalsIgnoreCase(exp)==true)
		{
	System.out.println("Title Matches:Test Pass");
		}
		
		else
		{
			System.out.println("Title Doesn't Match:Test Fail");
		}
		

	}

}
