package lab3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

class Problem2 {
	WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		WebDriverManager.chromedriver().setup();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@DisplayName("Test ID Locator")
	@Test
	void testID() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumtesting@yahoo.com");
	}

	@DisplayName("Test Name Locator")
	@Test
	void testName() {
		driver.findElement(By.name("email")).sendKeys("seleniumtesting@yahoo.com");
	}

	@DisplayName("Test Name Locator")
	@Test
	void testPartialLinkText() {
		driver.findElement(By.partialLinkText("Con")).click();
	}

	@DisplayName("Test tagName")
	@Test
	void testtagName() {
		driver.findElement(By.tagName("a")).click();
	}

	@DisplayName("Test CSS Selectors")
	@Test
	void testCSSSelectors() {
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumtesting@yahoo.com");
	}


	@DisplayName("Test Relative Locators")
	@Test
	void testRelativeLocators() {
		By emailLocator = RelativeLocator.with(By.id("input-email")).above(By.id("input-password"));

	}

}
