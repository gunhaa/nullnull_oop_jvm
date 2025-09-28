package mynote.addressBookV1;
import java.util.LinkedList;
import java.util.List;

public class MyList {

    private UserData head;

    public MyList() {
        this.head = new UserData("Dummy", "Dummy");
    }

    public UserData findNode(String name) {
        UserData tmp = head.getNextUserData();
        while(tmp != null) {
            if(tmp.getName().compareTo(name) == 0) {
                return tmp;
            }
            tmp = tmp.getNextUserData();
        }
        return null;
    }

    public boolean addNewNode(String name, String phone) {
        if(findNode(name) != null) {
            return false;
        }

        UserData newUser = new UserData(name, phone);
        newUser.setNextUserData(head.getNextUserData());
        head.setNextUserData(newUser);

        return true;
    }

    public boolean removeNode(String name) {
        UserData prev = head;
        UserData toDelete = null;

        while(prev.getNextUserData() != null) {
            toDelete = prev.getNextUserData();

            if(toDelete.getName().compareTo(name) == 0) {
                prev.setNextUserData(toDelete.getNextUserData());
                return true;
            }

            prev = prev.getNextUserData();
        }
        return false;
    }

    public List<UserData> getAllUserData() {
        UserData tmp = head.getNextUserData();

        List<UserData> resultList = new LinkedList<>();
        while(tmp != null) {
            resultList.add(tmp);
            tmp = tmp.getNextUserData();
        }

        return resultList;
    }
}
