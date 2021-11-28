
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//NOTE: import testNg library first
public class _22 extends _001{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        //verify is implemented using SoftAssert in Testng
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals(driver.getTitle(), "Googles");

        //hard assert
//        Assert.assertEquals(driver.getTitle(), "Googles");

        sleep(2000);
        driver.close();
    }
}
