package hw2.ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.System.setProperty;
import static org.testng.AssertJUnit.assertEquals;

public class assertingTextsDataProvider {

    @DataProvider(parallel = true)
    public Object[][] simpleDataProvider(){
        return new Object[][] {
                {"To include good practices\nand ideas from successful\nEPAM project", 1},
                {"To be flexible and\ncustomizable", 2},
                {"To be multiplatform", 3},
                {"Already have good base\n(about 20 internal and\nsome external projects),\nwish to get more…", 4}
        };
    }


    @Test(dataProvider = "simpleDataProvider")
    public void openTestSite(String string, int number) {

        //Init driver
        setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //Open test site by URL
        driver.navigate().to("https://epam.github.io/JDI/index.html");


        //Assert that there are 4 texts on the Index Page under icons and they have proper text
        if(number == 1)
            assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[1]/div/span")).getText(), string);
        else if (number == 2)
            assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[2]/div/span")).getText(), string);
        else if (number == 3)
            assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[3]/div/span")).getText(), string);
        else
            assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/div/div[4]/div/span")).getText(), string);


        //Close driver
        driver.close();
    }
}
