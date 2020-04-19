import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("WebDriver.chrome.driver", "Users/RAM/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("04/13/2020");
        datePicker.sendKeys(Keys.RETURN);

        driver.quit();
    }
}