package Step_definition;

import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin extends TestBase {


    @And("^I enter a valid username$")
    public void iEnterAValidUsername() {
        driver.findElement(By.name("email")).sendKeys("lanre_april@gmail.com");
    }

    @And("^I enter a valid password$")
    public void iEnterAValidPassword() {
        driver.findElement(By.id("passwd")).sendKeys("testing");
    }
    @When("^I click the log in button$")
    public void iClickTheLogInButton() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
    }

    @Then("^I should be signed in successfully$")
    public void iShouldBeSignedInSuccessfully() {
        String ExpectedLoggedInUser = "Dorice Mbonde";
        String ActualLoggedInUser = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser);
        System.out.println(ActualLoggedInUser);
        driver.quit();
    }
}
