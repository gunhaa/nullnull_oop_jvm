package mynote.addressBookV1;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private MyList myList;

    UserInterface(MyList myList) {
        this.myList = myList;
    }

    public void run() {
        int menu;
        while ((menu = printUi()) != 0) {
            switch (menu) {
                case 1:
                    addUser();
                    break;
                case 2:
                    searchUser();
                    break;
                case 3:
                    printAll();
                    break;
                case 4:
                    removeUser();
                    break;
            }
        }
    }

    private int printUi() {
        System.out.println("[1] Add\t[2] Search\t[3] Print all\t[4] Remove\t[0] Exit");
        Scanner s = new Scanner(System.in);
        System.out.println(": ");
        int input = s.nextInt();
        return input;
    }

    private void addUser() {
        Scanner s = new Scanner(System.in);
        System.out.println("Name: ");
        String name = s.nextLine();
        System.out.println("Phone: ");
        String phone = s.nextLine();

        this.myList.addNewNode(name, phone);
    }

    private void searchUser() {
        Scanner s = new Scanner(System.in);
        System.out.println("Name: ");
        String name = s.nextLine();

        UserData user = this.myList.findNode(name);
        if (user != null) {
            System.out.println("Name: " + user.getName());
            System.out.println("Phone: " + user.getPhone());
        } else {
            System.out.println("Error: Failed to find " + name);
        }
    }

    private void printAll() {
        List<UserData> allUserData = this.myList.getAllUserData();
        allUserData.forEach(userData -> {
            System.out.println(userData.getName() + "\t" + userData.getPhone());
        });
    }

    private void removeUser() {
        Scanner s = new Scanner(System.in);
        System.out.println("Name: ");
        String name = s.nextLine();

        if (this.myList.removeNode(name)) {
            System.out.println("Removed!");
        } else {
            System.out.println("Error: Failed to remove" + name);
        }
    }

}
