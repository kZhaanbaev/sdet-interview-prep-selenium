import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//Question: When do we use findElement() and findElements()?

public class _18 extends _001{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io");
        sleep(2000);

        //difference in returned elements
        driver.findElement(By.className("navbar-brand"));
//        List<WebElement> elements = driver.findElements(By.className("navbar-brand"));

        //difference when element is not present
//        driver.findElement(By.className("wrong-name"));
//        List<WebElement> elements2 = driver.findElements(By.className("wrong-name"));

        sleep(2000);
        driver.close();
    }
}
