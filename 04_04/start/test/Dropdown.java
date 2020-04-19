import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.sql.Driver;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("WebDriver.chrome.driver", "Users/RAM/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownButton = driver.findElement(By.id("dropdownMenuButton"));
        dropdownButton.click();

        WebElement autoComplete = driver.findElement(By.id("autocomplete"));
        autoComplete.click();


        driver.quit();
    }
}
