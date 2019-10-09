package hw7.entities;

public enum MenuOptions {

    HOME("HOME"), CONTACT_FORM("CONTACT FORM"), SERVICE("SERVICE"), METALS_AND_COLORS("METALS & COLORS");


    public String menuOption;

    MenuOptions(String menuOption) {
        this.menuOption = menuOption;
    }

    public String getMenuOption(){
        return menuOption;
    }

}
