import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Question: What are the different types of navigation commands?

public class _26 extends _001{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/iframes");

        //select by id
        driver.switchTo().frame("note");

        sleep(2000);
        driver.close();
    }
}
