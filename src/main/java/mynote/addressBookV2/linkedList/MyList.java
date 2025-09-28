package mynote.addressBookV2.linkedList;

import java.util.LinkedList;
import java.util.List;

public class MyList {

    private MyNode head;

    public MyList(MyNode data) {
        this.head = data;
    }

    public MyNode findNode(String name) {
        MyNode tmp = head.getNext();
        while(tmp != null) {
            if(tmp.getKey().compareTo(name) == 0) {
                return tmp;
            }
            tmp = tmp.getNext();
        }
        return null;
    }

    public boolean addNewNode(String name, String phone) {
        if(findNode(name) != null) {
            return false;
        }

        UserData newUser = new UserData(name, phone);
        newUser.setNextUserData(head.getNext());
        head.setNextUserData(newUser);

        return true;
    }

    public boolean removeNode(String name) {
        MyNode prev = head;
        MyNode toDelete = null;

        while(prev.getNext() != null) {
            toDelete = prev.getNext();

            if(toDelete.getKey().compareTo(name) == 0) {
                UserData castingPrev = (UserData) prev;
                castingPrev.setNextUserData(toDelete.getNext());
                return true;
            }

            prev = prev.getNext();
        }
        return false;
    }

    public List<MyNode> getAllUserData() {
        MyNode tmp = head.getNext();

        List<MyNode> resultList = new LinkedList<>();
        while(tmp != null) {
            resultList.add(tmp);
            tmp = tmp.getNext();
        }

        return resultList;
    }
}
