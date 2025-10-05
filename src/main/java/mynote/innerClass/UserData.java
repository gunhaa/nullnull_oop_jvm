package mynote.innerClass;

// Outer class
public class UserData {

    private String name;
    private Address info;

    UserData(String name, String addr, String phone){
        this.name = name;
        this.info = new Address(addr, phone);
        System.out.println("UserData()");
    }

    public Address getInfo(){
        return info;
    }

    class Address {
        private String addr;
        private String phone;

        Address(String addr, String phone) {
            this.addr = addr;
            this.phone = phone;
            System.out.println("Address()");
        }

        public String getUserData() {
            return UserData.this.name + ", " + this.addr + ", " + this.phone;
        }
    }

    public static void main(String[] args) {
        UserData userData = new UserData("name", "addr", "phone");
        System.out.println(userData.getInfo().getUserData());

        UserData.Address addr = userData.new Address("addr2", "phone2");
        System.out.println(addr.getUserData());
    }
}
