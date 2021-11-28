import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

//Question: What are the different types of navigation commands?

public class _31 extends _001{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/home");
        driver.findElement(By.linkText("Internet")).click();

        System.out.println(driver.getTitle());

        //capturing current window's id
        String currentWindowID = driver.getWindowHandle();
        System.out.println(currentWindowID);

        //capturing all window id's
        Set<String> allWindowIDs = driver.getWindowHandles();

        for(String windowID: allWindowIDs){
            if(!windowID.equalsIgnoreCase(driver.getWindowHandle())){
                driver.switchTo().window(windowID);
                System.out.println(windowID);
                System.out.println(driver.getTitle());
            }
        }

        sleep(2000);
        driver.quit();
    }
}
