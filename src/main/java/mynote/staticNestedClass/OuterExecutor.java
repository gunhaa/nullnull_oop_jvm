package mynote.staticNestedClass;

public class OuterExecutor {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner();
//        Outer.Inner inner = Outer.new Inner();

    }
}
