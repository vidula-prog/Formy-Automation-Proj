import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("WebDriver.chrome.driver", "Users/RAM/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newtab = driver.findElement(By.id("new-tab-button"))
                newtab.click();
        java.lang.String OldHandler = driver.getWindowHandle();
        for (java.lang.String handle1: driver.getWindowHandles()) {
            driver.switchTo().window("handle1");
        }
        driver.switchTo().window("OldHandler");



        driver.quit();
    }
}
