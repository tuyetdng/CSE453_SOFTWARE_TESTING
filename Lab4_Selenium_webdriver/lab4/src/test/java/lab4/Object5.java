package lab4;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
//		driver.findElement(By.id("firstname")).sendKeys("Dangg");
//		driver.findElement(By.id("lastname")).sendKeys("Tuyett");
//		driver.findElement(By.id("email_address")).sendKeys("dangthianhtuyet12345@gmail.com");
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
//		driver.findElement(By.partialLinkText("Sign In")).click();
//		driver.findElement(By.name("login[username]")).sendKeys("dangthianhtuyet12345@gmail.com");
//		driver.findElement(By.name("login[password]")).sendKeys("Dangthianhtuyet12345678910@");
//		WebElement submitButton2 = driver.findElement(By.name("send"));
//		submitButton2.click();
//		driver.findElement(By.id("search")).sendKeys("Tank");
//		driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
//		driver.findElement(By.className("product-image-photo")).click();
//
//		driver.findElement(By.id("option-label-size-143-item-166")).click();
//		driver.findElement(By.id("option-label-color-93-item-53")).click();
//		driver.findElement(By.id("product-addtocart-button")).click();
//	
//	}
	@DisplayName("Check out")
	@Test
	void test5() throws InterruptedException {

		driver.findElement(By.partialLinkText("Sign In")).click();
		driver.findElement(By.name("login[username]")).sendKeys("dangthianhtuyet12345@gmail.com");
		driver.findElement(By.name("login[password]")).sendKeys("Dangthianhtuyet12345678910@");
		WebElement submitButton2 = driver.findElement(By.name("send"));
		submitButton2.click();
		driver.findElement(By.id("search")).sendKeys("Tank");
		driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("a.action.showcart")).click();
		driver.findElement(By.id("top-cart-btn-checkout")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement streetTextBox = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("street[0]")));
		streetTextBox.sendKeys("ABD16G");
		driver.findElement(By.name("street[1]")).sendKeys("ph.Htdus");
		driver.findElement(By.name("street[2]")).sendKeys("NewRoad");
		driver.findElement(By.name("city")).sendKeys("London");
		Select select1 = new Select(driver.findElement(By.name("region_id")));
		select1.selectByIndex(2);
		driver.findElement(By.name("postcode")).sendKeys("AHDBFJ21");
		Select select2 = new Select(driver.findElement(By.name("country_id")));
		select2.selectByIndex(2);
		driver.findElement(By.name("telephone")).sendKeys("01223456789");
		WebElement radioButton = driver.findElement(By.cssSelector("input[type='radio'][value='flatrate_flatrate']"));
		radioButton.click();
		WebElement button = driver.findElement(By.cssSelector("button[data-role='opc-continue']"));
		button.click();
		Thread.sleep(5000);
		WebElement button1 = driver.findElement(By.xpath("//button[contains(., 'Place Order')]"));
		assertNotNull(button1);
		Thread.sleep(5000);
		button1.click();
	}
}
