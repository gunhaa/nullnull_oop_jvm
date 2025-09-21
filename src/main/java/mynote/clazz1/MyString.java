package mynote.clazz1;

import java.nio.charset.StandardCharsets;

public class MyString {
    private byte[] string = null;

    public String getString() {
        if(this.string == null) {
            return "(null)";
        }
        return new String(this.string);
    }

    public void setString(String param) {
//        this.string = param.getBytes(StandardCharsets.UTF_8);
        // 참조자를 넘기지않고, 복사해서 넘기는 것이 정확한 표현이다
        this.string = param.getBytes(StandardCharsets.UTF_8).clone();
    }

    public int length() {
        if(this.string == null) {
            return 0;
        }
//        String parsedString = new String(this.string);
//        return parsedString.length();
        return this.string.length;
    }

    public int compareTo(String param) {
        if(this.string == null) {
            return -1;
        }
        String parsedString = new String(this.string);
        return parsedString.compareTo(param);
    }

    public static void main(String[] args) {
        MyString str = new MyString();
        System.out.println(str.length());
        System.out.println(str.getString());

        str.setString("Hello Java");
        System.out.println(str.getString());
        System.out.println(str.length());
        System.out.println(str.compareTo("Hello Java"));
    }
}
