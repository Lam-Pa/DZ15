import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private static final String MAIN_PAGE_URL ="http://automationpractice.com";
    private final WebDriver driver;

    private By signButton = By.xpath("//a[@class='login']");
    private By createEmail = By.xpath("//input[@id='email_create']");
    private By buttonCreateEmail = By.xpath("//button[@id='SubmitCreate']");
    private By genderRadio = By.xpath("//input[@id='id_gender1']");
    private By firstName = By.xpath("//input[@id='customer_firstname']");
    private By lastName = By.xpath("//input[@id='customer_lastname']");
    private By password = By.xpath("//input[@id='passwd']");
    private By buttonSubmitAcc = By.xpath("//button[@id='submitAccount']");
    private By alert = By.xpath("//div[@class='alert alert-danger']");


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean openMainPage(){
        this.driver.navigate().to(MAIN_PAGE_URL);
        return false;
    }

    public void gotoReistration() {
        this.driver.findElement(signButton).click();
    }

    public void sendCreateEmail(String Email) {
        this.driver.findElement(createEmail).sendKeys(Email);
    }

    public void submitCreateEmail () {
        this.driver.findElement(buttonCreateEmail).click();
    }

    public void chooseGender(){
        this.driver.findElement(genderRadio).click();
    }

    public void sendFirstName (String FirstName) {
        this.driver.findElement(firstName).sendKeys(FirstName);
    }

    public void sendLastName (String LastName) {
        this.driver.findElement(lastName).sendKeys(LastName);
    }

    public void sendPassword (String Password) {
        this.driver.findElement(password).sendKeys(Password);
    }

    public void submitAcc () {
        this.driver.findElement(buttonSubmitAcc).click();
    }

    public boolean isAlertVisible () {
        this.driver.findElement(alert).isDisplayed();
        return false;
    }

}
