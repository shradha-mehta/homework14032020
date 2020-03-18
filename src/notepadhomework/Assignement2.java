package notepadhomework;
/*Navigate to website "https://demo.nopcommerce.com/"
Click on register link.
Fill the all fields.
Click on register button.

 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement2 {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);


        WebElement register =driver.findElement(By.xpath("//div[@class=\"header-upper\"]//a[@class=\"ico-register\"]"));
        register.click();
        Thread.sleep(3000);
        WebElement gender = driver.findElement(By.xpath("//span[@class=\"female\"]"));
        gender.click();
        WebElement firstName = driver.findElement(By.xpath("//div[@class=\"inputs\"]//input[@name=\"FirstName\"]"));
        firstName.sendKeys("shradha");
        WebElement lastName = driver.findElement(By.xpath("//div[@class=\"inputs\"]//input[@name=\"LastName\"]"));
        lastName.sendKeys("Mehta");
        WebElement date =driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
        date.sendKeys("23");
        WebElement month =driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
        month.sendKeys("3");
        WebElement year=driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
        year.sendKeys("1974");
        WebElement email =driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("shradhajiya@gmail.com");
        WebElement company =driver.findElement(By.xpath("//input[@id='Company']"));
        company.sendKeys("Mehta Ltd");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("jiya0804");
        WebElement confirmpassword =driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
        confirmpassword.sendKeys("jiya0804");
        WebElement registerbutton = driver.findElement(By.xpath("//input[@id='register-button']"));
        registerbutton.click();

    }

}
