import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Question: What are the different types of navigation commands?

public class _28 extends _001{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/actionclass");
        sleep(2000);

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//button[text()='Hover Over for the tooltip']"))).perform();

        sleep(2000);
        driver.close();
    }
}
