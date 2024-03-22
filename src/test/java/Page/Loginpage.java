package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	WebDriver  driver;
    By Uname=By.id("username");
    By Upassword=By.id("password");
    By Ulogin = By.id("login");


 
public Loginpage(WebDriver driver) {
		this.driver = driver;
	}
public void enterUsername(String username) {
	driver.findElement(Uname).sendKeys(username);
}
public void enterpassword(String pass) {
	driver.findElement(Upassword).sendKeys(pass);
}
public void clicklogin() {
	driver.findElement(Ulogin).click();
 
}

}


