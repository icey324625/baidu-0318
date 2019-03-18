package openbaidu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Openbaidu {
public WebDriver driver;
public String url;
@BeforeClass
    public void setup() {
	System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
	driver=new ChromeDriver();
	url="https://www.baidu.com/";
}
@Test
   public void open() {	   
	driver.get(url);
	driver.findElement(By.id("kw")).sendKeys("selenium");
	driver.findElement(By.id("su")).click();
}
}
