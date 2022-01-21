package Steps;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object_Repository.Elements;

public class LoginScrip {
	
	WebDriver driver;

	@Given("Open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() {
		System.setProperty("Webdriver.chrome.driver","E:\\Selenium 21\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("https://phptravels.org/login");
		driver.manage().window().maximize();
		driver.getTitle();
        //Thread.sleep(5000);  
	}

	@When("Enter {string} , {string} and click on login button")
	public void enter_and_click_on_login_button(String string, String string2) throws Throwable {
		 PageFactory.initElements(driver, Elements.class);
			Elements.inputEmail.sendKeys("khedkarasha18@gmail.com");
			Elements.inputPassword.sendKeys("Asha@123");
			Elements.rememberMe.click();
			((JavascriptExecutor)driver).executeScript("scroll(0,400)");

			Robot robot1=new Robot();
			Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rect=new Rectangle(sc_size);
			BufferedImage Source=robot1.createScreenCapture(rect);
			File destination=new File("A:\\php_screenshot\\Loginscreen.png");
			ImageIO.write(Source, "png", destination);

	        Thread.sleep(30000);	
	        WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
	}

	@Then("Success in login")
	public void success_in_login() throws Throwable {
		Elements.clickLogin.click();

		Robot robot2=new Robot();
		Dimension sc_size2=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect2=new Rectangle(sc_size2);
		BufferedImage Source2=robot2.createScreenCapture(rect2);
		File destination2=new File("A:\\php_screenshot\\clientscreen.png");
		ImageIO.write(Source2, "png", destination2);
		
		Thread.sleep(2000);
		driver.close();

	}
}
