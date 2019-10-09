package hw7.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.ui.html.complex.Menu;
import hw7.entities.MenuOptions;

public class JdiUserPage extends WebPage {

    @FindBy(xpath = "/html/body/header/div/nav/ul[1]")
    public Menu headerMenu;

    public void openMetalsAndColorsPage(MenuOptions option){
        headerMenu.select(option.getMenuOption());
    }

}
