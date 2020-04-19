import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.alert;


public class SwitchToAlert {
    public static void main(String[] args) {

        System.setProperty("WebDriver.chrome.driver", "Users/RAM/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();

        driver.switchTo().alert();
        alertButton.accept();

        driver.quit();
    }
}
