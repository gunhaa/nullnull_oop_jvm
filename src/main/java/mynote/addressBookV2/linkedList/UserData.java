package mynote.addressBookV2.linkedList;

public class UserData extends MyNode {
    private String name;
    private String phone;

    public UserData(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public MyNode getNext() {
        return this.next;
    }

    @Override
    public String getKey(){
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    @Override
    public void setNextUserData(MyNode next) {
        this.next = next;
    }
}
