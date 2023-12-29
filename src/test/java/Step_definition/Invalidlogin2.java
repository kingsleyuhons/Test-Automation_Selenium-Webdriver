package Step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalidlogin2 {
    public WebDriver driver;

    @Given("^I get on the landing page$")
    public void iGetOnTheLandingPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @When("^I press the sign in button$")
    public void iPressTheSignInButton() {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @And("^I enter a wrong username$")
    public void iEnterAWrongUsername() {
        driver.findElement(By.name("email")).sendKeys("lanre@gmail.com");
    }

    @And("^I enter correct password$")
    public void iEnterCorrectPassword() {
        driver.findElement(By.id("passwd")).sendKeys("testing");
    }

    @When("^I click the button to log in$")
    public void iClickTheButtonToLogIn() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
    }

    @Then("^I should the right error message$")
    public void iShouldTheRightErrorMessage() {
        String ExpectedErrorMessage = "Authentication failed.";
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);
        driver.quit();
    }
}
