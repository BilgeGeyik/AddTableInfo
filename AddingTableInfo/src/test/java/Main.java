import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        //SLIP PAGE
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,300)","");
        
        //TO CLICK "ELEMENT"
        WebElement firstClick = driver.findElement(By.cssSelector("div[class='category-cards'] div:nth-child(1) div:nth-child(1) div:nth-child(1)"));
        firstClick.click();


        //TO CLICK "Web Tables"
        WebElement table = driver.findElement(By.cssSelector("body > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(4)"));
        table.click();

        //TO CLICK AN ADD BUTTON
        WebElement addClick = driver.findElement(By.id("addNewRecordButton"));
        addClick.click();

        //ADDING A INFO IN TABLE
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.click();
        firstName.sendKeys("Bilge");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.click();
        lastName.sendKeys("Geyik");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.click();
        email.sendKeys("b@info.com");

        WebElement age= driver.findElement(By.id("age"));
        age.click();
        age.sendKeys("25");

        WebElement salary= driver.findElement(By.id("salary"));
        salary.click();
        salary.sendKeys("1000");

        WebElement department= driver.findElement(By.id("department"));
        department.click();
        department.sendKeys("Software Engineer");

        WebElement submit= driver.findElement(By.id("submit"));
        submit.click();

        //SEE THE RESULT 6 SECOND
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //QUIT THE BROWSER
        driver.quit();


    }
}
