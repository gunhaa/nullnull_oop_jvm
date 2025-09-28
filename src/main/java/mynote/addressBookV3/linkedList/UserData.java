package mynote.addressBookV3.linkedList;

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

    @Override
    public UserData getNode() {
        // 참조 문제를 방지하기 위한 새 객체 반환
        // dto 사용 필요
        return new UserData(this.name, this.phone);
    }

    public String getPhone() {
        return this.phone;
    }

    @Override
    public void setNextUserData(MyNode next) {
        this.next = next;
    }
}
