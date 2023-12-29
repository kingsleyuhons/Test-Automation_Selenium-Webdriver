package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CreateNewUserPage {
    public int random;

    // Declare your locators
    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement SignInLink;

    @FindBy(how = How.ID_OR_NAME, using = "email_create")
    public static WebElement CreateNewUserEmailField;

    @FindBy(how = How.ID_OR_NAME, using = "SubmitCreate")
    public static WebElement ClickCreateAccButton;

    @FindBy(how = How.ID_OR_NAME, using = "id_gender1")
    public static WebElement MaleGenderButton;

    @FindBy(how = How.ID_OR_NAME, using = "customer_firstname")
    public static WebElement CustomerFirstName;

    @FindBy(how = How.ID_OR_NAME, using = "customer_lastname")
    public static WebElement CustomerLastName;

    @FindBy(how = How.ID_OR_NAME, using = "passwd")
    public static WebElement Password;

    @FindBy(how = How.ID_OR_NAME, using = "days")
    public static WebElement DoBDays;

    @FindBy(how = How.ID_OR_NAME, using = "months")
    public static WebElement BoDMonths;

    @FindBy(how = How.ID_OR_NAME, using = "years")
    public static WebElement DoBYears;

    @FindBy(how = How.ID_OR_NAME, using = "address1")
    public static WebElement Address;

    @FindBy(how = How.ID_OR_NAME, using = "city")
    public static WebElement City;

    @FindBy(how = How.ID_OR_NAME, using = "id_state")
    public static WebElement UserState;

    @FindBy(how = How.ID_OR_NAME, using = "postcode")
    public static WebElement Postcode;

    @FindBy(how = How.ID_OR_NAME, using = "phone_mobile")
    public static WebElement PhoneMobile;

    @FindBy(how = How.ID_OR_NAME, using = "alias")
    public static WebElement AddressAlias;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Register']")
    public static WebElement RegisterButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    public static WebElement LoggedInUser;


    //Declare methods

    public void ClickHomePageSignIn() {
        SignInLink.click();
    }
    public void EnterEmailToCreateNewUser() {
        random = 100 + (int) (Math.random ()* (1000-1) +1);
        CreateNewUserEmailField.sendKeys("kinguh" + random + "@gamail.com");
    }

    public void ClickCreateAccountButton() throws InterruptedException {
        ClickCreateAccButton.click();
        Thread.sleep(6000);
    }

    public void MaleGenderButton() {
        MaleGenderButton.click();
    }

    public void EnterUserFirstName() {
        CustomerFirstName.sendKeys("Kingsley");
    }

    public void EnterUserLastName() {
        CustomerLastName.sendKeys("Uhonmhoibhi");
    }

    public void EnterPassword() {
        Password.sendKeys("testing");
    }

    public void SelectDoBDay() {
        Select day = new Select (DoBDays);
        day.selectByIndex(10);
    }

    public void SelectDoBMonths() {
        Select Month = new Select (BoDMonths);
        Month.selectByValue("9");
    }

    public void SelectDoBYears() {
        Select Year = new Select (DoBYears);
        Year.selectByValue("1990");
    }

    public void EnterAddress() {
        Address.sendKeys("Finninmaenkatu 4H");
    }

    public void EnterCity() {
        City.sendKeys("Tampere");
    }

    public void SelectState() {
        Select State = new Select (UserState);
        State.selectByVisibleText("Delaware");
    }

    public void EnterPostCode() {
        Postcode.sendKeys("33710");
    }

    public void EnterPhoneMobile() {
        PhoneMobile.sendKeys("0488956765");
    }

    public void EnterAlias() {
        AddressAlias.sendKeys("Delaware");
    }

    public void RegisterUser() {
        RegisterButton.click();
    }
    public void LoggedInUser() {
        String ExpectedLoggedInUser = "Kingsley Uhonmhoibhi";
        String ActualLoggedInUser = LoggedInUser.getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser);
        System.out.println(ActualLoggedInUser);
    }
}
