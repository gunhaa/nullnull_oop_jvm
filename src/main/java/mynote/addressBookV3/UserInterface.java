package mynote.addressBookV3;

import mynote.addressBookV3.iterator.MyIterator;
import mynote.addressBookV3.linkedList.MyList;
import mynote.addressBookV3.linkedList.MyNode;
import mynote.addressBookV3.linkedList.UserData;

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

        MyNode user = this.myList.findNode(name);
        if (user != null) {
            System.out.println("Name: " + user.getKey());
            System.out.println("Phone: " + ((UserData)user).getPhone());
        } else {
            System.out.println("Error: Failed to find " + name);
        }
    }

    // iterator를 이용한 print로 리팩토링
    private void printAll() {
        MyIterator myIterator = this.myList.getIterator();

        while(myIterator.hasNext()) {
            MyNode next = myIterator.next();
            System.out.println(next.getKey() + "\t" + ((UserData)next).getPhone());
        }
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
