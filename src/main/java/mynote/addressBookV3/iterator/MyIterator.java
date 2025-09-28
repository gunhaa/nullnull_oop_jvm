package mynote.addressBookV3.iterator;

import mynote.addressBookV3.linkedList.MyNode;

public class MyIterator implements Iterator{

    private MyNode data;

    public MyIterator(MyNode data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return data.getNext() != null;
    }

    @Override
    public MyNode next() {
        MyNode next = data.getNext();
        this.data = next;
        return next;
    }

}
