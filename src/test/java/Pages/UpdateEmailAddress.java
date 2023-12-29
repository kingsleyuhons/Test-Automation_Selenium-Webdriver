package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class UpdateEmailAddress {
    public int random;

    // Declare your locators
    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement SignInLink;

    @FindBy(how = How.ID_OR_NAME, using = "email")
    public static WebElement EnterEmail;

    @FindBy(how = How.ID_OR_NAME, using = "passwd")
    public static WebElement EnterPassword;

    @FindBy(how = How.ID_OR_NAME, using = "SubmitLogin")
    public static WebElement SubmitButton;

    @FindBy(how = How.XPATH, using = "//span[text() = 'My addresses']")
    public static WebElement ClickAddress;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Update']")
    public static WebElement ClickUpdate;
    @FindBy(how = How.ID_OR_NAME, using = "phone_mobile")
    public static WebElement PhoneMobile;


    @FindBy(how = How.ID_OR_NAME, using = "submitAddress")
    public static WebElement SaveAddress;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    public static WebElement LoggedInUser;


    //Declare methods

    public void ClickHomePageSignIn() {
        SignInLink.click();
    }

    public void EnterEmailAddress() throws InterruptedException {
        EnterEmail.sendKeys("kingsg@gmail.com");

    }
    public void EnterPassword() throws InterruptedException {
        EnterPassword.sendKeys("testing");
    }

    public void ClickLogin() {
        SubmitButton.click();

    }

    public void ClickAddress() {
        ClickAddress.click();

    }
    public void UpdateAddress() {
     ClickUpdate.click();

    }


    public void EnterPhoneMobile() {
        PhoneMobile.sendKeys("040000000");
    }


    public void SaveAddress() {
       SaveAddress.click();
    }
    public void LoggedInUser() {
        String ExpectedLoggedInUser = "Kingsley Uhonmhoibhi";
        String ActualLoggedInUser = LoggedInUser.getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser);
        System.out.println(ActualLoggedInUser);
    }
}
