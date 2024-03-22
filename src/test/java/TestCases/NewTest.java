package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Page.Loginpage;
import Page.SearchHotel;

public class NewTest {
  @Test
  
  public void Program() {
	  WebDriver driver = new ChromeDriver();
	  System.out.println("This is code to be committed");
	  driver.get("https://adactinhotelapp.com/");
	  Loginpage lg= new Loginpage(driver);
	  lg.enterUsername("Harikabalusu");
	  lg.enterpassword("Amma@143");
	  lg.clicklogin();
	  SearchHotel sh=new SearchHotel(driver);
	  sh.location();
  }
}
