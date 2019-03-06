package homework;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AccountTest {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
       // System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php?controller=authentication");
        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("sergs88@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("261288");
        driver.findElement(By.id("SubmitLogin")).click();
    }
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void AccountTest_ORDER_HISTORY() {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a")).click();
    }

    @Test
    public void AccountTest_MY_CREDIT_SLIPS() {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a")).click();
    }

    @Test
    public void AccountTest_MY_ADDRESSES() {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a")).click();
    }

    @Test
    public void AccountTest_MY_PERSONAL_INFORMATION() {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a")).click();
    }

    @Test
    public void AccountTest_MY_WISHLISTS() {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a")).click();
        driver.findElement(By.xpath("//*[@id=\"mywishlist\"]/ul/li[1]/a")).click();
    }

}




