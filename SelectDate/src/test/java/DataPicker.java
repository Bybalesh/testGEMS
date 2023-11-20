import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPicker {
    @Test
    public void DataPickerTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\bybal\\GEMS\\AccordionTest\\AccordionTest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");

        WebElement selectDateInput = driver.findElement(By.xpath("//*[@id=\"datePickerMonthYearInput\"]"));
        selectDateInput.click();
        Thread.sleep(3000);
        WebElement selectYear = driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[98]"));
        selectYear.click();
        Thread.sleep(3000);
        WebElement selectMonth = driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[3]"));
        selectMonth.click();
        Thread.sleep(3000);
        WebElement selectDay = driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]"));
        selectDay.click();
        Thread.sleep(3000);
        driver.quit();
    }}


