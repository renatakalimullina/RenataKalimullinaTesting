package hw7;


import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import hw7.pages.JdiHomePage;
import hw7.pages.JdiMetalsAndColorsPage;
import hw7.pages.JdiUserPage;

@JSite("https://epam.github.io/JDI/")
public class JdiSite {

    public static JdiHomePage homePage;
    public static JdiUserPage userPage;
    public static JdiMetalsAndColorsPage metalsAndColorsPage;


    public static void open() {
        homePage.open();
    }

}