package mynote.addressBookV3.linkedList;

// 해당 클래스는 ADT가 된다
public abstract class MyNode {

    protected MyNode next;

    public abstract MyNode getNext();
    public abstract String getKey();
    public abstract MyNode getNode();
    public abstract void setNextUserData(MyNode next);
}
