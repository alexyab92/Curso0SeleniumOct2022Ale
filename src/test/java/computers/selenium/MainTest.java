package computers.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainTest {

    @Test
    public void Test() {
        // Linear Scripting
        /*
         * Locator:
         * ID
         * Name
         * Link Text
         * Partial Link Text
         * Class name
         * Tag Name
         * CSS Path
         * Xpath (Absoluto y Relativo)
         */

        /* Assertion
         * 1- Hard assertion
         * 2- Soft assertion
         */

        // Step 1: Launch browser
        ChromeOptions chromeOpt = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOpt);

        driver.get("https://computer-database.gatling.io/computers");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchbox")));

        // Step 2: Insert text into searchbox
        driver.findElement(By.id("searchbox")).sendKeys("ACE");

        // Step 3: Click on "Filter by Name"
        driver.findElement(By.id("searchsubmit")).click();

        // Step 4: Validate the text in the results is displayed
        String actualComputerName = driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).getText();
        Assert.assertEquals(actualComputerName, "ACE");
    }

    @Test
    public void Test1(){

        ChromeOptions chromeOpt = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOpt);

        driver.get("https://computer-database.gatling.io/computers");

        driver.findElement(By.id("add")).click();
        driver.findElement(By.id("name")).sendKeys("Ale");
        driver.findElement(By.id("introduced")).sendKeys("2021-10-10");
        driver.findElement(By.id("discontinued")).sendKeys("2022-10-10");

        Select company = new Select(driver.findElement(By.id("company")));
        company.selectByVisibleText("IBM");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }
}
