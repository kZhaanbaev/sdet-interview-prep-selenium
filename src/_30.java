import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Question: What are the different types of navigation commands?

public class _30 extends _001{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        sleep(2000);

        driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
        sleep(2000);

        //set credentials
        String username = "admin";
        String password = "admin";

        //set new url that handles authentication
        String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
        //call the new url
        driver.get(URL);

        sleep(2000);
        driver.close();
    }
}
