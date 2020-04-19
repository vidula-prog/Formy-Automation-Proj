import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Checkboxes {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "Users/RAM/Downloads/chromedriver");
        webdriver Driver = new ChromeDriver();

        Driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement checkBox1 = Driver.findElement(By.id("checkbox-1"));
        checkBox1.click();

        WebElement checkBox2 = Driver.findElement(By.cssSelector("Input[value = 'checkbox-2']"));
        checkBox2.click();

        WebElement checkBox3 = Driver.findElement(By.xpath("/html/body/div/div[3]/div/div"));
        checkBox3.click();

        Driver.quit();

    }
}
