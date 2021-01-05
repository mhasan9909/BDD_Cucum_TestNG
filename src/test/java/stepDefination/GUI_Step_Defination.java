package stepDefination;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DefaultLib;

public class GUI_Step_Defination extends DefaultLib {
	public static WebDriver driver;

	@Before
	public static void bRun() {

		System.setProperty("webdriver.chrome.driver", "/Users/mdhasan/eclipse-workspace/BDD_Project/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);

	}

	@Given("^user at facebook homepage$")
	public void signUp() {
		System.out.println("I am in Facebook page ::" + driver.getTitle());
	}

	@Then("click on create new account")
	public void fbCreateAcct() throws IOException {
		findEle(driver, redProp("creatAcct")).click();

	}

	@When("user entering {string} {string}")
	public void user_enter_userInfo_as(String xpath, String value) throws InterruptedException, IOException {
		findEle(driver, redProp(xpath)).sendKeys(value);
		Thread.sleep(1000);
	}
//
//	@And("user enter password as {string} {string}")
//	public void user_enter_password_as(String xpath, String value) throws IOException {
//		findEle(driver, redProp(xpath)).sendKeys(value);
//
//	}

//	@Then("click on login button")
//	public void click_on_login_button() {
//		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
//
//	}
//
//	@And("user should be login to their facebook page")
//	public void user_should_be_login_to_their_facebook_page() throws InterruptedException {
//		System.out.println("user loged into their Facebook Page ::" + driver.getTitle());
//
//		Thread.sleep(3000);
//
//	}

	@After
	public static void teardown() {
		driver.manage().deleteAllCookies();
		driver.close();
	}
}
