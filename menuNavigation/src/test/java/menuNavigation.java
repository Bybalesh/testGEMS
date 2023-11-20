import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class menuNavigation {
    @Test
    public void testAccordionTextExtraction() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\bybal\\GEMS\\AccordionTest\\AccordionTest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/menu");
        WebElement mainItem2 = driver.findElement(By.xpath("//*[text() = 'Main Item 2']"));
        mainItem2.click();
        Thread.sleep(3000);
        // Находим элемент "SUB SUB LIST" и кликаем на него
        WebElement subSubList = driver.findElement(By.xpath("//*[text() ='SUB SUB LIST »']"));
        subSubList.click();
        Thread.sleep(3000);
        WebElement subSubItem2 = driver.findElement(By.xpath("//*[text() ='Sub Sub Item 2']"));
        subSubItem2.click();
        Thread.sleep(3000);
        driver.quit();
    }
}