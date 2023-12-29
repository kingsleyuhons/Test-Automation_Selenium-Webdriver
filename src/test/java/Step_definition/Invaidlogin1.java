package Step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invaidlogin1 {
    public WebDriver driver;
    @Given("^that I am on the landing page$")
    public void thatIAmOnTheLandingPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");

    }

    @When("^I select the sign link$")
    public void iSelectTheSignLink() {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @And("^I enter a correct username$")
    public void iEnterACorrectUsername() {
        driver.findElement(By.name("email")).sendKeys("lanre_april@gmail.com");
    }

    @And("^I enter incorrect password$")
    public void iEnterIncorrectPassword() {
        driver.findElement(By.id("passwd")).sendKeys("test");
    }

    @When("^I click the login button$")
    public void iClickTheLoginButton() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
    }

    @Then("^I should the correct error message$")
    public void iShouldTheCorrectErrorMessage() {
        String ExpectedErrorMessage = "Invalid password.";
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);
        driver.quit();
    }
}
