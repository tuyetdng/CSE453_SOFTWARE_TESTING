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

import io.github.bonigarcia.wdm.WebDriverManager;

class TestSelenium {
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
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();
	}

	@AfterEach
	void tearDown() throws Exception {
//		driver.quit();
	}

	@DisplayName("Test Title")
	@Test
	void testTitle() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));

		String title = driver.getTitle();
		assertEquals("Web form", title);
	}

	@DisplayName("Test TextBox")
	@Test
	void testTextBox() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		WebElement textBox = driver.findElement(By.name("my-text"));
		textBox.sendKeys("Selenium");
		String actual = textBox.getText();

	}

	@DisplayName("Test Button")
	@Test
	void testButton() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		WebElement textBox = driver.findElement(By.name("my-text"));
		textBox.sendKeys("Selenium");
		WebElement submitButton = driver.findElement(By.cssSelector("button"));
		submitButton.click();
		WebElement message = driver.findElement(By.id("message"));
		String value = message.getText();
		assertEquals("Received!", value);
	}

}
