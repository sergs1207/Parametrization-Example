package pack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class LoginTest {
               
                private WebDriver driver;
               
                @BeforeClass
                public void setup (){
                                System.setProperty("webdriver.chrome.driver",
                                                                "D://git//Parametrization-Example//b//drivers//chromedriver.exe");
                                driver = new ChromeDriver();
                               
                }
               
                @AfterClass
                public void exitBrowser(){
                                driver.close();
                }
               
                @Test
                public void loadPage(){
                                driver.get("http://www.facebook.com");
                                Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
                               
                }
                @Test(dependsOnMethods = "loadPage")
                public void setLogin(){
                                String email = "johnsmithvc@yandex.ru";
                                WebElement setLogin = driver.findElement(By.cssSelector("#email"));
                                setLogin.sendKeys(email);
                                Assert.assertEquals(setLogin.getAttribute("value"), email);
                }
               
                @Test(dependsOnMethods = "setLogin")
                public void setPassword(){
                                String password = "myPassword123";
                                WebElement setpassword= driver.findElement(By.cssSelector("#pass"));
                                setpassword.sendKeys(password);
                                Assert.assertEquals(setpassword.getAttribute("value"), password);
                }
 
}