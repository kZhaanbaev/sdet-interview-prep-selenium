import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//How do I launch the browser using WebDriver?
public class _11 extends _001{
    public static void main(String[] args) {
        /*
        If there is no additional libraries like maven are used,
        we need to connect selenium packages manually.
        File -> Project Structure -> Modules -> + -> JARs or Directories
         */

        //setting up the driver to use chrome browser
        System.setProperty("webdriver.chrome.driver", driverPath);

        //creating an object of the chrome driver to launch a browser
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

    }
}
