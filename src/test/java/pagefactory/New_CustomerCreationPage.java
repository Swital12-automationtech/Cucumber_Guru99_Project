package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_CustomerCreationPage 
{
	WebDriver driver;
	public New_CustomerCreationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text() = 'New Customer']")
	WebElement newcustomer;
	@FindBy(xpath = "//input[@name='name']")
	WebElement customername;
	@FindBy(xpath = "(//input[@name='rad1'])[1]")
	WebElement gender;
	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement Address;
	@FindBy(xpath = "//input[@name='dob']")
	WebElement dob;
	
	public void clickonNewCustomerLink()
	{
		newcustomer.click();
	}

	public void enterCustomerName(String name)
	{
		customername.sendKeys(name);
	}
	public void selectGender()
	{
		gender.click();
	}
	public void enterAddress(String address)
	{
		Address.sendKeys(address);
	}
	public void enterdob(String date_birth)
	{
		dob.sendKeys(date_birth);
	}
}
