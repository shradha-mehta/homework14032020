package teamframework;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigateToRegisterPageFail {
    WebDriver driver;
    @Before
    public  void  openBroswer(){
        String baseurl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);

    }
    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully(){
        WebElement register = driver.findElement(By.xpath("//a[@class=\"ico-register\"]"));
        register.click();
        WebElement welcometext = driver.findElement(By.xpath("//strong[contains(text(),'Your Personal Details')]"));
        String expectedText = " Enter Your Personal Details";
        String actualText =welcometext.getText();
        Assert.assertEquals(expectedText,actualText);
    }
}
