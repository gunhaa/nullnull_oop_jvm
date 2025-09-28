package mynote.addressBookV3;

import mynote.addressBookV3.linkedList.MyList;
import mynote.addressBookV3.linkedList.MyListEx;
import mynote.addressBookV3.linkedList.UserData;

public class Main {
    public static void main(String[] args) {
        UserData data = new UserData("Dummy", "Dummy");
        MyList db = new MyListEx(data);
        UserInterface ui = new UserInterface(db);
        ui.run();
    }
}
