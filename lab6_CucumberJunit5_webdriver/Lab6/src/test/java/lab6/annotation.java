package lab6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class annotation {
	WebDriver driver;

	@Given("I am at {string}")
	public void openbrowser1(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	@When("I input {string} to the first TextBox")
	public void writeFullName(String fullname) {
		WebElement textBox1 = driver.findElement(By.id("fullName"));
		textBox1.sendKeys(fullname);
	}

	@Then("The text is now your {string}")
	public void readFullName(String fullnameExpect) {
		assertEquals(fullnameExpect, driver.findElement(By.id("fullName")).getAttribute("value"));

	}

	@When("I append {string} according to their Full name to TextBox")
	public void writeID(String id) {
		driver.findElement(By.id("fullName")).sendKeys(id);
		driver.findElement(By.id("join")).sendKeys(id);
	}

	@Then("The text is now I am good {string}")
	public void readID(String strExpect) {
		String str = "I am good" + strExpect;
		assertEquals(str, driver.findElement(By.id("join")).getAttribute("value"));
	}

	@When("I press TAB")
	public void pressTab() {
		driver.findElement(By.id("join")).sendKeys(Keys.TAB);
	}

	@Then("I read from the third TextBox and The text I received are {string}")
	public void readAfterTab(String strExpect) {
		assertEquals(strExpect, driver.findElement(By.id("getMe")).getAttribute("value"));
	}

	@When("I clear the fourth TextBox")
	public void clearTheFourthTextBox() {
		driver.findElement(By.id("clearMe")).clear();
	}

	@Then("It is empty now")
	public void readAfterClearFourth() {
		String value = driver.findElement(By.id("clearMe")).getAttribute("value");
		assertEquals("",value);
	}

	@When("I check the fifth TextBox")
	public void clearTheFifthTextBox() {
		driver.findElement(By.id("noEdit"));
	}

	@Then("It is disabled")
	public void readDisableBox() {
		assertTrue(!driver.findElement(By.id("noEdit")).isEnabled());
	}

	@When("I check the sixth TextBox")
	public void clearThesixthTextBox() {
		driver.findElement(By.id("dontwrite"));
	}

	@Then("It is read-only")
	public void readReadOnlyBox() {
		String readonlyAttribute = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		boolean isReadOnly = readonlyAttribute != null && !readonlyAttribute.isEmpty();
		assertTrue(isReadOnly);
		driver.close();

	}

	@Given("I go to {string}")
	public void openbrowser2(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	@When("I pick apple from the first Dropdown")
	public void pickAppleInFirstDropdown() {
		Select select1 = new Select(driver.findElement(By.id("fruits")));
		select1.selectByIndex(1);
	}

	@Then("You have selected Apple pop up")
	public void readPopup1() {
		assertEquals("You have selected Apple", driver.findElement(By.className("subtitle")).getText());
		// driver.close();
	}

	@When("I chose Aquaman in the next Dropout")
	public void pickAquamanInSecondDropout() {
		Select select1 = new Select(driver.findElement(By.id("superheros")));
		select1.selectByIndex(1);
	}

	@Then("You have selected Aquaman pop up")
	public void readPopup2() {
		List<WebElement> subtitles = driver.findElements(By.className("subtitle"));
		String aquamanText = subtitles.get(1).getText();
		assertEquals("You have selected Aquaman", aquamanText);

	}

	@When("I chose the last programming language")
	public void pickAquamanInThirdDropdown() {
		Select select1 = new Select(driver.findElement(By.id("lang")));
		select1.selectByIndex(4);
	}

	@Then("{string} pops up")
	public void readPopup3(String str) {
		List<WebElement> subtitles = driver.findElements(By.className("subtitle"));
		String languageText = subtitles.get(1).getText();
		assertEquals(str, languageText);

	}

	@When("Select India using value")
	public void pickAquamanInFourthDropdown() {
		Select select1 = new Select(driver.findElement(By.id("country")));
		select1.selectByValue("India");
		;
	}

	@Then("Success")
	public void readPopup4() {
		Select dropdown = new Select(driver.findElement(By.id("country")));
		dropdown.selectByValue("India");
		WebElement selectedOption = dropdown.getFirstSelectedOption();
		System.out.println("Selected value: " + selectedOption.getAttribute("value"));

	}

	@Given("I go to {string}")
	public void openbrowser3(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	@When("I pick Yes option in the first Radio")
	public void test1() {
		driver.findElement(By.id("yes")).click();

	}

	@Then("The Yes is ticked")
	public void checkTest1() {
		assertTrue(driver.findElement(By.id("yes")).isSelected());
	}

	@When("I try to tick all options in the second Radio")
	public void test2() {
		driver.findElement(By.id("one")).click();
		driver.findElement(By.id("two")).click();

	}

	@Then("Confirm you can select only one radio button")
	public void checkTest2() {
		assertFalse(driver.findElement(By.id("one")).isSelected());
		assertTrue(driver.findElement(By.id("two")).isSelected());

	}

	@When("I try to tick all options in the third Radio")
	public void test3() {
		driver.findElement(By.id("nobug")).click();
		driver.findElement(By.id("bug")).click();

	}

	@Then("Confirm you can select all radio button")
	public void checkTest3() {
		assertTrue(driver.findElement(By.id("nobug")).isSelected());
		assertTrue(driver.findElement(By.id("bug")).isSelected());

	}

	@When("I check if Bar is selected")
	public void test4() {
		driver.findElement(By.id("notfoo")).isSelected();

	}

	@Then("Bar is selected")
	public void checkTest4() {
		assertTrue(driver.findElement(By.id("notfoo")).isSelected());

	}

	@When("I check if last field is disabled")
	public void test5() {
		assertFalse(driver.findElement(By.id("maybe")).isEnabled());

	}

	@Then("last field is disabled")
	public void checkTest5() {
		assertFalse(driver.findElement(By.id("maybe")).isEnabled());
	}

	@When("I check if Remember me is selected")
	public void test6() {
		WebElement checkbox = driver.findElement(By.xpath("//label[contains(text(),'Remember me')]/input[@type='checkbox']"));
		assertTrue(checkbox.isSelected());
	}

	@Then("Remember me is selected")
	public void checkTest6() {
		WebElement checkbox = driver.findElement(By.xpath("//label[contains(text(),'Remember me')]/input[@type='checkbox']"));
		assertTrue(checkbox.isSelected());
	}

	@When("I agree to the T&C")
	public void test7() {
		driver.findElements(By.xpath("//label[contains(@class, 'checkbox') and contains(., 'I agree to the FAKE terms and conditions')]/input[@type='checkbox']")).get(1).click();

	}

	@Then("true")
	public void checkTest7() {
		assertTrue(driver.findElements(By.xpath("//label[contains(@class, 'checkbox') and contains(., 'I agree to the FAKE terms and conditions')]/input[@type='checkbox']")).get(1).isSelected());

	}
}
