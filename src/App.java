
// hello this is my project layout and dependencies we have imported the dependencies
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

// my main function
public class App {
    // sleep function for the waiting the component to get loaded
    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Set the interrupt flag again
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "home/pur2/Downloads/chromedriver-linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        // website link which we need to automate
        driver.get("https://www.trukky.com/door-to-door-goods-delivery");

        // 1. Check it is landing on the correct page
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.equals("Goods Delivery, Door to Door Goods Transport Service @ Trukky")) {
            System.out.println("Correct page");
        }

        // 2. Print the URL and Title of the Page

        System.out.println("Page URL is: " + driver.getCurrentUrl());
        System.out.println("Page Title is: " + driver.getTitle());

        // 3. Enter the Pickup City-Hyderabad
        // Find the pickup city input field by class name and enter 'Hyderabad'

        sleep(5000);
        driver.findElement(By.cssSelector("input[placeholder='Enter pickup city']")).sendKeys("Hyderabad");
        driver.findElement(By.cssSelector("div.recentSearch ul li:nth-child(1)")).click();
        sleep(4000);
        driver.findElement(By.cssSelector("input[placeholder='Enter drop city']")).sendKeys("Delhi");
        driver.findElement(By.cssSelector("div.recentSearch ul li:nth-child(1)")).click();

        sleep(1000);
        driver.findElement(By.cssSelector("[type='submit']")).click();

        if (actualTitle.equals("Goods Delivery, Door to Door Goods Transport Service @ Trukky")) {

            sleep(4000);
            WebElement personalOption = driver.findElement(By.xpath("//span[text()='Personal']"));
            personalOption.click();
            sleep(3000);
            WebElement firstLiElement = driver.findElement(By.cssSelector("ul.jsx-665002787 li.jsx-665002787"));
            firstLiElement.click();
            sleep(3000);
            WebElement addButton = driver.findElement(By.cssSelector(".jsx-1905266029.btn.primary"));
            addButton.click();
            sleep(2000);
            WebElement selectElement = driver.findElement(By.cssSelector("select.jsx-1905266029"));
            selectElement.click();
            sleep(2000);
            WebElement windowACOption = driver.findElement(By.xpath("//option[text()='Window AC']"));
            windowACOption.click();
            WebElement inputElement = driver.findElement(By.cssSelector("input.jsx-3306650702.inputField"));
            inputElement.sendKeys("2");
            WebElement buttonElement = driver.findElement(By.cssSelector("button.jsx-1905266029.nextBtn"));
            sleep(1000);
            buttonElement.click();
            sleep(1000);
            WebElement buttonElement2 = driver.findElement(By.xpath("//button[@class='btn ghost']"));
            buttonElement2.click();

            sleep(3000);

            // Wait for the element to be clickable and then click it
            WebElement button = driver
                    .findElement(By.xpath("//button[@type='submit' and contains(@class, 'btn primary')]"));
            button.click();
            sleep(2000);
            WebElement buttondate = driver.findElement(
                    By.xpath("//button[@class='react-calendar__tile react-calendar__month-view__days__day'][21]"));
            buttondate.click();

            WebElement nxtbutton = driver
                    .findElement(By.xpath("//button[@type='submit' and contains(@class, 'btn primary')]"));
            nxtbutton.click();
            sleep(2000);
            WebElement inputField = driver
                    .findElement(By.xpath("//input[@type='tel' and contains(@class, 'jsx-3306650702 inputField')]"));
            inputField.clear();
            inputField.sendKeys("8259053265");
            WebElement getprice = driver
                    .findElement(By.xpath("(//button[@type='submit' and contains(@class, 'btn primary')])[2]"));
            getprice.click();
            sleep(150000);
            WebElement otpnxt = driver.findElement(By.xpath("//button[contains(@class, 'jsx-1905266029 nextBtn')]"));
            // after entering the otp
            otpnxt.click();
        } else {
            // if it is incorrect site then simple print the wrong title
            System.out.println("Landing on the wrong page. Actual title: " + actualTitle);
        }
        sleep(2000);
        driver.quit();
    }
}

// so lets try the demo

// i am sorry but i was unable to read the otp and do the furthur tasks

// i appologies and i would try to learn more details in future