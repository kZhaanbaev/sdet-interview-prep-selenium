import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Question: How can you find if an element in displayed on the screen?

public class _15 extends _001{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/synchronization");
        sleep(2000);

        System.out.println(driver.findElement(By.id("text-display")).isDisplayed());
        System.out.println(driver.findElement(By.className("btn-warning")).isEnabled());
        System.out.println(driver.findElement(By.id("text-display")).isSelected());

        sleep(2000);
        driver.close();
    }
}
