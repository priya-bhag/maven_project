package tool_tip_jenkins;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tool {	
	
	
	@Test
	public void tool_tip_meth(){
	
	
	WebDriver driver;
	driver = new FirefoxDriver();
	
	driver.get("http://gmail.com");
driver.findElement(By.linkText("Create account")).click();

driver.findElement(By.id("GmailAddress")).click();


WebElement element = driver.findElement(By.xpath("html/body/div[3]"));

Actions action = new Actions(driver);

action.moveToElement(element).build().perform();

String message = element.getText();
System.out.println(message);
}


}

