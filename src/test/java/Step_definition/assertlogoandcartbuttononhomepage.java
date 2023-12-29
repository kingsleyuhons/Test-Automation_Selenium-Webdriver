package Step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assertlogoandcartbuttononhomepage {
    public WebDriver driver;

    @Given("^I launch the browser$")
    public void i_launch_the_browser() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^I enter the application url$")
public void i_enter_the_application_url() throws Throwable {
        driver.navigate().to("http://automationpractice.com/index.php");

}

    @When("^I wait for (\\d+) seconds$")
    public void i_wait_for_seconds(int arg1) throws Throwable {
         Thread.sleep(5000);
    }

    @Then("^I should see the application logo and add cart button$")
    public void i_should_see_the_application_logo_and_add_cart_button() throws Throwable {
        driver.findElement(By.id("header_logo")).isDisplayed();
        driver.findElement(By.className("shopping_cart")).isDisplayed();
        driver.quit();

    }
}
