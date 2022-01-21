package object_Repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements {
	//Registration Page Elements
	
		public static WebElement login_Button(WebDriver driver) {
			
			return driver.findElement(By.linkText("Login"));

		}	
		public static  WebElement registration_Button(WebDriver driver) {
			return driver.findElement(By.linkText("Register"));		

		}	
		
		public static WebElement first_Name(WebDriver driver) {
			
			return driver.findElement(By.id("inputFirstName"));
		
		}	
	    public static WebElement last_Name(WebDriver driver) {
			
			return driver.findElement(By.id("inputLastName"));
		
		}	
		
		public static  WebElement email_ID(WebDriver driver) {
			return driver.findElement(By.id("inputEmail"));

		}		 
		public static WebElement contry_code(WebDriver driver) {
			String searchText = "+91";
	        WebElement dropdown = driver.findElement(By.xpath("//div[@class=\"selected-dial-code\"]"));
	        dropdown.click();
	        WebDriverWait wait = new WebDriverWait(driver,30);
	        List<WebElement> options = dropdown.findElements(By.xpath("//span[@class=\"dial-code\"]"));
	        for (WebElement option : options)
	        {        	
	    		if(option.getText().contains(searchText))    
	            {    	                	
	    	    	System.out.println(option.getSize());
	                option.click(); 
	                break;
	            }
	        }
			return dropdown;
		
		}
		public static WebElement phone(WebDriver driver) {
			return driver.findElement(By.id("inputPhone"));

		}
		public static WebElement company_Name(WebDriver driver) {
			return driver.findElement(By.id("inputCompanyName"));

		}
		public static WebElement address1(WebDriver driver) {
			return driver.findElement(By.id("inputAddress1"));

		}
		public static WebElement address2(WebDriver driver) {
			return driver.findElement(By.id("inputAddress2"));

		}
		public static  WebElement city(WebDriver driver) {
			return driver.findElement(By.id("inputCity"));

		}
		public static  WebElement state(WebDriver driver) {
			return driver.findElement(By.id("stateinput"));

		}
		public static WebElement postalcode(WebDriver driver) {
			return driver.findElement(By.id("inputPostcode"));

		}
		public static WebElement country(WebDriver driver) {
			return driver.findElement(By.id("inputCountry"));

		}
		public static WebElement mobNo(WebDriver driver) {
			return driver.findElement(By.id("customfield2"));

		}
		public static  WebElement password1(WebDriver driver) {
			return driver.findElement(By.id("inputNewPassword1"));

		}
		public static WebElement password2(WebDriver driver) {
			return driver.findElement(By.id("inputNewPassword2"));

		}
		public static WebElement recive_Email(WebDriver driver) {		
			return driver.findElement(By.xpath("//span[@class=\"switch__container\"]"));
		}

		public static WebElement register(WebDriver driver) {
	        return driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		}
		
	//=======================================================================================
		
		
		//Login page Elements using PageFactory layer concept
		
		@FindBy(id="inputEmail")
		public static WebElement inputEmail;
		
		@FindBy(id="inputPassword")
		public static WebElement inputPassword;
		
		@FindBy(xpath="//ins[@class=\"iCheck-helper\"]")
		public static WebElement rememberMe;
		
		@FindBy(id="login")
		public static WebElement clickLogin;
		
		
		/*public static WebElement inputEmail(WebDriver driver) {
			return driver.findElement(By.id("inputEmail"));
			}
		public static WebElement inputPassword(WebDriver driver) {
			 return driver.findElement(By.id("inputPassword"));
			}
		public static WebElement rememberMe(WebDriver driver) {
		 return driver.findElement(By.xpath("//ins[@class=\"iCheck-helper\"]"));
		}
		public static WebElement clickLogin(WebDriver driver) {
			 return driver.findElement(By.id("login"));
			}
	*/	
		

}
