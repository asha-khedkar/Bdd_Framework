package Steps;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object_Repository.Elements;

public class RegistrationScript {
	WebDriver driver;

@Given("Open Chrome browser and url of the application")
public void open_Chrome_browser_and_url_of_the_application(){
	System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");
    		driver=new ChromeDriver();
	driver.get("https://phptravels.com/demo/");
	driver.manage().window().maximize();
	
}

@When("Enter all elements details")
public void enter_all_elements_details()  throws Throwable {
	String w1=driver.getTitle();
    Thread.sleep(5000);
	Elements.login_Button(driver).click();

	//move to the Tabbed window
	Set<String> windows=driver.getWindowHandles();
	
	Iterator<String> iter=windows.iterator();
	String window1=iter.next();
	String window2=iter.next();
    driver.switchTo().window(window2);
	String w2=driver.getTitle();
	
	
	//Get the Title of window
	System.out.println(w1);
	System.out.println(w2);	        
 		
	//get the session ID of window
	System.out.println(window1);
	System.out.println(window2);
				
	Elements.registration_Button(driver).click();
	Elements.first_Name(driver).sendKeys("Asha");
	Elements.last_Name(driver).sendKeys("khedkar");
	Elements.email_ID(driver).sendKeys("khedkarasha18@gmail.com");
	
	//clicking on dropdown and getting contry dial code
	Elements.contry_code(driver);
	
	Elements.phone(driver).sendKeys("9561601992");
	Elements.company_Name(driver).sendKeys("HCL");
	Elements.address1(driver).sendKeys("Magarpatta sez Entrance");
	Elements.address2(driver).sendKeys("Magarpatta City");
	Elements.city(driver).sendKeys("Pune");
	Elements.state(driver).sendKeys("Maharashtra");
	Elements.postalcode(driver).sendKeys("411028");
	Elements.country(driver).sendKeys("India");
	Elements.mobNo(driver).sendKeys("93091364");
	Elements.password1(driver).sendKeys("Asha@123");
	Elements.password2(driver).sendKeys("Asha@123");
	Elements.recive_Email(driver).click();	

	Robot robot1=new Robot();
	Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rect=new Rectangle(sc_size);
	BufferedImage Source=robot1.createScreenCapture(rect);
	File destination=new File("A:\\php_screenshot\\Registrationscreen.png");
	ImageIO.write(Source, "png", destination);

	((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
	//click on I am not Robot manually to handle recaptcha
    Thread.sleep(20000);
	
}

@Then("click on registration button")
public void click_on_registration_button() throws Throwable {
	Elements.register(driver).click();

	Thread.sleep(2000);
	driver.close();
}



}
