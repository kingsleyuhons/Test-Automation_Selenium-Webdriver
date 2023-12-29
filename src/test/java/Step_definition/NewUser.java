package Step_definition;

import Pages.CreateNewUserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewUser {
    public WebDriver driver;
    public int random;

    @Given("^I get on the home screen$")
    public void iGetOnTheHomeScreen() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @When("^I get on the login screen$")
    public void iGetOnTheLoginScreen() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.ClickHomePageSignIn();

    }

    @And("^I enter email address for new account$")
    public void iEnterEmailAddressForNewAccount() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.EnterEmailToCreateNewUser();

    }

    @And("^I click the create account button$")
    public void iClickTheCreateAccountButton() throws InterruptedException {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.ClickCreateAccountButton();

    }

    @When("^I enter all required details$")
    public void iEnterAllRequiredDetails() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.MaleGenderButton();
        page.EnterUserFirstName();
        page.EnterUserLastName();
        page.EnterPassword();
        page.SelectDoBDay();
        page.SelectDoBMonths();
        page.SelectDoBYears();
        page.EnterAddress();
        page.EnterCity();
        page.SelectState();
        page.EnterPostCode();
        page.EnterPhoneMobile();
        page.EnterAlias();


    }

    @And("^I click the register button$")
    public void iClickTheRegisterButton() {
        driver.findElement(By.xpath("//span[text() = 'Register']")).click();
    }

    @Then("^My account should be successfully created$")
    public void myAccountShouldBeSuccessfullyCreated() {
        String ExpectedLoggedInUser = "Kingsley Uhonmhoibhi";
        String ActualLoggedInUser = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser);
        System.out.println(ActualLoggedInUser);
        driver.quit();
    }
}
