package mynote.inheritance;

import java.nio.charset.StandardCharsets;

public class MyStringFilter {
    private byte[] string = null;
    private static int instanceCount = 0;

    MyStringFilter() {
    }

    MyStringFilter(String param) {
        this.string = String.format("%s", param).getBytes(StandardCharsets.UTF_8);
    }

    MyStringFilter(int param) {
        this.string = String.format("%d", param).getBytes(StandardCharsets.UTF_8);
    }

    // 복사 생성자
    MyStringFilter(MyStringFilter rhs) {
        byte[] deepCopy = rhs.string.clone();
        this.string = deepCopy;
    }

    String getString() {
        if (this.string == null) {
            return "(null)";
        }
        return new String(this.string);
    }

    void setString(String param) {
        String result = onSetString(param);
        changeStatus(result);
    }

    protected void changeStatus(String param) {
        this.string = param.getBytes(StandardCharsets.UTF_8).clone();
    }

    protected String onSetString(String outerParam) {
        return outerParam;
    }

    static MyStringFilter newString(int param) {
        instanceCount++;
        return new MyStringFilter(param);
    }

    static MyStringFilter newString(String param) {
        instanceCount++;
        return new MyStringFilter(param);
    }

    static int getCount() {
        return MyStringFilter.instanceCount;
    }
}
