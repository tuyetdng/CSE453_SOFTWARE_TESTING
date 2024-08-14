package lab3;

import static org.junit.jupiter.api.Assertions.*;

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
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

class Problem8 {
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
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@DisplayName("Test select By Index")
	@Test
	void testselectByIndex() {
		WebElement typeIndex = driver.findElement(By.name("my-select"));
		Select select = new Select(typeIndex);

		select.selectByIndex(2);
	}
	@DisplayName("Test select By Value")
	@Test
	void testselectByValue() {
		WebElement typeIndex = driver.findElement(By.name("my-select"));
		Select select = new Select(typeIndex);

		select.selectByValue("1");;
	}
}
