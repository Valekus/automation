package LR_1_HW;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JiraLoginTest {
@Test
    public  void JiraLoginTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\server\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);

    driver.get("http://jira.hillel.it:8080/login.jsp");
    loginPage.enterUserName("webinar5");
    loginPage.enterPassword("webinar5");
    loginPage.clickSendButton();

}
}
