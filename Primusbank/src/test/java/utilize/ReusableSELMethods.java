package utilize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReusableSELMethods {
	public static WebDriver driver=null;
	public static String[]inputparameters;
	//To launch the browser
public static void brlaunch(Object[] inputparameters)
{ 
	String Brname1= (String) inputparameters[0];
	String webDriverExePath=(String) inputparameters[1];
	if(Brname1.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", webDriverExePath);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}else if(Brname1.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", webDriverExePath);
		driver= new ChromeDriver();
		driver.manage().window().maximize();}
}                                           
//to open application
public static void  openapp(Object[] inputparameters){
	String url1= (String) inputparameters[0];
	driver.get(url1);
}
//to Sendkeys
public static void sendkey(Object[] inputparameters){
	String Xpath=(String) inputparameters[0];
	String put_text=(String) inputparameters[1];
	WebElement total=driver.findElement(By.xpath(Xpath));
	total.clear();
	total.sendKeys(put_text);}
//To click
public static void clk(Object[] inputparameters){
	String Xpath=(String) inputparameters[0];
	WebElement total=driver.findElement(By.xpath(Xpath));
	total.click();}
//to select 
public static void select(Object[] inputparameters){
	String Xpath=(String) inputparameters[0];
	String value1= (String) inputparameters[1];
	Select set= new Select(driver.findElement(By.xpath(Xpath)));
	set.selectByVisibleText(value1);
}
//To validate
public static void valid(Object[] inputparameters){
	 String given= (String) inputparameters[0];
	    String exact=(String) inputparameters[1];
	    String total= driver.findElement(By.xpath(exact)).getText();
	    if(total.equals(given))
	    {
	    	System.out.println("Test case pass");
	    }else
	    {
	    	System.out.println("Test case fail");
	    }
	
	 }
//to close
public static void close(){
	
	driver.close();
}
public static void main(String[] args) {
	Object[] input= new Object[2];
	input[0]="Chrome";
	input[1]="C:\\Software\\automationsupport\\chromedriver.exe";
	ReusableSELMethods.brlaunch(input);
	
	Object[] input1= new Object[1];
	input1[0]="http://demo.guru99.com/test/newtours/";
	ReusableSELMethods.openapp(input1);
	
	Object[] input2= new Object[2];
	input2[0]="//*[@type='text']";
	input2[1]="Admin";
	ReusableSELMethods.sendkey(input2);
	
	Object[] input3= new Object[2];
	input3[0]="//*[@name='password']";
	input3[1]="Admin";
	ReusableSELMethods.sendkey(input3);
	
	Object[] input4= new Object[1];
	input4[0]="//*[@name='submit']";
	ReusableSELMethods.clk(input4);
	

	Object[] input5= new Object[1];
	input5[0]="//*[text()='REGISTER']";
	ReusableSELMethods.clk(input5);
	
	Object[] input6= new Object[2];
	input6[0]="//*[@name='firstName']";
	input6[1]="gauri";
	ReusableSELMethods.sendkey(input6);
	//lastname
	Object[] input7= new Object[2];
	input7[0]="//*[@name='lastName']";
	input7[1]="date";
	ReusableSELMethods.sendkey(input7);
	
//phone
	Object[] input8= new Object[2];
	input8[0]="//*[@name='phone']";
	input8[1]="9823044198";
	ReusableSELMethods.sendkey(input8);
	
	//email
	Object[] input9= new Object[2];
	input9[0]="//*[@name='userName']";
	input9[1]="gauri2010@gmail.com";
	ReusableSELMethods.sendkey(input9);
		
	//adress
	Object[] input10= new Object[2];
	input10[0]="//*[@name='address1']";
	input10[1]="midc";
	ReusableSELMethods.sendkey(input10);
	
	//city
	Object[] input11= new Object[2];
	input11[0]="//*[@name='city']";
	input11[1]="pune";
	ReusableSELMethods.sendkey(input11);
	
	//state
	Object[] input12= new Object[2];
	input12[0]="//*[@name='state']";
	input12[1]="Maharashtra";
	ReusableSELMethods.sendkey(input12);
	
	//zipcode
	Object[] input13= new Object[2];
	input13[0]="//*[@name='postalCode']";
    input13[1]="412207";
	ReusableSELMethods.sendkey(input13);
		
		//select country
	Object[] input14= new Object[2];
	input14[0]="//*[@name='country']";
    input14[1]="INDIA";
	ReusableSELMethods.select(input14);
	
	//submit 
	Object[] input15= new Object[1];
	input15[0]="//*[@name='submit']";
    ReusableSELMethods.clk(input15);
	
	//to validate
	Object[] input16= new Object[2];
	input16[0]="Note: Your user name is .";
    input16[1]="//*[text()=' Note: Your user name is .']";
	ReusableSELMethods.valid(input16);
		
	
	ReusableSELMethods.close();
}
}


