import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Automatic_Login {
    public static void main(String[] args) {
        //inititate the browser that you want to use... Tutorial uses HtmlUnitDriver as it is GUI less web browser and works without any on screen interference.
        org.openqa.selenium.WebDriver driver = new HtmlUnitDriver();
        //other drivers are: Firefox Driver, ChromeDriver...
        
        //Getting the connection of the website
        String url = "http://mywebpage.com"; //URL of target website
        driver.get(url); //getting connection of the target URL
        
        //finding login elements of the webpage
        WebElement id = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement submit = driver.findElement(By.name("btnSubmit"));
        
        //fill up the login form using sendKeys method
        id.sendKeys("your_username"); //enters the username in username field
        password.sendKeys("your_password"); //enters the password in password field
        submit.click(); //clicks on the submit button
        
        driver.close(); //closes the web browser
    }
}
