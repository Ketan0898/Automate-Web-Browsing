import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class WebDriver {
    public static void main(String[] args) {
        org.openqa.selenium.WebDriver driver = new HtmlUnitDriver();
        String url = "http://172.16.0.1:8090";
        driver.get(url);
        String title = driver.getTitle();
        WebElement id = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement submit = driver.findElement(By.name("btnSubmit"));
        id.sendKeys("11710383");
        password.sendKeys("5710");
        submit.click();
        driver.close();
    }
}
