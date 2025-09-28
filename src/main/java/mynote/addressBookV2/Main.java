package mynote.addressBookV2;

import mynote.addressBookV2.linkedList.MyList;
import mynote.addressBookV2.linkedList.UserData;

public class Main {
    public static void main(String[] args) {
        UserData data = new UserData("Dummy", "Dummy");
        MyList db = new MyList(data);
        UserInterface ui = new UserInterface(db);
        ui.run();
    }
}
