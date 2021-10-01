package one;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilize.ReusableSELMethods;

public class Demotorlogin {
public ChromeDriver driver;
@Given("Users oopens {string} browser and exe {string}")
public void users_oopens_browser_and_exe(String brw, String exe) {
	Object[] input= new Object[2];
	input[0]=brw;
	input[1]=exe;
	ReusableSELMethods.brlaunch(input);
}

@Given("Users eenter {string} as link")
public void users_eenter_as_link(String url) {
	Object[] input1= new Object[1];
	input1[0]=url;
	ReusableSELMethods.openapp(input1);
    
}

@When ("^user enter (.+) as username$")
public void username(String uname) {
	Object[] input2= new Object[2];
	input2[0]="//*[@type='text']";
	input2[1]=uname;
	ReusableSELMethods.sendkey(input2);
}

@When ("^user enter (.+) as password$")
public void password(String pass) {
	Object[] input3= new Object[2];
	input3[0]="//*[@name='password']";
	input3[1]=pass;
	ReusableSELMethods.sendkey(input3);
	
}

@When("^user click on submit button$")
public void login() {
	Object[] input4= new Object[1];
	input4[0]="//*[@name='submit']";
	ReusableSELMethods.clk(input4);
	
}

@Then ("^validate Login functionality using Valid username and valid password$")
public void validate() throws InterruptedException {
    Thread.sleep(5000);
    Object[] input16= new Object[2];
	input16[0]="Login Successfully";
    input16[1]="//*[text()='Login Successfully']";
	ReusableSELMethods.valid(input16);
}
   
 @Then("^validate Login functionality using Invalid username and Invalid password$")
   public void validate_login_functionality_using_invalid_username_and_invalid_password() throws InterruptedException {
	 Thread.sleep(5000);
	    Object[] input16= new Object[2];
		input16[0]="Login";
	    input16[1]="//*[text()='Login Successfully']";
		ReusableSELMethods.valid(input16);
	}
 @Then ("^Close the Brower$")
 public void close1() throws InterruptedException{
Thread.sleep(4000);
driver.close();
   }
      
   }

