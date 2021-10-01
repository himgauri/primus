package one;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilize.ReusableSELMethods;

public class Registrationdemotour {
	public  ChromeDriver driver;
	@Given("Users opens {string} browser and exe {string}")
	public void users_opens_browser_and_exe(String br, String ex) {
		Object[] input= new Object[2];
		input[0]=br;
		input[1]=ex;
		ReusableSELMethods.brlaunch(input);
	}

	@Given("Users enters url as {string}")
	public void users_enters_url_as(String url) {
		Object[] input1= new Object[1];
		input1[0]=url;
		ReusableSELMethods.openapp(input1);
	}

	@When("user click on Register")
	public void user_click_on_register() {
		Object[] input5= new Object[1];
		input5[0]="//*[text()='REGISTER']";
		ReusableSELMethods.clk(input5);
	}

	@When("user enter {string} as First Name")
	public void user_enter_as_first_name(String fname) {
		Object[] input6= new Object[2];
		input6[0]="//*[@name='firstName']";
		input6[1]=fname;
		ReusableSELMethods.sendkey(input6);
	}

	@When("user enter {string} as Last Name")
	public void user_enter_as_last_name(String lname) {
		Object[] input7= new Object[2];
		input7[0]="//*[@name='lastName']";
		input7[1]=lname;
		ReusableSELMethods.sendkey(input7);
		
	}

	@When("user enter {string} as phone")
	public void user_enter_as_phone(String pnum) {
		Object[] input8= new Object[2];
		input8[0]="//*[@name='phone']";
		input8[1]=pnum;
		ReusableSELMethods.sendkey(input8);
	}

	@When("user enter {string} as Email")
	public void user_enter_as_email(String id) {
		Object[] input9= new Object[2];
		input9[0]="//*[@name='userName']";
		input9[1]=id;
		ReusableSELMethods.sendkey(input9);
			
	}

	@When("user enter {string} as Adress")
	public void user_enter_as_adress(String addr) {
		Object[] input10= new Object[2];
		input10[0]="//*[@name='address1']";
		input10[1]=addr;
		ReusableSELMethods.sendkey(input10);
	}

	@When("user enter {string} as city")
	public void user_enter_as_city(String city) {
		Object[] input11= new Object[2];
		input11[0]="//*[@name='city']";
		input11[1]=city;
		ReusableSELMethods.sendkey(input11);
		
	}

	@When("user enter {string} as State")
	public void user_enter_as_state(String state) {
		Object[] input12= new Object[2];
		input12[0]="//*[@name='state']";
		input12[1]=state;
		ReusableSELMethods.sendkey(input12);
		
	}

	@When("user enter {string} as Postalcode")
	public void user_enter_as_postalcode(String pcode) {
		Object[] input13= new Object[2];
		input13[0]="//*[@name='postalCode']";
	    input13[1]=pcode;
		ReusableSELMethods.sendkey(input13);
		
	}

	@When("user select {string} as Country")
	public void user_select_as_country(String Country) {
		Object[] input14= new Object[2];
		input14[0]="//*[@name='country']";
	    input14[1]=Country;
		ReusableSELMethods.select(input14);
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		Object[] input15= new Object[1];
		input15[0]="//*[@name='submit']";
	    ReusableSELMethods.clk(input15);
	}

	@Then("validate Registration of new users with valid data")
	public void validate_registration_of_new_users_with_valid_data() {
		Object[] input16= new Object[2];
		input16[0]="Note: Your user name is .";
	    input16[1]="//*[text()=' Note: Your user name is .']";
		ReusableSELMethods.valid(input16);
	}
	@Then ("close the browser")
		public void closebr(){
		ReusableSELMethods.close();
	}
	


}
