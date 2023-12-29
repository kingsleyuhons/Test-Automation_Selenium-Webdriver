package Step_definition;

import Base.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalidlogin3 extends TestBase {

    @When("^I enter \"([^\"]*)\"$")
    public void iEnter(String Username) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(Username);

    }
    @And("^I input \"([^\"]*)\"$")
    public void iInput(String Password) throws Throwable {
        driver.findElement(By.name("passwd")).sendKeys(Password);

    }

    @When("^I click login$")
    public void iClickLogin() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
    }

    @Then("^I should get the correct \"([^\"]*)\"$")
    public void IShouldGetTheCorrect(String errormessage) throws Throwable {
        String ExpectedErrorMessage = errormessage;
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);


    }

}
