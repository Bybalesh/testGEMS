import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.ArrayList;

public class AccordionTest {
    @Test
    public void testAccordionTextExtraction() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\bybal\\GEMS\\AccordionTest\\AccordionTest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/accordian");
        WebElement element = driver.findElement(By.xpath("//*[text() = 'Where does it come from?']"));
        element.click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#section2Content > p:nth-child(1)")));
        List<WebElement> firstHiddenElements = driver.findElements(By.cssSelector("#section2Content > p"));
        List<String> textList = new ArrayList<>();
        for (WebElement hiddenElement : firstHiddenElements) {
            textList.add(hiddenElement.getText());
        }

        WebElement secondElement = driver.findElement(By.xpath("//*[text() = 'Why do we use it?']"));
        secondElement.click();
        // Ожидаем видимости второго текстового блока
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#section3Content > p")));
        // Получаем текст из второго блока и добавляем его в список textList
        List<WebElement> secondHiddenElements = driver.findElements(By.cssSelector("#section3Content > p"));
        for (WebElement hiddenElement : secondHiddenElements) {
            textList.add(hiddenElement.getText());
        }
        for (String text : textList) {
            System.out.println(text);
        }
        driver.quit();
    }
}