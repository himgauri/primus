package one;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Primuslogin {
	public ChromeDriver driver;
	@Given("User opens {string} browser and exe {string}")
	public void brlaunch(String br, String exe) {
	   System.setProperty(br, exe);
	   driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   
	}

	@Given("User enter {string} as link")
	public void url(String urlname) {
	   driver.get(urlname);
	}

	@When ("^user enter (.+) as username$")
	public void username(String name) {
		 driver.findElementByXPath("//*[@name='txtuId']").sendKeys(name);
	}

	@When ("^user enter (.+) as password$")
	public void password(String pass) {
		driver.findElementByXPath("//*[@name='txtPword']").sendKeys(pass);
	}

	@When("^user click on login button$")
	public void user_click_on_submit_button() {
	    driver.findElementByXPath("//*[@name='login']").click();
	}
	
@Then ("^validate Login functionality using Valid username and valid password$")
	public void validate() throws InterruptedException {
	   try{ Thread.sleep(5000);
	    String given= "Welcome to Admin";
	    String actual=driver.findElementByXPath("//font[@size='3']").getText();
	    if(given.equals(actual))
	    {
	    	System.out.println("Test case Pass");
	    }else
	    {
	    	System.out.println("Test case Fail");
	    }}
	   catch(Exception e){
		   System.out.println("Test case Fail");
	   }
}     
     @Then("^validate Login functionality using Invalid username and Invalid password$")
       public void validate_login_functionality_using_invalid_username_and_invalid_password() {
    	   try{ Thread.sleep(5000);
   	    String given= "Welcome to Admin";
   	    String actual=driver.findElementByXPath("//font[@size='3']").getText();
   	    if(given.equals(actual))
   	    {
   	    	System.out.println("Test case Fail");
   	    }else
   	    {
   	    	System.out.println("Test case Pass");
   	    }}
   	   catch(Exception e){
   		   System.out.println("Test case Pass");
   	   }
   }       
     @Then ("^Close the Brower$")
     public void close1() throws InterruptedException{
   Thread.sleep(4000);
   driver.close();
       }
          
       }

