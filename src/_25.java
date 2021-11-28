import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Question: What are the different types of navigation commands?

public class _25 extends _001{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(400, 600));

        driver.get("https://google.com");

        sleep(2000);
        driver.close();
    }
}
