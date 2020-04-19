import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver", "Users/RAM/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys( "1555 Vine Street, Pomona, Los Angeles, CA, USA");
        Thread.sleep(1000);


       WebElement autocompleteResult = driver.findElement(By.className("pac-matched"));
       autocompleteResult.click();



        driver.quit();
    }
}


