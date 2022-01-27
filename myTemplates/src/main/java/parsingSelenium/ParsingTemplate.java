package parsingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParsingTemplate {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files\\JetBrains\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hh.ru/");
        WebElement element = driver.findElement(By.xpath("//div[@data-page-analytics-experiment-event='vacancy_search_region']"));
        element.click();
        Thread.sleep(3000);
        WebElement input = driver.findElement(By.xpath("//input[@data-qa='area-search-input']"));
        String inputTown = "Тарко-Сале";
        input.sendKeys(inputTown);
        input.submit();
    }
}
