import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class startTest {
    @Test
    public void progressBarTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\bybal\\GEMS\\AccordionTest\\AccordionTest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/progress-bar");
        // Нажать на кнопку “Start”
        WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));
        startButton.click();

        // Дождаться, когда прогресс бар будет заполнен на 100%
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement progressBar = driver.findElement(By.className("progress-bar"));
        wait.until(ExpectedConditions.attributeToBe(progressBar, "aria-valuenow", "100"));

        // Закрыть браузер
        driver.quit();
    }
}