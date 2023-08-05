package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myntra {
  @Test
  public void myntraTest() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("opening myntra", false);
	  //Thread.sleep(3000);
	  driver.get("https://www.myntra.com");
	  Thread.sleep(3000);
	  driver.quit();
  }
}
