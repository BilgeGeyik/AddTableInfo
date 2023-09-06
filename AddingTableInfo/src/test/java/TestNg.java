import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {

    @BeforeTest
    public void succsesLoadPageTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

        System.out.println("Bu başarılı sayfa yükleme testidir.");
    }

    @BeforeTest
    public void failLoadPageTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

        System.out.println("Bu başarısız sayfa yükleme testidir.");
    }

    @Test
    public void succesGoToNextPageTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

        WebElement firstClick = driver.findElement(By.cssSelector("div[class='category-cards'] div:nth-child(1) div:nth-child(1) div:nth-child(1)"));
        firstClick.click();

        System.out.println("Bu başarılı yeni sayfa  yönlenme testidir.");
    }


    @Test
    public void succesAddTableInfoTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

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


        System.out.println("Bu başarılı tablo bilgi ekleme testidir.");
    }

    @AfterTest
    public  void QuitPageTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.quit();
    }


}
