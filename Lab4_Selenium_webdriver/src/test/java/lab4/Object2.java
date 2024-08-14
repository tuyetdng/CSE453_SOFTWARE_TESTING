package lab4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class Object2 {
	WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		WebDriverManager.chromedriver().setup();
	}

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();

	}

	@DisplayName("Send User01 to First Textbox && Send Password01 to Second Textbox")
	@Test
	void test1() {
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		WebElement textBox1 = driver.findElement(By.tagName("input"));
		textBox1.sendKeys("User01");

		WebElement textBox2 = driver.findElement(By.name("my-password"));
		textBox2.sendKeys("Password01");
	}

}
