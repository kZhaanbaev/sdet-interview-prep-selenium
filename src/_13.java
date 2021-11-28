import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Question: How to click on a hyperlink in Selenium?
//Question: What is the major difference between driver.close() and driver.quit()?

public class _13 extends _001{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/");

        sleep(2000);
        driver.findElement(By.linkText("PHP Travels")).click();

        sleep(2000);
        driver.close();
//        driver.quit();
    }
}
