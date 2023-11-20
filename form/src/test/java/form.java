import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class form {
    @Test
    public void formTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\bybal\\GEMS\\AccordionTest\\AccordionTest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        // Нажать на кнопку “Start”
        WebElement name = driver.findElement(By.id("firstName"));
        name.sendKeys("Nikita");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Kruglov");
        WebElement mail = driver.findElement(By.id("userEmail"));
        mail.sendKeys("Bybalesh234@gmail.com");
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"gender-radio-1\"]"));
        gender.click();
        //Thread.sleep(3000);
        WebElement userNumber = driver.findElement(By.id("userNumber"));
        userNumber.sendKeys("1234567890");

        WebElement selectDateInput = driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]"));
        selectDateInput.click();
        WebElement selectYear = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[98]"));
        selectYear.click();
        WebElement selectMonth = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[3]"));
        selectMonth.click();
        WebElement selectDay = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]"));
        selectDay.click();


        WebElement subjects = driver.findElement(By.id("subjectsInput"));
        subjects.sendKeys("all subjects");

        WebElement hobbies = driver.findElement(By.xpath("//*[@id=\"hobbies-checkbox-2\"]"));
        hobbies.click();
        Thread.sleep(3000);
        WebElement chooseFileButton = driver.findElement(By.id("uploadPicture"));
        chooseFileButton.sendKeys("D:\\bybal\\GEMS\\AccordionTest\\AccordionTest\\1.jpg"); // путь к изображению
        WebElement adress = driver.findElement(By.id("currentAddress"));
        adress.sendKeys("jvsr");

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submit.click();
        Thread.sleep(3000);

// Получение значений из модального окна и сравнение с введенными значениями
        String modalFirstName = driver.findElement(By.id("example-modal-sizes-title-lg")).getText();
        String modalLastName = driver.findElement(By.id("firstName-text")).getText();
        String modalEmail = driver.findElement(By.id("userEmail-text")).getText();

        // Assert для сопоставления значений
        assert modalFirstName.equals("Thanks for submitting the form");
        assert modalLastName.equals("Nikita Kruglov");
        assert modalEmail.equals("Bybalesh234@gmail.com");

        driver.quit();

    }}


