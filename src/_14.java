import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Question 1: How can we get a text of a web element?
//Question 2: How to assert the title of a webpage?

public class _14 extends _001{
    //solve this before executing main method to import Junit
//    @Test
//    public void test (){
//
//    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/home");
        sleep(2000);

        //1
        System.out.println(driver.findElement(By.id("title")).getText());

        //2
//        Assert.assertEquals(driver.getTitle(), "TLA Automation");

        sleep(2000);
        driver.close();
    }


}
