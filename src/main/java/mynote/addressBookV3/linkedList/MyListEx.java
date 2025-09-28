package mynote.addressBookV3.linkedList;

public class MyListEx extends MyList{

    public MyListEx(MyNode data) {
        super(data);
    }

    @Override
    public void onRemove(MyNode toDelete) {
        System.out.println("삭제할 Key: " + toDelete.getKey());
        System.out.println("Remove에 대한 myListEx에 의한 확장성 검증");
    }
}
