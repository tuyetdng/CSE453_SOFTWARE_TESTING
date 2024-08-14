package lab4;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class Object4 {
	WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		WebDriverManager.chromedriver().setup();

	}

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");

	}

	@DisplayName("Check checkbox1")
	@Test
	void test1() {
		WebElement check1 = driver.findElement(By.id("my-check-1"));
		if (check1.isSelected()) {
			check1.click();
		}
		assertFalse(check1.isSelected());	WebElement check2 = driver.findElement(By.id("my-check-2"));
		if (check2.isSelected()) {
			check2.click();
		}
		assertFalse(check2.isSelected());
	}


}
