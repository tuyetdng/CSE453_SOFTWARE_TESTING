package lab4;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.Duration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

class Object5 {
	WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		WebDriverManager.chromedriver().setup();

	}

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");

	}

//	@DisplayName("Create Account")
//	@Test
//	void test() {
//		driver.findElement(By.partialLinkText("Create an Account")).click();
//		driver.findElement(By.id("firstname")).sendKeys("Dang");
//		driver.findElement(By.id("lastname")).sendKeys("Tuyet");
//		driver.findElement(By.id("email_address")).sendKeys("dangthianhtuyet1234@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Dangthianhtuyet12345678910@");
//		driver.findElement(By.id("password-confirmation")).sendKeys("Dangthianhtuyet12345678910@");
//		WebElement submitButton = driver.findElement(By.cssSelector("button.submit"));
//		submitButton.click();
//
//	}
//	
//	@DisplayName("Login with random Account")
//	@Test
//	void test2() {
//		driver.findElement(By.partialLinkText("Sign In")).click();
//		driver.findElement(By.name("login[username]")).sendKeys("abcd123@gmail.com");
//		driver.findElement(By.name("login[password]")).sendKeys("123456789");
//
//		WebElement submitButton = driver.findElement(By.name("send"));
//		submitButton.click();
//
//	}
//
//	@DisplayName("Search Tank")
//	@Test
//	void test3() {
//		driver.findElement(By.id("search")).sendKeys("Tank");
//		driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
//		driver.findElement(By.partialLinkText("Primo Endurance Tank")).click();
//
//		
//	}
//
//	@DisplayName("Add Cart")
//	@Test
//	void test4() {
//		driver.findElement(By.id("search")).sendKeys("Tank");
//		driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
//		driver.findElement(By.className("product-image-photo")).click();
//
//		driver.findElement(By.id("option-label-size-143-item-166")).click();
//		driver.findElement(By.id("option-label-color-93-item-53")).click();
//		driver.findElement(By.id("product-addtocart-button")).click();
//
////		Actions action = new Actions(driver);
////		action.moveToElement(driver.findElement(By.partialLinkText("Add to Cart"))).perform();
////		driver.findElement(By.partialLinkText("Add to Cart")).click();
//		
//		
//	}
	@DisplayName("Check out")
	@Test
	void test5() {
		driver.findElement(By.id("search")).sendKeys("Tank");
		driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
		driver.findElement(By.className("product-image-photo")).click();

		driver.findElement(By.id("option-label-size-143-item-166")).click();
		driver.findElement(By.id("option-label-color-93-item-53")).click();
		driver.findElement(By.id("product-addtocart-button")).click();
		driver.findElement(By.cssSelector("a.action.showcart")).click();


		
		
	}
}
