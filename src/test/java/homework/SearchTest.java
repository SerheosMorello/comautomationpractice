package homework;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.containsString;

public class SearchTest {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        // System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

    }
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void SearchTest(){
        driver.findElement(By.id("search_query_top")).clear();
        driver.findElement(By.id("search_query_top")).sendKeys("Printed Summer Dress");
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();

        WebElement str = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a"));
        Assert.assertThat(str.getText() , containsString("Printed Summer Dress"));

    }
}
