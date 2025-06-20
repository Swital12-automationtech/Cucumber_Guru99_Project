package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.Login_Guru99page;
import pagefactory.New_CustomerCreationPage;
import utilities.BaseClass;

public class stepDefinition extends BaseClass {
	
	WebDriver driver = BaseClass.initalizeDriver();
	Login_Guru99page login = new Login_Guru99page(driver);
	New_CustomerCreationPage newcust = new New_CustomerCreationPage(driver);
	
	@Given("User opens the demo application of guru99")
	public void user_opens_the_demo_application_of_guru99() {
		System.out.println("Application open");
	}

	@Given("the user will enter his username field as {string}")
	public void the_user_will_enter_his_username_field_as(String username) {
	    login.enterUsername(username);
	}

	@Given("the user will enter his password field as {string}")
	public void the_user_will_enter_his_password_field_as(String password) {
	   login.enterPassword(password);
	}

	@When("user will click on the login button of the application after the fields")
	public void user_will_click_on_the_login_button_of_the_application_after_the_fields() {
	   login.clickonLogin();
	}

	@Then("user will be navigated to the demo application of guru99")
	public void user_will_be_navigated_to_the_demo_application_of_guru99() {
	    System.out.println(gettitle());
	}

	@Given("the user clicks on the new customer link in the application guru99")
	public void the_user_clicks_on_the_new_customer_link_in_the_application_guru99() {
	    newcust.clickonNewCustomerLink();
	}

	@Given("user enters the customer name in guru99 application as {string}")
	public void user_enters_the_customer_name_in_guru99_application_as(String customer_name) {
	    newcust.enterCustomerName(customer_name);
	}

	@Given("user selects the gender in the page")
	public void user_selects_the_gender_in_the_page() {
	    newcust.selectGender();
	}

	@Given("user eters the date of birth in the field as {string}")
	public void user_eters_the_date_of_birth_in_the_field_as(String date_birth) {
	   newcust.enterdob(date_birth);
	}
	
	@Given("user enters the address in guru99 application as {string}")
	public void user_enters_the_address_in_guru99_application_as(String address) {
	    newcust.enterAddress(address);
	}

}
