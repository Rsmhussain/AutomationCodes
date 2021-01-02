import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Fir {

	public Fir() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[])
	{
		// Set the driver path
		  System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		  System.out.println("Chrome is opend");
		  WebDriver driver = new ChromeDriver();
		  
		  
		  //Lauch the talentx
		  driver.get("https://talentx.kgisl.com/");
		  //WebElement username=driver.findElement(By.id("Username")).sendKeys("sdaa");
		  //username.sendKeys("smhussain.r");
		  //driver.findElement(By.id("Password")).sendKeys("Rvt@1234567");;
		  WebElement login=driver.findElement(By.xpath("//*[@id='frmLogin']/fieldset/div[2]/button/span"));
		  login.click();
		  System.out.println("Sheik loged In");
		  
	}
}
