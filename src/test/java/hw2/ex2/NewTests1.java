package hw2.ex2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.System.setProperty;
import static org.testng.AssertJUnit.assertEquals;

public class NewTests1 {

    @Test(groups = {"Smoke"})
    public void openTestSite1()
    {
        //Init driver
        setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //Open test site by URL
        driver.navigate().to("https://epam.github.io/JDI/index.html");


        //Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");


        //Perform login
        driver.findElement(By.cssSelector(".profile-photo")).click();
        driver.findElement(By.id("name")).sendKeys("epam");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.id("login-button")).click();


        //Assert User name in the left-top side of screen that user is loggined
        assertEquals(driver.findElement(By.id("user-name")).getText(), "PITER CHAILOVSKII");


        //Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");


        //Assert that there are 4 items on the header section are displayed and they have proper texts
        List<WebElement> elements = driver.findElements(By.tagName("li"));
        assertEquals(elements.get(0).getText(), "HOME");
        assertEquals(elements.get(1).getText(), "CONTACT FORM");
        assertEquals(elements.get(2).getText(), "SERVICE");
        assertEquals(driver.findElement(By.xpath("/html/body/header/div/nav/ul[1]/li[4]/a")).getText(), "METALS & COLORS");


        //Assert that there are 4 images on the Index Page and they are displayed
        driver.findElement(By.className("icon-practise")).isDisplayed();
        driver.findElement(By.className("icon-custom")).isDisplayed();
        driver.findElement(By.className("icon-multi")).isDisplayed();
        driver.findElement(By.className("icon-base")).isDisplayed();


        //Assert that there are 4 texts on the Index Page under icons and they have proper text
        assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[1]/div/span")).getText(), "To include good practices\nand ideas from successful\nEPAM project");
        assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[2]/div/span")).getText(), "To be flexible and\ncustomizable");
        assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[3]/div/span")).getText(), "To be multiplatform");
        assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[4]/div/span")).getText(), "Already have good base\n(about 20 internal and\nsome external projects),\nwish to get more…");


        //Assert a text of the main headers
        assertEquals(driver.findElement(By.name("main-title")).getText(), "EPAM FRAMEWORK WISHES…");
        assertEquals(driver.findElement(By.name("jdi-text")).getText(), "LOREM IPSUM DOLOR SIT AMET, CONSECTETUR ADIPISICING ELIT, SED DO EIUSMOD TEMPOR INCIDIDUNT UT LABORE ET DOLORE MAGNA ALIQUA. UT ENIM AD MINIM VENIAM, QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS NISI UT ALIQUIP EX EA COMMODO CONSEQUAT DUIS AUTE IRURE DOLOR IN REPREHENDERIT IN VOLUPTATE VELIT ESSE CILLUM DOLORE EU FUGIAT NULLA PARIATUR.");


        //Assert that there is the iframe in the center of page
        driver.findElement(By.id("iframe")).isDisplayed();


        //Switch to the iframe and check that there is Epam logo in the left top conner of iframe
        WebElement elementFrame = driver.findElement(By.id("iframe"));
        driver.switchTo().frame(elementFrame);
        driver.findElement(By.id("epam_logo")).isDisplayed();


        //Switch to original window back
        driver.switchTo().defaultContent();


        //Assert that JDI GITHUB is a link and has a proper URL
        assertEquals(driver.getCurrentUrl(), "https://epam.github.io/JDI/index.html");


        //Assert that there is Left Section
        driver.findElement(By.id("mCSB_1")).isDisplayed();


        //Assert that there is Footer
        driver.findElement(By.className("footer-bg")).isDisplayed();


        //Close driver
        driver.close();
    }

    @Test(groups = {"Smoke"})
    public void openTestSite2()
    {
        //Init driver
        setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //Open test site by URL
        driver.navigate().to("https://epam.github.io/JDI/index.html");


        //Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");


        //Perform login
        driver.findElement(By.cssSelector(".profile-photo")).click();
        driver.findElement(By.id("name")).sendKeys("epam");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.id("login-button")).click();


        //Assert User name in the left-top side of screen that user is loggined
        assertEquals(driver.findElement(By.id("user-name")).getText(), "PITER CHAILOVSKII");


        //Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");


        //Assert that there are 4 items on the header section are displayed and they have proper texts
        List<WebElement> elements = driver.findElements(By.tagName("li"));
        assertEquals(elements.get(0).getText(), "HOME");
        assertEquals(elements.get(1).getText(), "CONTACT FORM");
        assertEquals(elements.get(2).getText(), "SERVICE");
        assertEquals(driver.findElement(By.xpath("/html/body/header/div/nav/ul[1]/li[4]/a")).getText(), "METALS & COLORS");


        //Assert that there are 4 images on the Index Page and they are displayed
        driver.findElement(By.className("icon-practise")).isDisplayed();
        driver.findElement(By.className("icon-custom")).isDisplayed();
        driver.findElement(By.className("icon-multi")).isDisplayed();
        driver.findElement(By.className("icon-base")).isDisplayed();


        //Assert that there are 4 texts on the Index Page under icons and they have proper text
        assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[1]/div/span")).getText(), "To include good practices\nand ideas from successful\nEPAM project");
        assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[2]/div/span")).getText(), "To be flexible and\ncustomizable");
        assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[3]/div/span")).getText(), "To be multiplatform");
        assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[4]/div/span")).getText(), "Already have good base\n(about 20 internal and\nsome external projects),\nwish to get more…");


        //Assert a text of the main headers
        assertEquals(driver.findElement(By.name("main-title")).getText(), "EPAM FRAMEWORK WISHES…");
        assertEquals(driver.findElement(By.name("jdi-text")).getText(), "LOREM IPSUM DOLOR SIT AMET, CONSECTETUR ADIPISICING ELIT, SED DO EIUSMOD TEMPOR INCIDIDUNT UT LABORE ET DOLORE MAGNA ALIQUA. UT ENIM AD MINIM VENIAM, QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS NISI UT ALIQUIP EX EA COMMODO CONSEQUAT DUIS AUTE IRURE DOLOR IN REPREHENDERIT IN VOLUPTATE VELIT ESSE CILLUM DOLORE EU FUGIAT NULLA PARIATUR.");


        //Assert that there is the iframe in the center of page
        driver.findElement(By.id("iframe")).isDisplayed();


        //Switch to the iframe and check that there is Epam logo in the left top conner of iframe
        WebElement elementFrame = driver.findElement(By.id("iframe"));
        driver.switchTo().frame(elementFrame);
        driver.findElement(By.id("epam_logo")).isDisplayed();


        //Switch to original window back
        driver.switchTo().defaultContent();


        //Assert that JDI GITHUB is a link and has a proper URL
        assertEquals(driver.getCurrentUrl(), "https://epam.github.io/JDI/index.html");


        //Assert that there is Left Section
        driver.findElement(By.id("mCSB_1")).isDisplayed();


        //Assert that there is Footer
        driver.findElement(By.className("footer-bg")).isDisplayed();


        //Close driver
        driver.close();
    }

    @Test(groups = {"Smoke"})
    public void openTestSite3()
    {
        //Init driver
        setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //Open test site by URL
        driver.navigate().to("https://epam.github.io/JDI/index.html");


        //Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");


        //Perform login
        driver.findElement(By.cssSelector(".profile-photo")).click();
        driver.findElement(By.id("name")).sendKeys("epam");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.id("login-button")).click();


        //Assert User name in the left-top side of screen that user is loggined
        assertEquals(driver.findElement(By.id("user-name")).getText(), "PITER CHAILOVSKII");


        //Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");


        //Assert that there are 4 items on the header section are displayed and they have proper texts
        List<WebElement> elements = driver.findElements(By.tagName("li"));
        assertEquals(elements.get(0).getText(), "HOME");
        assertEquals(elements.get(1).getText(), "CONTACT FORM");
        assertEquals(elements.get(2).getText(), "SERVICE");
        assertEquals(driver.findElement(By.xpath("/html/body/header/div/nav/ul[1]/li[4]/a")).getText(), "METALS & COLORS");


        //Assert that there are 4 images on the Index Page and they are displayed
        driver.findElement(By.className("icon-practise")).isDisplayed();
        driver.findElement(By.className("icon-custom")).isDisplayed();
        driver.findElement(By.className("icon-multi")).isDisplayed();
        driver.findElement(By.className("icon-base")).isDisplayed();


        //Assert that there are 4 texts on the Index Page under icons and they have proper text
        assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[1]/div/span")).getText(), "To include good practices\nand ideas from successful\nEPAM project");
        assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[2]/div/span")).getText(), "To be flexible and\ncustomizable");
        assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[3]/div/span")).getText(), "To be multiplatform");
        assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[4]/div/span")).getText(), "Already have good base\n(about 20 internal and\nsome external projects),\nwish to get more…");


        //Assert a text of the main headers
        assertEquals(driver.findElement(By.name("main-title")).getText(), "EPAM FRAMEWORK WISHES…");
        assertEquals(driver.findElement(By.name("jdi-text")).getText(), "LOREM IPSUM DOLOR SIT AMET, CONSECTETUR ADIPISICING ELIT, SED DO EIUSMOD TEMPOR INCIDIDUNT UT LABORE ET DOLORE MAGNA ALIQUA. UT ENIM AD MINIM VENIAM, QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS NISI UT ALIQUIP EX EA COMMODO CONSEQUAT DUIS AUTE IRURE DOLOR IN REPREHENDERIT IN VOLUPTATE VELIT ESSE CILLUM DOLORE EU FUGIAT NULLA PARIATUR.");


        //Assert that there is the iframe in the center of page
        driver.findElement(By.id("iframe")).isDisplayed();


        //Switch to the iframe and check that there is Epam logo in the left top conner of iframe
        WebElement elementFrame = driver.findElement(By.id("iframe"));
        driver.switchTo().frame(elementFrame);
        driver.findElement(By.id("epam_logo")).isDisplayed();


        //Switch to original window back
        driver.switchTo().defaultContent();


        //Assert that JDI GITHUB is a link and has a proper URL
        assertEquals(driver.getCurrentUrl(), "https://epam.github.io/JDI/index.html");


        //Assert that there is Left Section
        driver.findElement(By.id("mCSB_1")).isDisplayed();


        //Assert that there is Footer
        driver.findElement(By.className("footer-bg")).isDisplayed();


        //Close driver
        driver.close();
    }
}
