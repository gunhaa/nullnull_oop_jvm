package mynote.clazz2;

import java.nio.charset.StandardCharsets;

public class MyString {
    private byte[] string = null;
    private static int instanceCount = 0;

    private MyString(){};

    MyString(String param) {
        this.string = String.format("%s", param).getBytes(StandardCharsets.UTF_8);
    }

    MyString(int param) {
//        this.string = Integer.toString(param).getBytes(StandardCharsets.UTF_8);
        this.string = String.format("%d", param).getBytes(StandardCharsets.UTF_8);
    }
    
    // 복사 생성자
    MyString(MyString rhs) {
//        String deepCopyStr = new String(rhs.string);
//        this.string = deepCopyStr.getBytes(StandardCharsets.UTF_8);

        byte[] deepCopy = rhs.string.clone();
        this.string = deepCopy;
    }

    String getString() {
        if(this.string == null) {
            return "(null)";
        }
        return new String(this.string);
    }

    void setString(String param) {
        this.string = param.getBytes().clone();
    }

    static MyString newString(int param) {
        instanceCount++;
        return new MyString(param);
    }

    static MyString newString(String param) {
        instanceCount++;
        return new MyString(param);
    }

    static int getCount() {
        return MyString.instanceCount;
    }

    public static void main(String[] args) {
//        MyString str1 = new MyString("Test");
//        System.out.println(str1.getString());
//        MyString str2 = new MyString(512);
//        System.out.println(str2.getString());


//        MyString src = new MyString("Hello");
//        MyString dst = new MyString(src);
//
//        src.setString("World");
//        System.out.println(dst.getString());

        MyString s1 = MyString.newString(10);
        MyString s2 = MyString.newString("test");
        System.out.println(s1.getString());
        System.out.println(s2.getString());
        System.out.println(MyString.getCount());
    }
}
