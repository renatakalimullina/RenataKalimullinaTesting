package hw5.enums;

public enum LogRow {

    WINDtrue(" Wind: condition changed to true"),
    WATERtrue(" Water: condition changed to true"),

    WINDfalse(" Wind: condition changed to false"),
    WATERfalse(" Water: condition changed to false"),

    SELENtrue(" metal: value changed to Selen"),

    DROPDOWNyellow(" Colors: value changed to Yellow");

    public String statusOfButton;

    LogRow(String string){
        this.statusOfButton = string;
    }

    public String getStatusOfButton(){
        return this.statusOfButton;
    }
}
