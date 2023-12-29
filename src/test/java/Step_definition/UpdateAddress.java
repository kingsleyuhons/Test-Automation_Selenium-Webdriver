package Step_definition;

import Pages.CreateNewUserPage;
import Pages.UpdateEmailAddress;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class UpdateAddress {
    public WebDriver driver;
    @Given("^that I am logged into my account$")
    public void thatIAmLoggedIntoMyAccount() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
        UpdateEmailAddress page = PageFactory.initElements(driver, UpdateEmailAddress.class);
        page.ClickHomePageSignIn();
        page.EnterEmailAddress();
        page.EnterPassword();
        page.ClickLogin();
    }
    @When("^I click on the my address button$")
    public void iClickOnTheMyAddressButton() {
        UpdateEmailAddress page = PageFactory.initElements(driver, UpdateEmailAddress.class);
        page.ClickAddress();
    }

    @And("^I clicked on the update button$")
    public void iClickedOnTheUpdateButton() {
        UpdateEmailAddress page = PageFactory.initElements(driver, UpdateEmailAddress.class);
        page.UpdateAddress();
    }

    @And("^I enter the required details to be updated$")
    public void iEnterTheRequiredDetailsToBeUpdated() {
        UpdateEmailAddress page = PageFactory.initElements(driver, UpdateEmailAddress.class);
        page.EnterPhoneMobile();
    }

    @When("^I click on the save button$")
    public void iClickOnTheSaveButton() {
        UpdateEmailAddress page = PageFactory.initElements(driver, UpdateEmailAddress.class);
        page.SaveAddress();
    }

    @Then("^my address should be saved successfully$")
    public void myAddressShouldBeSavedSuccessfully() {
        String ExpectedLoggedInUser = "Kingsley Uhonmhoibhi";
        String ActualLoggedInUser = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser);
        System.out.println(ActualLoggedInUser);
        driver.quit();
    }

}
