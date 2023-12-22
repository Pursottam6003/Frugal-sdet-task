
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/pur2/Downloads/chromedriver-linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.trukky.com/door-to-door-goods-delivery");

        // 1. Check it is landing on the correct page
        String title = driver.getTitle();
        System.out.println(title);
        if (title.equals("Goods Delivery, Door to Door Goods Transport Service @ Trukky")) {
            System.out.println("Correct page");
        } else

        {
            System.out.println("Incorrect page");
        }

        // // 2. Print the URL and Title of the Page
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        System.out.println("Page Title is: " + driver.getTitle());

        // 3. Enter the Pickup City-Hyderabad

        // Find the pickup city input field by class name and enter 'Hyderabad'

        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }

        driver.findElement(By.cssSelector("input[placeholder='Enter pickup city']")).sendKeys("Hyderabad");

        driver.findElement(By.cssSelector("div.recentSearch ul li:nth-child(1)")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }

        driver.findElement(By.cssSelector("input[placeholder='Enter drop city']")).sendKeys("Delhi");
        driver.findElement(By.cssSelector("div.recentSearch ul li:nth-child(1)")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }

        driver.findElement(By.cssSelector("[type='submit']")).click();

        // driver.findElement(By.cssSelector("div[.serviceDetails]")).click();
        // driver.findElements(By.cssSelector(
        // ".jsx-665002787.serviceOptions > li.jsx-665002787:nth-child(2) >
        // div.jsx-665002787.serviceDetails"));

        // driver.findElement(By.cssSelector("div.jsx-665002787.serviceDetails")).click();
        // driver.quit();

        // choose load services

        // to do
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }

        driver.findElement(By.cssSelector(".serviceDetails")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }

        // Click on Add material
        driver.findElement(By.cssSelector(".addMaterialContent > .btn")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }

        // Select a material from choose material dropdown-Window AC

    }
}