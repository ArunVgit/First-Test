package Sanity.adminLogin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testngtest {

	System.setProperty("webdriver.chrome.driver","E:\\Chrome driver\\chromedriver.exe");
FileReader file= new FileReader("E:\\credentials\\login.txt");
BufferedReader br = new BufferedReader(file);
String line;
int count = 0,iteration =0;
while((line=br.readLine())!=null )
{
count= count +1;
iteration = iteration +1 ;
String [] input= br.readLine().split(",",2);
if (count!=0)
{
	ChromeOptions options = new ChromeOptions();
	 
	// add parameter which will disable the extension
	options.addArguments("--disable-extensions");
			//disable-popup-blocking");
	 
	// Start the chrome session
	 driver = new ChromeDriver(options);
	
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	driver.get("https://uatadmin.envestnet.com/secure/app.jsp");
	Thread.sleep(2000);
	WebElement un = driver.findElement(By.xpath("//*[@id=\"login.0\"]/div[1]/div/table/tbody/tr[1]/td[2]/div/input"));
	////*[@id="login.0"]/div[1]/div/table/tbody/tr[1]/td[2]/div/input

	un.sendKeys(input[0]);
	WebElement pw= driver.findElement(By.xpath("//*[@id=\"login.0\"]/div[1]/div/table/tbody/tr[2]/td[2]/div/input"));
	pw.sendKeys(input[1]);
	driver.findElement(By.xpath("//*[@id=\"login.0\"]/div[1]/div/div[2]/div/input")).click();
	Thread.sleep(2000);
	//driver.switchTo().frame("app");
	WebElement ul= driver.findElement(By.xpath("//*[@id=\"userlookup.0\"]/td"));
	ul.click();
}
	}
}
	}



}
