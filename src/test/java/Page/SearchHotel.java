package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel {
	WebDriver  driver;
	By hloc = By.id("location");
	By hotel=By.id("hotels");
	By room=By.id("room_type");
	By no_of_rooms=By.id("room_nos");
	By adults=By.id("adult_room");
	By in_date=By.id("datepick_in");
	By out_date=By.id("datepick_out");
	By child=By.id("child_room");
public SearchHotel(WebDriver driver) {
		this.driver = driver;
	}
	public void location() {
		WebElement location_dropdown = driver.findElement(hloc);
		Select loc_dropdown = new Select(location_dropdown);
		loc_dropdown.selectByVisibleText("London");
		
	}
	public void hotel_select() {
		WebElement hotel_dropdown=driver.findElement(hotel);
		Select h_dropdown=new Select(hotel_dropdown);
		h_dropdown.selectByVisibleText("Hotel Sunshine");
		
		
		
	}
}
