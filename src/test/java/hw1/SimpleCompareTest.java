package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.System.setProperty;
import static org.testng.AssertJUnit.assertEquals;

public class SimpleCompareTest {

    @Test
    public void openTestSite()
    {
        //Init driver
        setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //1 Open test site by URL
        driver.navigate().to("https://epam.github.io/JDI/index.html");


        //2 Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");


        //3 Perform login
        driver.findElement(By.cssSelector(".profile-photo")).click();
        driver.findElement(By.id("name")).sendKeys("epam");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.id("login-button")).click();


        //4 Assert User name in the left-top side of screen that user is loggined
        assertEquals(driver.findElement(By.id("user-name")).getText(), "PITER CHAILOVSKII");


        //5 Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");


        //6 Assert that there are 4 items on the header section are displayed and they have proper texts
        List<WebElement> elements = driver.findElements(By.tagName("li"));
        assertEquals(elements.get(0).getText(), "HOME");
        assertEquals(elements.get(1).getText(), "CONTACT FORM");
        assertEquals(elements.get(2).getText(), "SERVICE");
        assertEquals(driver.findElement(By.xpath("/html/body/header/div/nav/ul[1]/li[4]/a")).getText(), "METALS & COLORS");


        //7 Assert that there are 4 images on the Index Page and they are displayed
        driver.findElement(By.className("icon-practise")).isDisplayed();
        driver.findElement(By.className("icon-custom")).isDisplayed();
        driver.findElement(By.className("icon-multi")).isDisplayed();
        driver.findElement(By.className("icon-base")).isDisplayed();


        //8 Assert that there are 4 texts on the Index Page under icons and they have proper text
        assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[1]/div/span")).getText(), "To include good practices\nand ideas from successful\nEPAM project");
        assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[2]/div/span")).getText(), "To be flexible and\ncustomizable");
        assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[3]/div/span")).getText(), "To be multiplatform");
        assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[4]/div/span")).getText(), "Already have good base\n(about 20 internal and\nsome external projects),\nwish to get more…");


        //9 Assert a text of the main headers
        assertEquals(driver.findElement(By.name("main-title")).getText(), "EPAM FRAMEWORK WISHES…");
        assertEquals(driver.findElement(By.name("jdi-text")).getText(), "LOREM IPSUM DOLOR SIT AMET, CONSECTETUR ADIPISICING ELIT, SED DO EIUSMOD TEMPOR INCIDIDUNT UT LABORE ET DOLORE MAGNA ALIQUA. UT ENIM AD MINIM VENIAM, QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS NISI UT ALIQUIP EX EA COMMODO CONSEQUAT DUIS AUTE IRURE DOLOR IN REPREHENDERIT IN VOLUPTATE VELIT ESSE CILLUM DOLORE EU FUGIAT NULLA PARIATUR.");


        //10 Assert that there is the iframe in the center of page
        driver.findElement(By.id("iframe")).isDisplayed();


        //11 Switch to the iframe and check that there is Epam logo in the left top conner of iframe
        WebElement elementFrame = driver.findElement(By.id("iframe"));
        driver.switchTo().frame(elementFrame);
        driver.findElement(By.id("epam_logo")).isDisplayed();


        //12 Switch to original window back
        driver.switchTo().defaultContent();


        //13 Assert that JDI GITHUB is a link and has a proper URL
        assertEquals(driver.getCurrentUrl(), "https://epam.github.io/JDI/index.html");


        //14 Assert that there is Left Section
        driver.findElement(By.id("mCSB_1")).isDisplayed();


        //15 Assert that there is Footer
        driver.findElement(By.className("footer-bg")).isDisplayed();


        //16 Close driver
        driver.close();
    }
}
