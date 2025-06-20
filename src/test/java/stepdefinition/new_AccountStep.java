package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.Login_Guru99page;
import pagefactory.New_AccountCreationPage;
import utilities.BaseClass;

public class new_AccountStep extends BaseClass{
	//WebDriver driver = BaseClass.initalizeDriver();
	New_AccountCreationPage accountcreate = new New_AccountCreationPage(driver);
    
	
	@Given("the user clicks on the new account link in the application guru99")
	public void the_user_clicks_on_the_new_account_link_in_the_application_guru99() throws InterruptedException {
		accountcreate.clickonAccountLink();
	}

	@Given("user enters the customer id in guru99 application as {string}")
	public void user_enters_the_customer_id_in_guru99_application_as(String customer_id) {
		accountcreate.entercustomerid(customer_id);
	}

	@Given("user selects the account type in the page")
	public void user_selects_the_account_type_in_the_page() {
		accountcreate.selectAccType();
	}

	@Given("user enter intial deposite as {string}")
	public void user_enter_intial_deposite_as(String intial_deposite) {
		accountcreate.enterIntialDeposite(intial_deposite);

}
}
