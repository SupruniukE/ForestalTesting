import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDriverSeleniumTest {

    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup(){
        driver = new ChromeDriver();
    }

    @Test
    public void OrderSiryonBikeTest() {
        driver.get("https://forestal.com/en/home");
        WebElement cookieButton =  driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[1]/button[1]"));
        cookieButton.click();
        WebElement siryonButton =  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/header/div/nav[1]/ul/li[4]/a"));
        siryonButton.click();
        WebElement orderButton = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div/a"));
        orderButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div/ul/li[4]")));
        WebElement editionOneButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div/ul/li[4]"));
        editionOneButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div/button")));
        WebElement confirmBuildKitButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div/button"));
        confirmBuildKitButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div/div[2]/div[1]/div[3]/div/div[2]/div/ul/li[1]")));
        WebElement regularButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div/div[2]/div[1]/div[3]/div/div[2]/div/ul/li[1]"));
        regularButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div/div[2]/div[1]/div[3]/div/div[2]/button")));
        WebElement confirmBrakeButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div/div[2]/div[1]/div[3]/div/div[2]/button"));
        confirmBrakeButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"group-1\"]/ul/li")));
        WebElement polarLightsButton = driver.findElement(By.xpath("//*[@id=\"group-1\"]/ul/li"));
        polarLightsButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div/div[2]/div[1]/div[4]/div/div[2]/button")));
        WebElement confirmColourButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div/div[2]/div[1]/div[4]/div/div[2]/button"));
        confirmColourButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div/div[2]/div[1]/div[5]/div/div[2]/ul/li[1]")));
        WebElement extraLargeButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div/div[2]/div[1]/div[5]/div/div[2]/ul/li[1]"));
        extraLargeButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div/div[2]/div[1]/div[5]/div/div[2]/button")));
        WebElement confirmSizeButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div/div[2]/div[1]/div[5]/div/div[2]/button"));
        confirmSizeButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div/div[2]/div[2]/div/label/span[1]")));
        WebElement checkboxButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div/div[2]/div[2]/div/label/span[1]"));
        checkboxButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[2]/div[4]/div/div/div[2]/a")));
        WebElement addToBagButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[4]/div/div/div[2]/a"));
        addToBagButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/header/div/nav[2]/ul/li[1]/a/div")));
        WebElement itemsInBag = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/header/div/nav[2]/ul/li[1]/a/div"));
        System.out.println("Number of elements in bag: " + itemsInBag.getText());

        Assert.assertEquals(itemsInBag.getText(), "1", "Search results are empty!");
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown(){
        driver.quit();
        driver = null;
    }
}
