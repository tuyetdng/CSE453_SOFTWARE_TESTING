package lab4;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;

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

import io.github.bonigarcia.wdm.WebDriverManager;

class Object1 {
	WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		WebDriverManager.chromedriver().setup();
	}

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@DisplayName("Go to Selenium web")
	@Test
	void testSeleniumWeb() {
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();

	}

	@DisplayName("Go to index")
	@Test
	void testReturnIndexe() {
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();
		driver.findElement(By.tagName("a")).click();

	}
	@DisplayName("Title")
	@Test
	void testTitle() {
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.findElement(By.tagName("a")).click();
		String title = driver.getTitle();
		assertEquals("Index of Available Pages", title);
	}
}
