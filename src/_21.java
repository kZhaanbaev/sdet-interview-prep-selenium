import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class _21 extends _001{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://automation.techleadacademy.io/#/");

        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("some id"))));

        //fluent wait
        FluentWait fluentWait = new FluentWait(driver);
        fluentWait.withTimeout(Duration.ofSeconds(10));
        fluentWait.pollingEvery(Duration.ofSeconds(2));
        fluentWait.ignoring(NoSuchElementException.class);
        fluentWait.withMessage("---------this is a custom message for failures-------");

        fluentWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("some id"))));

        sleep(2000);
        driver.close();
    }
}
