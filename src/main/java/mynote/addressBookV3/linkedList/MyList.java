package mynote.addressBookV3.linkedList;

import mynote.addressBookV3.iterator.MyIterator;

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
                onRemove(toDelete);
                prev.setNextUserData(toDelete.getNext());
                return true;
            }

            prev = prev.getNext();
        }
        return false;
    }

    protected void onRemove(MyNode toDelete) {}

    // iterator로 내보낼 수 있도록 리팩토링
    public MyIterator getIterator() {
        MyIterator iterator = new MyIterator(this.head);
        return iterator;
    }
}
