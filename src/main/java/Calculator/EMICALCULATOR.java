package Calculator;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static graphql.introspection.IntrospectionQueryBuilder.build;

public class EMICALCULATOR {
@Test
    public void calculateLoanEMI() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
driver.get("https://emicalculator.net/");
driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement loanSlideCricle = driver.findElement(By.cssSelector("#loanamountslider>span"));
        WebElement IntrestSlideCricle = driver.findElement(By.cssSelector("#loaninterestslider>span"));
        WebElement tenureSlideCricle = driver.findElement(By.cssSelector("#loantermslider>span"));

        actions.dragAndDropBy(loanSlideCricle,321,0).build().perform();
Thread.sleep(1000);
        actions.dragAndDropBy(IntrestSlideCricle,256,0).build().perform();
        Thread.sleep(1000);
        actions.dragAndDropBy(tenureSlideCricle,-215,0).build().perform();
        Thread.sleep(1000);
WebElement loanEMIText =driver.findElement(By.cssSelector("#emiamount >p >span"));
String LoanEMIText = loanEMIText.getText();

    JavascriptExecutor jse = (JavascriptExecutor)  driver;
    jse.executeScript("window.scroll(0,4800)");
    Thread.sleep(1000);
    jse.executeScript("window.scroll(0,-4800)");
driver.findElement(By.xpath("//*[@id=\"menu-item-dropdown-2696\"]")).click();
    Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"menu-item-4448\"]/a")).click();
    Thread.sleep(1000);

driver.switchTo().newWindow(WindowType.TAB);
driver.get("https://emicalculator.net/loan-emi-calculation-work/");
    Thread.sleep(2000);

driver.quit();
    }

}
