package lab4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

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

class Object3 {
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

	@DisplayName("size of Dropdown equal 3")
	@Test
	void test1() {
		WebElement dropdown = driver.findElement(By.name("my-select"));
		Select select = new Select(dropdown);
		List<WebElement> l = select.getOptions();
		assertEquals(3, l.size());

	}
	@DisplayName("Find value “two” in Dropdown")
	@Test
	void test2() {
		WebElement dropdown = driver.findElement(By.name("my-select"));
		Select select = new Select(dropdown);
		select.selectByValue("two");;


	}

}
