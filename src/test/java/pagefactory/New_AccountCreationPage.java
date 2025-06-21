package pagefactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseClass;

public class New_AccountCreationPage extends BaseClass {
	WebDriver driver;
	public New_AccountCreationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*@FindBy(xpath="//a[text()='New Account']")
	WebElement accountlink;*/
	@FindBy(xpath="//input[@name='cusid']")
	WebElement custid;
	@FindBy(xpath="//Select[@name='selaccount']")
	WebElement accounttype;
	@FindBy(xpath="//input[@name='inideposit']")
	WebElement intialdeposite;
	
	public void clickonAccountLink()
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement accountLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='New Account']")));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accountLink);
		    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", accountLink);
		}
	public void entercustomerid(String customer_id)
	{
		custid.sendKeys(customer_id);
	}

	public void selectAccType()
	{
		Select s1 = new Select(accounttype);
		s1.selectByValue("savings");
	}
	public void enterIntialDeposite(String intial_deposite)
	{
		intialdeposite.sendKeys(intial_deposite);
	}
}
