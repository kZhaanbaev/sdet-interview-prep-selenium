import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Question: How to select value in a dropdown?

public class _20 extends _001{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/selectclass");

        //1. Create an object from Select class
        Select select = new Select(driver.findElement(By.className("custom-select")));

        //3 ways to select an element:
        select.selectByVisibleText("One");
//        select.selectByIndex(2);
//        select.selectByValue("Three");



        sleep(2000);
        driver.close();
    }
}
