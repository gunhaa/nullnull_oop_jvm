package mynote.inheritance;

public class MyStringFilterEx extends MyStringFilter {
    MyStringFilterEx(String param) {
        super(param);
    }

    MyStringFilterEx(int param) {
        super(param);
    }

    MyStringFilterEx(MyStringFilter rhs) {
        super(rhs);
    }

    public MyStringFilterEx() {
        super();
    }

    // 확장성을 고려한 프레임워크의 기본 설계 방식/ 일반적으로 템플릿 메서드로 사용
    @Override
    protected String onSetString(String outerParam) {
        if(outerParam.equals("DOG")) {
            return "BABY";
        }
        return outerParam;
    }

    public static void main(String[] args) {
        MyStringFilter str = new MyStringFilterEx();
        str.setString("DOG");
        System.out.println(str.getString());

//        MyStringFilterEx str2 = new MyStringFilterEx();
//        str2.setString("DOG2");
//        System.out.println(str2.getString());
    }
}
