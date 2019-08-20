package hw5;

import hw5.SimpleCompareTest.HomePage;
import hw5.SimpleCompareTest.UserPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.System.setProperty;
import static org.testng.AssertJUnit.assertEquals;

public class SimpleCompareTestPageObject {

    private WebDriver driver;
    private HomePage homePage;
    private UserPage userPage;

    @BeforeClass
    public void beforeClass(){
        setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = PageFactory.initElements(driver, HomePage.class);
        userPage = PageFactory.initElements(driver, UserPage.class);
    }


    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        driver.close();
    }


    @Test
    public void openTestSite()
    {
        //Open test site by URL
        driver.get("https://epam.github.io/JDI/index.html");


        //Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");


        //Perform login
        homePage.login("epam", "1234");


        //Assert User name in the left-top side of screen that user is loggined
        assertEquals(userPage.getLoggedUser(), "PITER CHAILOVSKII");


        //Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");


        //Assert that there are 4 items on the header section are displayed and they have proper texts
        assertEquals(userPage.fourItems(0), "HOME");
        assertEquals(userPage.fourItems(1), "CONTACT FORM");
        assertEquals(userPage.fourItems(2), "SERVICE");
        assertEquals(userPage.getMetals(), "METALS & COLORS");


        //Assert that there are 4 images on the Index Page and they are displayed
        userPage.fourImages();


        //Assert that there are 4 texts on the Index Page under icons and they have proper text
        assertEquals(userPage.fourTexts(1), "To include good practices\nand ideas from successful\nEPAM project");
        assertEquals(userPage.fourTexts(2), "To be flexible and\ncustomizable");
        assertEquals(userPage.fourTexts(3), "To be multiplatform");
        assertEquals(userPage.fourTexts(4), "Already have good base\n(about 20 internal and\nsome external projects),\nwish to get more…");


        //Assert a text of the main headers
        assertEquals(userPage.textsOfTheMainHeaders(1), "EPAM FRAMEWORK WISHES…");
        assertEquals(userPage.textsOfTheMainHeaders(2), "LOREM IPSUM DOLOR SIT AMET, CONSECTETUR ADIPISICING ELIT, SED DO EIUSMOD TEMPOR INCIDIDUNT UT LABORE ET DOLORE MAGNA ALIQUA. UT ENIM AD MINIM VENIAM, QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS NISI UT ALIQUIP EX EA COMMODO CONSEQUAT DUIS AUTE IRURE DOLOR IN REPREHENDERIT IN VOLUPTATE VELIT ESSE CILLUM DOLORE EU FUGIAT NULLA PARIATUR.");


        //Assert that there is the iframe in the center of page
        userPage.iframeInTheCenter();


        //Switch to the iframe and check that there is Epam logo in the left top conner of iframe
        driver.switchTo().frame(userPage.switchToTheIframe());
        userPage.checkEpamLogoIframe();


        //Switch to original window back
        driver.switchTo().defaultContent();


        //Assert that JDI GITHUB is a link and has a proper URL
        assertEquals(driver.getCurrentUrl(), "https://epam.github.io/JDI/index.html");


        //Assert that there is Left Section
        userPage.LeftSection();


        //Assert that there is Footer
        userPage.thereIsFooter();
    }
}
