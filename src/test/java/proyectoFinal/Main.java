package proyectoFinal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Main {

    @Test
    public void Test(){
        ChromeOptions chromeOpt = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOpt);

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type ='submit']")).click();

        String dashboard = driver.findElement(By.xpath("//body/div/div/div[1]/header/div/div[1]/span/h6")).getText();
        Assert.assertEquals(dashboard, "Dashboard");

        System.out.println("User is logged successful");

        driver.findElement(By.xpath("//li[1]")).click();

        String admin = driver.findElement(By.xpath("//body/div/div/div[1]/header/div/div[1]/span/h6[1]")).getText();
        Assert.assertEquals(admin, "Admin");

        driver.findElement(By.xpath("//body/div/div/div[2]/div/div/div[2]/div/button")).click();

        driver.findElement(By.xpath("//form/div/div/div/div/div/div/div")).click();
        driver.findElement(By.xpath("//form/div/div/div/div/div/div/div/div[1]")).click();

       // Select userRole = new Select(driver.findElement(By.xpath("//form/div/div/div/div/div/div/div")));
        //userRole.selectByVisibleText("Admin");


    }
}
