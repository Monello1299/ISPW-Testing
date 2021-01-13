package test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class TestSeleniumHomework {
	@Test
	public void testConvertitorResult(){
		int number = 6;
		double result;
		
		String test;
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rapidtables.com/convert/length/feet-to-cm.html");
		driver.findElement(By.xpath("//*[@id=\"x\"]")).sendKeys(Integer.toString(number));
		driver.findElement(By.xpath("//*[@id=\"calc\"]")).click();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"doc\"]/form/table/tbody/tr[3]/td[2]/input"));
		test = element.getAttribute("value");
		driver.close();
		result = Double.parseDouble(test);
		
		assertEquals(number*(182.88/6), result, 5);
	}
}
