package cucumberdemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class annotation {
	WebDriver driver;

//	@Given("I have opened the browser")
//	public void openbrowser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//	}
//
//	@When("I open Selenium test website")
//	public void openwebsite() {
//		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
//	}
//
//	@Then("Title should exits")
//	public void test1pageTitle() {
//		String at = driver.getTitle();
//		assertNotNull(at);
//		driver.close();
//	}
//
//	@Given("I have opened the browser")
//	public void openbrowserTest2() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//	}
//
//	@When("I open this url {string}")
//	public void openwebsite(String url) {
//		driver.get(url);
//	}
//
//	@Then("I should receive its title as {string}")
//	public void test1pageTitle(String title) {
//		String at = driver.getTitle();
//		assertEquals(title, at);
//		driver.close();
//	}

	@Given("I have opened the browser")
	public void openbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@When("I open this url {string}")
	public void openwebsite(String url) {
		driver.get(url);
	}

	@Then("I should receive its title as {string}")
	public void test1pageTitle(String title) {
		String at = driver.getTitle();
		assertEquals(title, at);
		driver.close();
	}

	@Given("I have opened chrome")
	public void openChrome() {
		driver = new ChromeDriver();
	}

	@Given("I go to Selenium {string}")
	public void openTestLink(String seleniumTestSite) {
		driver.get(seleniumTestSite);
	}

	@Given("I click on the link {string}")
	public void gotoIndex(String indexLink) {
		driver.findElement(By.linkText(indexLink)).click();
	}

	@Then("I should be at index {string}")
	public void atIndexPage(String indexTitle) {
		assertEquals(indexTitle, driver.getCurrentUrl());
	}

	@Then("The index title should be {string}")
	public void indexTitle(String titleValue) {
		assertEquals(titleValue, driver.getTitle());
		driver.close();
	}

}
