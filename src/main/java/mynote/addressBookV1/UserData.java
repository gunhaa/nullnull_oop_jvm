package mynote.addressBookV1;

public class UserData {
    private String name;
    private String phone;
    private UserData next;

    public UserData(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public UserData getNextUserData() {
        return this.next;
    }

    public String getName(){
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setNextUserData(UserData next) {
        this.next = next;
    }
}
