package hw4.enums;

public enum HomePage {

    HOME_PAGE("Home Page");

    public String titleName;

    HomePage(String titleName){
        this.titleName = titleName;
    }

    public String getTitleName() {
        return titleName;
    }
}
